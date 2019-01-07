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

import android.content.res.ColorStateList
import android.content.res.TypedArray
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.view.View
import android.view.animation.Animation
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

fun View.anim(id: Int): Animation = context.anim(id)

fun View.intArray(id: Int): IntArray = context.intArray(id)

fun View.stringArray(id: Int): Array<String> = context.stringArray(id)

fun View.textArray(id: Int): Array<CharSequence> = context.textArray(id)

fun View.typedArray(id: Int): TypedArray = context.typedArray(id)

fun View.bool(id: Int): Boolean = context.bool(id)

fun View.dimen(id: Int): Float = context.dimen(id)

fun View.dimenPx(id: Int): Int = context.dimenPx(id)

fun View.dimenPxOffset(id: Int): Int = context.dimenPxOffset(id)

fun View.float(id: Int): Float = context.float(id)

fun View.int(id: Int): Int = context.int(id)

fun View.bitmap(id: Int): Bitmap = context.bitmap(id)

fun View.color(id: Int): Int = context.color(id)

fun View.colorStateList(id: Int): ColorStateList =
    context.colorStateList(id)

fun View.drawable(id: Int): Drawable = context.drawable(id)

fun View.font(id: Int) = context.font(id)

fun View.string(id: Int) = context.string(id)

fun View.string(id: Int, vararg args: Any) =
    context.string(id, *args)