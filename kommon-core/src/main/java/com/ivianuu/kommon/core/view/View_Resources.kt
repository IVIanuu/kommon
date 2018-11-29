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

fun View.anim(id: Int) = context.anim(id)

fun View.intArray(id: Int) = context.intArray(id)

fun View.stringArray(id: Int) = context.stringArray(id)

fun View.textArray(id: Int) = context.textArray(id)

fun View.typedArray(id: Int) = context.typedArray(id)

fun View.bool(id: Int) = context.bool(id)

fun View.dimen(id: Int) = context.dimen(id)

fun View.dimenPx(id: Int) = context.dimenPx(id)

fun View.dimenPxOffset(id: Int) = context.dimenPxOffset(id)

fun View.float(id: Int) = context.float(id)

fun View.int(id: Int): Int = context.int(id)

fun View.bitmap(id: Int) = context.bitmap(id)

fun View.color(id: Int) = context.color(id)

fun View.colorStateList(id: Int) =
    context.colorStateList(id)

fun View.drawable(id: Int) = context.drawable(id)

fun View.font(id: Int) = context.font(id)

fun View.string(id: Int) = context.string(id)

fun View.string(id: Int, vararg args: Any) =
    context.string(id, *args)