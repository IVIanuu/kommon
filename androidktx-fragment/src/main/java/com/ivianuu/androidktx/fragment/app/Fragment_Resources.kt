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

package com.ivianuu.androidktx.fragment.app

import androidx.fragment.app.Fragment
import com.ivianuu.androidktx.core.content.anim
import com.ivianuu.androidktx.core.content.bitmap
import com.ivianuu.androidktx.core.content.bool
import com.ivianuu.androidktx.core.content.color
import com.ivianuu.androidktx.core.content.colorStateList
import com.ivianuu.androidktx.core.content.dimen
import com.ivianuu.androidktx.core.content.dimenPx
import com.ivianuu.androidktx.core.content.dimenPxOffset
import com.ivianuu.androidktx.core.content.drawable
import com.ivianuu.androidktx.core.content.float
import com.ivianuu.androidktx.core.content.font
import com.ivianuu.androidktx.core.content.int
import com.ivianuu.androidktx.core.content.intArray
import com.ivianuu.androidktx.core.content.string
import com.ivianuu.androidktx.core.content.stringArray
import com.ivianuu.androidktx.core.content.textArray
import com.ivianuu.androidktx.core.content.typedArray

fun Fragment.anim(resId: Int) = requireContext().anim(resId)

fun Fragment.intArray(resId: Int) = requireContext().intArray(resId)

fun Fragment.stringArray(resId: Int) = requireContext().stringArray(resId)

fun Fragment.textArray(resId: Int) = requireContext().textArray(resId)

fun Fragment.typedArray(resId: Int) = requireContext().typedArray(resId)

fun Fragment.bool(resId: Int) = requireContext().bool(resId)

fun Fragment.dimen(resId: Int) = requireContext().dimen(resId)

fun Fragment.dimenPx(resId: Int) = requireContext().dimenPx(resId)

fun Fragment.dimenPxOffset(resId: Int) = requireContext().dimenPxOffset(resId)

fun Fragment.float(resId: Int) = requireContext().float(resId)

fun Fragment.int(resId: Int): Int = requireContext().int(resId)

fun Fragment.bitmap(resId: Int) = requireContext().bitmap(resId)

fun Fragment.color(resId: Int) = requireContext().color(resId)

fun Fragment.colorStateList(resId: Int) =
    requireContext().colorStateList(resId)

fun Fragment.drawable(resId: Int) = requireContext().drawable(resId)

fun Fragment.font(resId: Int) = requireContext().font(resId)

fun Fragment.string(resId: Int) = requireContext().string(resId)

fun Fragment.string(resId: Int, vararg args: Any) =
    requireContext().string(resId, *args)