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

package com.ivianuu.kommon.fragment.app

import android.annotation.TargetApi
import android.content.res.ColorStateList
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.os.Build
import androidx.fragment.app.Fragment
import com.ivianuu.kommon.core.content.booleanAttr
import com.ivianuu.kommon.core.content.colorAttr
import com.ivianuu.kommon.core.content.colorStateListAttr
import com.ivianuu.kommon.core.content.dimenAttr
import com.ivianuu.kommon.core.content.dimenPxAttr
import com.ivianuu.kommon.core.content.dimenPxOffsetAttr
import com.ivianuu.kommon.core.content.drawableAttr
import com.ivianuu.kommon.core.content.floatAttr
import com.ivianuu.kommon.core.content.fontAttr
import com.ivianuu.kommon.core.content.intArrayAttr
import com.ivianuu.kommon.core.content.integerAttr
import com.ivianuu.kommon.core.content.stringAttr
import com.ivianuu.kommon.core.content.textArrayAttr
import com.ivianuu.kommon.core.content.textAttr

fun Fragment.booleanAttr(attr: Int, defaultValue: Boolean = false): Boolean =
    requireContext().booleanAttr(attr, defaultValue)

fun Fragment.colorAttr(attr: Int, defaultValue: Int = 0): Int =
    requireContext().colorAttr(attr, defaultValue)

fun Fragment.colorStateListAttr(
    attr: Int,
    defaultValue: ColorStateList? = null
): ColorStateList? =
    requireContext().colorStateListAttr(attr, defaultValue)

fun Fragment.dimenAttr(attr: Int, defaultValue: Float = 0f): Float =
    requireContext().dimenAttr(attr, defaultValue)

fun Fragment.dimenPxOffsetAttr(attr: Int, defaultValue: Int = 0): Int =
    requireContext().dimenPxOffsetAttr(attr, defaultValue)

fun Fragment.dimenPxAttr(attr: Int, defaultValue: Int = 0): Int =
    requireContext().dimenPxAttr(attr, defaultValue)

fun Fragment.drawableAttr(attr: Int, defaultValue: Drawable? = null): Drawable? =
    requireContext().drawableAttr(attr, defaultValue)

fun Fragment.floatAttr(attr: Int, defaultValue: Float = 0f): Float =
    requireContext().floatAttr(attr, defaultValue)

@TargetApi(Build.VERSION_CODES.O)
fun Fragment.fontAttr(attr: Int, defaultValue: Typeface? = null): Typeface? =
    requireContext().fontAttr(attr, defaultValue)

fun Fragment.intArrayAttr(attr: Int, defaultValue: Int = 0): Int =
    requireContext().intArrayAttr(attr, defaultValue)

fun Fragment.integerAttr(attr: Int, defaultValue: Int = 0): Int =
    requireContext().integerAttr(attr, defaultValue)

fun Fragment.stringAttr(attr: Int, defaultValue: String? = null): String? =
    requireContext().stringAttr(attr, defaultValue)

fun Fragment.textAttr(attr: Int, defaultValue: CharSequence? = null): CharSequence? =
    requireContext().textAttr(attr, defaultValue)

fun Fragment.textArrayAttr(
    attr: Int,
    defaultValue: Array<CharSequence>? = null
): Array<CharSequence>? =
    requireContext().textArrayAttr(attr, defaultValue)