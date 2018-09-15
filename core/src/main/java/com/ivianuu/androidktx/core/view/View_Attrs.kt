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

import android.annotation.TargetApi
import android.content.res.ColorStateList
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.os.Build
import android.view.View
import com.ivianuu.androidktx.core.content.booleanAttr
import com.ivianuu.androidktx.core.content.colorAttr
import com.ivianuu.androidktx.core.content.colorStateListAttr
import com.ivianuu.androidktx.core.content.dimenAttr
import com.ivianuu.androidktx.core.content.dimenPxAttr
import com.ivianuu.androidktx.core.content.dimenPxOffsetAttr
import com.ivianuu.androidktx.core.content.drawableAttr
import com.ivianuu.androidktx.core.content.floatAttr
import com.ivianuu.androidktx.core.content.fontAttr
import com.ivianuu.androidktx.core.content.intArrayAttr
import com.ivianuu.androidktx.core.content.integerAttr
import com.ivianuu.androidktx.core.content.stringAttr
import com.ivianuu.androidktx.core.content.textArrayAttr
import com.ivianuu.androidktx.core.content.textAttr

inline fun View.booleanAttr(attr: Int, defaultValue: Boolean = false) =
    context.booleanAttr(attr, defaultValue)

inline fun View.colorAttr(attr: Int, defaultValue: Int = 0) =
    context.colorAttr(attr, defaultValue)

inline fun View.colorStateListAttr(
    attr: Int,
    defaultValue: ColorStateList? = null
) =
    context.colorStateListAttr(attr, defaultValue)

inline fun View.dimenAttr(attr: Int, defaultValue: Float = 0f) =
    context.dimenAttr(attr, defaultValue)

inline fun View.dimenPxOffsetAttr(attr: Int, defaultValue: Int = 0) =
    context.dimenPxOffsetAttr(attr, defaultValue)

inline fun View.dimenPxAttr(attr: Int, defaultValue: Int = 0) =
    context.dimenPxAttr(attr, defaultValue)

inline fun View.drawableAttr(attr: Int, defaultValue: Drawable? = null) =
    context.drawableAttr(attr, defaultValue)

inline fun View.floatAttr(attr: Int, defaultValue: Float = 0f) =
    context.floatAttr(attr, defaultValue)

@TargetApi(Build.VERSION_CODES.O)
inline fun View.fontAttr(attr: Int, defaultValue: Typeface? = null) =
    context.fontAttr(attr, defaultValue)

inline fun View.intArrayAttr(attr: Int, defaultValue: Int = 0) =
    context.intArrayAttr(attr, defaultValue)

inline fun View.integerAttr(attr: Int, defaultValue: Int = 0) =
    context.integerAttr(attr, defaultValue)

inline fun View.stringAttr(attr: Int, defaultValue: String? = null) =
    context.stringAttr(attr, defaultValue)

inline fun View.textAttr(attr: Int, defaultValue: CharSequence? = null) =
    context.textAttr(attr, defaultValue)

inline fun View.textArrayAttr(
    attr: Int,
    defaultValue: Array<CharSequence>? = null
) =
    context.textArrayAttr(attr, defaultValue)
