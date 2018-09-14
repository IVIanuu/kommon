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

import android.annotation.TargetApi
import android.content.res.ColorStateList
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.os.Build
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.content.anim
import androidx.core.content.bitmap
import androidx.core.content.bool
import androidx.core.content.booleanAttr
import androidx.core.content.color
import androidx.core.content.colorAttr
import androidx.core.content.colorStateList
import androidx.core.content.colorStateListAttr
import androidx.core.content.dimen
import androidx.core.content.dimenAttr
import androidx.core.content.dimenPx
import androidx.core.content.dimenPxAttr
import androidx.core.content.dimenPxOffset
import androidx.core.content.dimenPxOffsetAttr
import androidx.core.content.drawable
import androidx.core.content.drawableAttr
import androidx.core.content.float
import androidx.core.content.floatAttr
import androidx.core.content.font
import androidx.core.content.fontAttr
import androidx.core.content.int
import androidx.core.content.intArray
import androidx.core.content.intArrayAttr
import androidx.core.content.integerAttr
import androidx.core.content.string
import androidx.core.content.stringArray
import androidx.core.content.stringAttr
import androidx.core.content.textArray
import androidx.core.content.textArrayAttr
import androidx.core.content.textAttr
import androidx.core.content.typedArray
import androidx.internal.NO_GETTER
import androidx.internal.noGetter

var View.backgroundColor: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { setBackgroundColor(value) }

var View.backgroundColorResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { backgroundColor = color(value) }

var View.backgroundResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { setBackgroundResource(value) }

var View.elevationResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { elevation = dimenPx(value).toFloat() }