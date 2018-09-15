/*
 * Copyright 2018 Manuel Wrage
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ivianuu.androidktx.core.widget

import android.graphics.PorterDuff
import android.text.Editable
import android.text.TextWatcher
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.ivianuu.androidktx.core.graphics.drawable.tint
import com.ivianuu.androidktx.core.graphics.drawable.tintMode
import com.ivianuu.androidktx.core.view.color
import com.ivianuu.androidktx.internal.NO_GETTER
import com.ivianuu.androidktx.internal.field
import com.ivianuu.androidktx.internal.noGetter
import java.lang.reflect.Field

// todo fix on android pie
var TextView.cursorColor: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) {
        try {
            val fCursorDrawableRes = TextView::class.field("mCursorDrawableRes")
            val mCursorDrawableRes = fCursorDrawableRes.getInt(this)
            val fEditor = TextView::class.field("mEditor")
            val editor = fEditor.get(this)
            val clazz = editor.javaClass
            val fCursorDrawable = clazz.field("mCursorDrawable")

            val drawables = arrayOf(
                ContextCompat.getDrawable(context, mCursorDrawableRes)?.apply { tint = value },
                ContextCompat.getDrawable(context, mCursorDrawableRes)?.apply { tint = value }
            )

            fCursorDrawable.set(editor, drawables)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

var TextView.cursorColorResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { cursorColor = color(value) }

var TextView.hintTextColor: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { setHintTextColor(value) }

var TextView.hintTextColorResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { hintTextColor = color(value) }

var TextView.hintResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { setHint(value) }

var TextView.selectionHighlightColor: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) {
        //You would think you would modify mHighlightPaint, but no, you need to modify mHighlightColor,
        //as it gets set as the color on the paint on each draw call
        try {
            val fHighlightColor = TextView::class.field("mHighlightColor")
            fHighlightColor.set(this, value)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

var TextView.selectionHighlightColorResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { selectionHighlightColor = color(value) }

var TextView.textColor: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { setTextColor(value) }

var TextView.textColorResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { textColor = color(value) }

var TextView.textHandleColor: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) {
        try {
            val clazz = TextView::class

            val fTextSelectHandleLeftRes = clazz.field("mTextSelectHandleLeftRes")
            val fTextSelectHandleRightRes = clazz.field("mTextSelectHandleRightRes")
            val fTextSelectHandleCenterRes = clazz.field("mTextSelectHandleRes")

            val leftRes = fTextSelectHandleLeftRes.getInt(this)
            val rightRes = fTextSelectHandleRightRes.getInt(this)
            val centerRes = fTextSelectHandleCenterRes.getInt(this)

            val fEditor = clazz.field("mEditor")
            val editor = fEditor.get(this)

            val fHandleLeftDrawable = editor.javaClass.field("mSelectHandleLeft")
            val fHandleRightDrawable = editor.javaClass.field("mSelectHandleRight")
            val fHandleCenterDrawable = editor.javaClass.field("mSelectHandleCenter")

            setDrawable(editor, fHandleLeftDrawable, value, leftRes)
            setDrawable(editor, fHandleRightDrawable, value, rightRes)
            setDrawable(editor, fHandleCenterDrawable, value, centerRes)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

var TextView.textHandleColorResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { textHandleColor = color(value) }

private fun TextView.setDrawable(editor: Any, field: Field, color: Int, drawableRes: Int) {
    val drawable = ContextCompat.getDrawable(context, drawableRes)?.mutate()?.apply {
        tintMode = PorterDuff.Mode.SRC_IN
        tint = color
    }
    field.set(editor, drawable)
}

var TextView.textResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { setText(value) }

fun TextView.doBeforeTextChanged(block: (s: CharSequence, start: Int, count: Int, after: Int) -> Unit) =
    addTextChangedListener(beforeTextChanged = block)

fun TextView.doOnTextChanged(block: (s: CharSequence, start: Int, before: Int, count: Int) -> Unit) =
    addTextChangedListener(onTextChanged = block)

fun TextView.doAfterTextChanged(block: (s: Editable) -> Unit) =
    addTextChangedListener(afterTextChanged = block)

fun TextView.addTextChangedListener(
    beforeTextChanged: ((s: CharSequence, start: Int, count: Int, after: Int) -> Unit)? = null,
    onTextChanged: ((s: CharSequence, start: Int, before: Int, count: Int) -> Unit)? = null,
    afterTextChanged: ((s: Editable) -> Unit)? = null
): TextWatcher {
    val textWatcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
            beforeTextChanged?.invoke(s, start, count, after)
        }

        override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
            onTextChanged?.invoke(s, start, before, count)
        }

        override fun afterTextChanged(s: Editable) {
            afterTextChanged?.invoke(s)
        }
    }
    addTextChangedListener(textWatcher)
    return textWatcher
}