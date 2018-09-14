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

package androidx.core.widget

import android.content.res.ColorStateList
import android.os.Build
import android.widget.SeekBar
import androidx.annotation.RequiresApi
import androidx.core.graphics.drawable.DrawableCompat
import androidx.core.view.color
import androidx.internal.NO_GETTER
import androidx.internal.noGetter

var SeekBar.progressColor: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) {
        val colorStateList = ColorStateList.valueOf(value)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            progressTintList = colorStateList
        } else {
            progressDrawable = DrawableCompat.wrap(progressDrawable).apply {
                DrawableCompat.setTintList(progressDrawable, colorStateList)
            }
        }
    }

var SeekBar.progressColorResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { progressColor = color(value) }

var SeekBar.thumbColor: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    set(value) {
        val colorStateList = ColorStateList.valueOf(value)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            thumbTintList = colorStateList
        } else {
            val thumbDrawable = DrawableCompat.wrap(thumb)
            DrawableCompat.setTintList(thumbDrawable, colorStateList)
            this.thumb = thumbDrawable
        }
    }

var SeekBar.thumbColorResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    set(value) { thumbColor = color(value) }

fun SeekBar.doOnProgressChanged(block: (seekBar: SeekBar, progress: Int, fromUser: Boolean) -> Unit) =
    setOnSeekBarChangeListener(onProgressChanged = block)

fun SeekBar.doOnStartTrackingTouch(block: (seekBar: SeekBar) -> Unit) =
    setOnSeekBarChangeListener(onStartTrackingTouch = block)

fun SeekBar.doOnStopTrackingTouch(block: (seekBar: SeekBar) -> Unit) =
    setOnSeekBarChangeListener(onStopTrackingTouch = block)

fun SeekBar.setOnSeekBarChangeListener(
    onProgressChanged: ((seekBar: SeekBar, progress: Int, fromUser: Boolean) -> Unit)? = null,
    onStartTrackingTouch: ((seekBar: SeekBar) -> Unit)? = null,
    onStopTrackingTouch: ((seekBar: SeekBar) -> Unit)? = null
): SeekBar.OnSeekBarChangeListener {
    val listener = object : SeekBar.OnSeekBarChangeListener {
        override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
            onProgressChanged?.invoke(seekBar, progress, fromUser)
        }

        override fun onStartTrackingTouch(seekBar: SeekBar) {
            onStartTrackingTouch?.invoke(seekBar)
        }

        override fun onStopTrackingTouch(seekBar: SeekBar) {
            onStopTrackingTouch?.invoke(seekBar)
        }
    }
    setOnSeekBarChangeListener(listener)
    return listener
}