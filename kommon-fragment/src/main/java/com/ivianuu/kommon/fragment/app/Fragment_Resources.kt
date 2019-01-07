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

import android.content.res.ColorStateList
import android.content.res.TypedArray
import android.graphics.Bitmap
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.view.animation.Animation
import androidx.fragment.app.Fragment
import com.ivianuu.kommon.core.content.anim
import com.ivianuu.kommon.core.content.bitmap
import com.ivianuu.kommon.core.content.bool
import com.ivianuu.kommon.core.content.color
import com.ivianuu.kommon.core.content.colorStateList
import com.ivianuu.kommon.core.content.dimen
import com.ivianuu.kommon.core.content.dimenPx
import com.ivianuu.kommon.core.content.dimenPxOffset
import com.ivianuu.kommon.core.content.drawable
import com.ivianuu.kommon.core.content.float
import com.ivianuu.kommon.core.content.font
import com.ivianuu.kommon.core.content.int
import com.ivianuu.kommon.core.content.intArray
import com.ivianuu.kommon.core.content.string
import com.ivianuu.kommon.core.content.stringArray
import com.ivianuu.kommon.core.content.textArray
import com.ivianuu.kommon.core.content.typedArray

fun Fragment.anim(id: Int): Animation = requireContext().anim(id)

fun Fragment.intArray(id: Int): IntArray = requireContext().intArray(id)

fun Fragment.stringArray(id: Int): Array<String> = requireContext().stringArray(id)

fun Fragment.textArray(id: Int): Array<CharSequence> = requireContext().textArray(id)

fun Fragment.typedArray(id: Int): TypedArray = requireContext().typedArray(id)

fun Fragment.bool(id: Int): Boolean = requireContext().bool(id)

fun Fragment.dimen(id: Int): Float = requireContext().dimen(id)

fun Fragment.dimenPx(id: Int): Int = requireContext().dimenPx(id)

fun Fragment.dimenPxOffset(id: Int): Int = requireContext().dimenPxOffset(id)

fun Fragment.float(id: Int): Float = requireContext().float(id)

fun Fragment.int(id: Int): Int = requireContext().int(id)

fun Fragment.bitmap(id: Int): Bitmap = requireContext().bitmap(id)

fun Fragment.color(id: Int): Int = requireContext().color(id)

fun Fragment.colorStateList(id: Int): ColorStateList =
    requireContext().colorStateList(id)

fun Fragment.drawable(id: Int): Drawable = requireContext().drawable(id)

fun Fragment.font(id: Int): Typeface = requireContext().font(id)

fun Fragment.string(id: Int): String = requireContext().string(id)

fun Fragment.string(id: Int, vararg args: Any): String =
    requireContext().string(id, *args)