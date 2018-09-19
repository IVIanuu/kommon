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

package com.ivianuu.androidktx.core.view

import android.content.res.ColorStateList
import android.os.Build
import android.view.View
import androidx.annotation.RequiresApi
import com.ivianuu.androidktx.internal.NO_GETTER
import com.ivianuu.androidktx.internal.noGetter

var View.backgroundColor: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { setBackgroundColor(value) }

var View.backgroundColorResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { backgroundColor = color(value) }

var View.backgroundTintListResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    set(value) {
        backgroundTintList = colorStateList(value)
    }

var View.backgroundResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) {
        setBackgroundResource(value)
    }

var View.foregroundResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    @RequiresApi(Build.VERSION_CODES.M)
    set(value) {
        foreground = drawable(value)
    }

var View.foregroundColor: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    @RequiresApi(Build.VERSION_CODES.M)
    set(value) {
        foregroundTintList = ColorStateList.valueOf(value)
    }

var View.foregroundColorResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) {
        foregroundColor = color(value)
    }

var View.foregroundTintListResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    @RequiresApi(Build.VERSION_CODES.M)
    set(value) {
        foregroundTintList = colorStateList(value)
    }

var View.elevationResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    set(value) { elevation = dimenPx(value).toFloat() }

fun View.doOnAttachedToWindow(block: (v: View) -> Unit) =
    addOnAttachStateChangeListener(onViewAttachedToWindow = block)

fun View.doOnDetachedFromWindow(block: (v: View) -> Unit) =
    addOnAttachStateChangeListener(onViewDetachedFromWindow = block)

fun View.addOnAttachStateChangeListener(
    onViewAttachedToWindow: ((v: View) -> Unit)? = null,
    onViewDetachedFromWindow: ((v: View) -> Unit)? = null
): View.OnAttachStateChangeListener {
    val listener = object : View.OnAttachStateChangeListener {
        override fun onViewAttachedToWindow(v: View) {
            onViewAttachedToWindow?.invoke(v)
        }

        override fun onViewDetachedFromWindow(v: View) {
            onViewDetachedFromWindow?.invoke(v)
        }
    }

    addOnAttachStateChangeListener(listener)

    return listener
}