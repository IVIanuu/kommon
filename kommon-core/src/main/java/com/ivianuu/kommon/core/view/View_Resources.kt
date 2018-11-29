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

package com.ivianuu.kommon.core.view

import android.view.View
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

fun View.anim(resId: Int) = context.anim(resId)

fun View.intArray(resId: Int) = context.intArray(resId)

fun View.stringArray(resId: Int) = context.stringArray(resId)

fun View.textArray(resId: Int) = context.textArray(resId)

fun View.typedArray(resId: Int) = context.typedArray(resId)

fun View.bool(resId: Int) = context.bool(resId)

fun View.dimen(resId: Int) = context.dimen(resId)

fun View.dimenPx(resId: Int) = context.dimenPx(resId)

fun View.dimenPxOffset(resId: Int) = context.dimenPxOffset(resId)

fun View.float(resId: Int) = context.float(resId)

fun View.int(resId: Int): Int = context.int(resId)

fun View.bitmap(resId: Int) = context.bitmap(resId)

fun View.color(resId: Int) = context.color(resId)

fun View.colorStateList(resId: Int) =
    context.colorStateList(resId)

fun View.drawable(resId: Int) = context.drawable(resId)

fun View.font(resId: Int) = context.font(resId)

fun View.string(resId: Int) = context.string(resId)

fun View.string(resId: Int, vararg args: Any) =
    context.string(resId, *args)