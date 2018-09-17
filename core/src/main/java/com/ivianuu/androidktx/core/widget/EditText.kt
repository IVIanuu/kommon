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

package com.ivianuu.androidktx.core.widget

import android.content.res.ColorStateList
import android.os.Build
import android.widget.EditText
import androidx.annotation.RequiresApi
import com.ivianuu.androidktx.core.view.color
import com.ivianuu.androidktx.core.view.colorAttr
import com.ivianuu.androidktx.internal.NO_GETTER
import com.ivianuu.androidktx.internal.noGetter

var EditText.backgroundColor: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    set(value) {
        val editTextColorStateList = ColorStateList(
            arrayOf(
                intArrayOf(-android.R.attr.state_enabled),
                intArrayOf(-android.R.attr.state_pressed, -android.R.attr.state_focused),
                intArrayOf()
            ), intArrayOf(
                colorAttr(android.R.attr.colorControlNormal),
                colorAttr(android.R.attr.colorControlNormal),
                value
            )
        )

        backgroundTintList = editTextColorStateList
    }

var EditText.backgroundColorResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    set(value) { backgroundColor = color(value) }