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

package androidx.fragment.app

import android.annotation.TargetApi
import android.content.res.ColorStateList
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.os.Build
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

inline fun Fragment.booleanAttr(attr: Int, defaultValue: Boolean = false) =
    requireContext().booleanAttr(attr, defaultValue)

inline fun Fragment.colorAttr(attr: Int, defaultValue: Int = 0) =
    requireContext().colorAttr(attr, defaultValue)

inline fun Fragment.colorStateListAttr(
    attr: Int,
    defaultValue: ColorStateList? = null
) =
    requireContext().colorStateListAttr(attr, defaultValue)

inline fun Fragment.dimenAttr(attr: Int, defaultValue: Float = 0f) =
    requireContext().dimenAttr(attr, defaultValue)

inline fun Fragment.dimenPxOffsetAttr(attr: Int, defaultValue: Int = 0) =
    requireContext().dimenPxOffsetAttr(attr, defaultValue)

inline fun Fragment.dimenPxAttr(attr: Int, defaultValue: Int = 0) =
    requireContext().dimenPxAttr(attr, defaultValue)

inline fun Fragment.drawableAttr(attr: Int, defaultValue: Drawable? = null) =
    requireContext().drawableAttr(attr, defaultValue)

inline fun Fragment.floatAttr(attr: Int, defaultValue: Float = 0f) =
    requireContext().floatAttr(attr, defaultValue)

@TargetApi(Build.VERSION_CODES.O)
inline fun Fragment.fontAttr(attr: Int, defaultValue: Typeface? = null) =
    requireContext().fontAttr(attr, defaultValue)

inline fun Fragment.intArrayAttr(attr: Int, defaultValue: Int = 0) =
    requireContext().intArrayAttr(attr, defaultValue)

inline fun Fragment.integerAttr(attr: Int, defaultValue: Int = 0) =
    requireContext().integerAttr(attr, defaultValue)

inline fun Fragment.stringAttr(attr: Int, defaultValue: String? = null) =
    requireContext().stringAttr(attr, defaultValue)

inline fun Fragment.textAttr(attr: Int, defaultValue: CharSequence? = null) =
    requireContext().textAttr(attr, defaultValue)

inline fun Fragment.textArrayAttr(
    attr: Int,
    defaultValue: Array<CharSequence>? = null
) =
    requireContext().textArrayAttr(attr, defaultValue)