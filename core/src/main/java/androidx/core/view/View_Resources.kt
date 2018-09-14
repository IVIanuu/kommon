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

import android.view.View
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

inline fun View.anim(resId: Int) = context.anim(resId)

inline fun View.intArray(resId: Int) = context.intArray(resId)

inline fun View.stringArray(resId: Int) = context.stringArray(resId)

inline fun View.textArray(resId: Int) = context.textArray(resId)

inline fun View.typedArray(resId: Int) = context.typedArray(resId)

inline fun View.bool(resId: Int) = context.bool(resId)

inline fun View.dimen(resId: Int) = context.dimen(resId)

inline fun View.dimenPx(resId: Int) = context.dimenPx(resId)

inline fun View.dimenPxOffset(resId: Int) = context.dimenPxOffset(resId)

inline fun View.float(resId: Int) = context.float(resId)

inline fun View.int(resId: Int): Int = context.int(resId)

inline fun View.bitmap(resId: Int) = context.bitmap(resId)

inline fun View.color(resId: Int) = context.color(resId)

inline fun View.colorStateList(resId: Int) =
    context.colorStateList(resId)

inline fun View.drawable(resId: Int) = context.drawable(resId)

inline fun View.font(resId: Int) = context.font(resId)

inline fun View.string(resId: Int) = context.string(resId)

inline fun View.string(resId: Int, vararg args: Any) =
    context.string(resId, *args)