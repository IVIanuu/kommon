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
import android.widget.ProgressBar
import androidx.core.content.ContextCompat
import androidx.core.view.color
import androidx.internal.NO_GETTER
import androidx.internal.noGetter

var ProgressBar.indeterminateColor: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { indeterminateTintList = ColorStateList.valueOf(value) }

var ProgressBar.indeterminateColorResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { indeterminateColor = color(value) }

var ProgressBar.progressColor: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { progressTintList = ColorStateList.valueOf(value) }

var ProgressBar.progressColorResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { progressColor = color(value) }

var ProgressBar.secondaryProgressColor: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { secondaryProgressTintList = ColorStateList.valueOf(value) }

var ProgressBar.secondaryProgressColorResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { secondaryProgressColor = color(value) }