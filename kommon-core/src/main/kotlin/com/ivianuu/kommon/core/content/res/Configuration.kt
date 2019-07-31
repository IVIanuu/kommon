/*
 * Copyright 2019 Manuel Wrage
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

package com.ivianuu.kommon.core.content.res

import android.content.res.Configuration
import android.os.Build
import android.view.View
import androidx.annotation.RequiresApi

val Configuration.isRtl: Boolean
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    get() = layoutDirection == View.LAYOUT_DIRECTION_RTL

val Configuration.isLtr: Boolean
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    get() = layoutDirection == View.LAYOUT_DIRECTION_LTR

val Configuration.isPortrait: Boolean
    get() = orientation == Configuration.ORIENTATION_PORTRAIT

val Configuration.isLandscape: Boolean
    get() = orientation == Configuration.ORIENTATION_LANDSCAPE