/*
 * Copyright 2019 Manuel Wrage
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

package com.ivianuu.kommon.core.view

import android.annotation.TargetApi
import android.content.res.ColorStateList
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.os.Build
import android.view.View
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

fun View.booleanAttr(attr: Int, defaultValue: Boolean = false): Boolean =
    context.booleanAttr(attr, defaultValue)

fun View.colorAttr(attr: Int, defaultValue: Int = 0): Int =
    context.colorAttr(attr, defaultValue)

fun View.colorStateListAttr(
    attr: Int,
    defaultValue: ColorStateList? = null
): ColorStateList? =
    context.colorStateListAttr(attr, defaultValue)

fun View.dimenAttr(attr: Int, defaultValue: Float = 0f): Float =
    context.dimenAttr(attr, defaultValue)

fun View.dimenPxOffsetAttr(attr: Int, defaultValue: Int = 0): Int =
    context.dimenPxOffsetAttr(attr, defaultValue)

fun View.dimenPxAttr(attr: Int, defaultValue: Int = 0): Int =
    context.dimenPxAttr(attr, defaultValue)

fun View.drawableAttr(attr: Int, defaultValue: Drawable? = null): Drawable? =
    context.drawableAttr(attr, defaultValue)

fun View.floatAttr(attr: Int, defaultValue: Float = 0f): Float =
    context.floatAttr(attr, defaultValue)

@TargetApi(Build.VERSION_CODES.O)
fun View.fontAttr(attr: Int, defaultValue: Typeface? = null): Typeface? =
    context.fontAttr(attr, defaultValue)

fun View.intArrayAttr(attr: Int, defaultValue: Int = 0): Int =
    context.intArrayAttr(attr, defaultValue)

fun View.integerAttr(attr: Int, defaultValue: Int = 0): Int =
    context.integerAttr(attr, defaultValue)

fun View.stringAttr(attr: Int, defaultValue: String? = null): String? =
    context.stringAttr(attr, defaultValue)

fun View.textAttr(attr: Int, defaultValue: CharSequence? = null): CharSequence? =
    context.textAttr(attr, defaultValue)

fun View.textArrayAttr(
    attr: Int,
    defaultValue: Array<CharSequence>? = null
): Array<CharSequence>? =
    context.textArrayAttr(attr, defaultValue)
