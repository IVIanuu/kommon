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

package com.ivianuu.kommon.core.content

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.TypedArray
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.util.TypedValue
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat

fun Context.anim(id: Int): Animation = AnimationUtils.loadAnimation(this, id)

fun Context.intArray(id: Int): IntArray = resources.getIntArray(id)

fun Context.stringArray(id: Int): Array<String> =
    resources.getStringArray(id)

fun Context.textArray(id: Int): Array<CharSequence> =
    resources.getTextArray(id)

fun Context.typedArray(id: Int): TypedArray = resources.obtainTypedArray(id)

fun Context.bool(id: Int): Boolean = resources.getBoolean(id)

fun Context.dimen(id: Int): Float = resources.getDimension(id)

fun Context.dimenPx(id: Int): Int = resources.getDimensionPixelSize(id)

fun Context.dimenPxOffset(id: Int): Int = resources.getDimensionPixelOffset(id)

fun Context.float(id: Int): Float = ResourcesCompat.getFloat(resources, id)

fun Context.int(id: Int): Int = resources.getInteger(id)

fun Context.bitmap(id: Int): Bitmap = BitmapFactory.decodeResource(resources, id)

fun Context.color(id: Int): Int = ContextCompat.getColor(this, id)

fun Context.colorStateList(resId: Int): ColorStateList =
    ContextCompat.getColorStateList(this, resId)!!

fun Context.drawable(resId: Int): Drawable =
    ContextCompat.getDrawable(this, resId)!!

fun Context.font(resId: Int): Typeface = ResourcesCompat.getFont(this, resId)!!

fun Context.string(resId: Int): String = getString(resId)

fun Context.string(resId: Int, vararg args: Any): String = getString(resId, *args)