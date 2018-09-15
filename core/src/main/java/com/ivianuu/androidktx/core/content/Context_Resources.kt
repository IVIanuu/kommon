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

package com.ivianuu.androidktx.core.content

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.TypedArray
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat

inline fun Context.anim(resId: Int): Animation = AnimationUtils.loadAnimation(this, resId)

inline fun Context.intArray(resId: Int): IntArray = resources.getIntArray(resId)

inline fun Context.stringArray(resId: Int): Array<String> =
    resources.getStringArray(resId)

inline fun Context.textArray(resId: Int): Array<CharSequence> =
    resources.getTextArray(resId)

inline fun Context.typedArray(resId: Int): TypedArray = resources.obtainTypedArray(resId)

inline fun Context.bool(resId: Int): Boolean = resources.getBoolean(resId)

inline fun Context.dimen(resId: Int): Float = resources.getDimension(resId)

inline fun Context.dimenPx(resId: Int): Int = resources.getDimensionPixelSize(resId)

inline fun Context.dimenPxOffset(resId: Int): Int = resources.getDimensionPixelOffset(resId)

inline fun Context.float(resId: Int): Float {
    resources.getValue(resId, typedValue, true)
    return typedValue.float
}

inline fun Context.int(resId: Int): Int = resources.getInteger(resId)

inline fun Context.bitmap(resId: Int): Bitmap = BitmapFactory.decodeResource(resources, resId)

inline fun Context.color(resId: Int): Int = ContextCompat.getColor(this, resId)

inline fun Context.colorStateList(resId: Int): ColorStateList =
    ContextCompat.getColorStateList(this, resId)!!

inline fun Context.drawable(resId: Int): Drawable =
    ContextCompat.getDrawable(this, resId)!!

inline fun Context.font(resId: Int): Typeface = ResourcesCompat.getFont(this, resId)!!

inline fun Context.string(resId: Int): String = getString(resId)

inline fun Context.string(resId: Int, vararg args: Any): String = getString(resId, *args)