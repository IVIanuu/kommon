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

import androidx.core.content.anim
import androidx.core.content.bitmap
import androidx.core.content.bool
import androidx.core.content.color
import androidx.core.content.colorStateList
import androidx.core.content.dimen
import androidx.core.content.dimenPx
import androidx.core.content.dimenPxOffset
import androidx.core.content.drawable
import androidx.core.content.float
import androidx.core.content.font
import androidx.core.content.int
import androidx.core.content.intArray
import androidx.core.content.string
import androidx.core.content.stringArray
import androidx.core.content.textArray
import androidx.core.content.typedArray

inline fun Fragment.anim(resId: Int) = requireContext().anim(resId)

inline fun Fragment.intArray(resId: Int) = requireContext().intArray(resId)

inline fun Fragment.stringArray(resId: Int) = requireContext().stringArray(resId)

inline fun Fragment.textArray(resId: Int) = requireContext().textArray(resId)

inline fun Fragment.typedArray(resId: Int) = requireContext().typedArray(resId)

inline fun Fragment.bool(resId: Int) = requireContext().bool(resId)

inline fun Fragment.dimen(resId: Int) = requireContext().dimen(resId)

inline fun Fragment.dimenPx(resId: Int) = requireContext().dimenPx(resId)

inline fun Fragment.dimenPxOffset(resId: Int) = requireContext().dimenPxOffset(resId)

inline fun Fragment.float(resId: Int) = requireContext().float(resId)

inline fun Fragment.int(resId: Int): Int = requireContext().int(resId)

inline fun Fragment.bitmap(resId: Int) = requireContext().bitmap(resId)

inline fun Fragment.color(resId: Int) = requireContext().color(resId)

inline fun Fragment.colorStateList(resId: Int) =
    requireContext().colorStateList(resId)

inline fun Fragment.drawable(resId: Int) = requireContext().drawable(resId)

inline fun Fragment.font(resId: Int) = requireContext().font(resId)

inline fun Fragment.string(resId: Int) = requireContext().string(resId)

inline fun Fragment.string(resId: Int, vararg args: Any) =
    requireContext().string(resId, *args)