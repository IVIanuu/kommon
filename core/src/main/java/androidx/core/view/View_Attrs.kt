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

package androidx.core.view

import android.annotation.TargetApi
import android.content.res.ColorStateList
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.os.Build
import android.view.View
import androidx.core.content.booleanAttr
import androidx.core.content.colorAttr
import androidx.core.content.colorStateListAttr
import androidx.core.content.dimenAttr
import androidx.core.content.dimenPxAttr
import androidx.core.content.dimenPxOffsetAttr
import androidx.core.content.drawableAttr
import androidx.core.content.floatAttr
import androidx.core.content.fontAttr
import androidx.core.content.intArrayAttr
import androidx.core.content.integerAttr
import androidx.core.content.stringAttr
import androidx.core.content.textArrayAttr
import androidx.core.content.textAttr

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
