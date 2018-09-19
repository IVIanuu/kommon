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

package com.ivianuu.androidktx.cardview.widget

import androidx.cardview.widget.CardView
import com.ivianuu.androidktx.core.view.color
import com.ivianuu.androidktx.core.view.colorStateList
import com.ivianuu.androidktx.core.view.dimenPx
import com.ivianuu.androidktx.internal.NO_GETTER
import com.ivianuu.androidktx.internal.noGetter

var CardView.cardBackgroundColorInt: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) {
        setCardBackgroundColor(value)
    }

var CardView.cardBackgroundColorIntResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { cardBackgroundColorInt = color(value) }

var CardView.cardBackgroundColorResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) {
        setCardBackgroundColor(colorStateList(value))
    }

var CardView.cardElevationResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { cardElevation = dimenPx(value).toFloat() }

var CardView.maxCardElevationResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { maxCardElevation = dimenPx(value).toFloat() }

var CardView.radiusResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { radius = dimenPx(value).toFloat() }