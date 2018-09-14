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

package androidx.appcompat.widget

import android.content.res.ColorStateList
import androidx.appcompat.R
import androidx.core.view.color
import androidx.core.view.colorAttr
import androidx.internal.NO_GETTER
import androidx.internal.adjustAlpha
import androidx.internal.noGetter

var SwitchCompat.thumbColor: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) {
        thumbTintList = ColorStateList(
            arrayOf(
                intArrayOf(-android.R.attr.state_checked),
                intArrayOf(android.R.attr.state_checked)
            ), intArrayOf(colorAttr(R.attr.colorSwitchThumbNormal), value)
        )
    }

var SwitchCompat.thumbColorResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { thumbColor = color(value) }

var SwitchCompat.trackColor: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) {
        trackTintList = ColorStateList(
            arrayOf(
                intArrayOf(-android.R.attr.state_enabled),
                intArrayOf(android.R.attr.state_checked),
                intArrayOf()
            ), intArrayOf(
                colorAttr(android.R.attr.colorForeground).adjustAlpha(0.1f),
                value.adjustAlpha(0.3f),
                colorAttr(android.R.attr.colorForeground).adjustAlpha(0.3f)
            )
        )
    }

var SwitchCompat.trackColorResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { trackColor = color(value) }