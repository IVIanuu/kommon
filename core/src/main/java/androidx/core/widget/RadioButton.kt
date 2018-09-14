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

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.view.View
import android.widget.RadioButton
import androidx.annotation.ColorInt
import androidx.core.R
import androidx.core.view.color
import androidx.core.view.colorAttr
import androidx.internal.NO_GETTER
import androidx.internal.adjustAlpha
import androidx.internal.isDark
import androidx.internal.noGetter

var RadioButton.buttonColor: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) {
        val disabledColor = getDisabledColor()
        buttonTintList = ColorStateList(
            arrayOf(
                intArrayOf(android.R.attr.state_enabled, -android.R.attr.state_checked),
                intArrayOf(android.R.attr.state_enabled, android.R.attr.state_checked),
                intArrayOf(-android.R.attr.state_enabled, -android.R.attr.state_checked),
                intArrayOf(-android.R.attr.state_enabled, android.R.attr.state_checked)
            ), intArrayOf(colorAttr(android.R.attr.colorControlNormal), value, disabledColor, disabledColor)
        )
    }

var RadioButton.buttonColorResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { buttonColor = color(value) }

private fun View.getDisabledColor(): Int {
    val primaryColor = color(android.R.attr.textColorPrimary)
    val disabledColor = if (primaryColor.isDark) Color.BLACK else Color.WHITE
    return disabledColor.adjustAlpha(0.3f)
}
