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

package com.ivianuu.kommon.fragment.app

import android.view.View
import androidx.fragment.app.Fragment
import com.ivianuu.kommon.core.app.hideInputMethod
import com.ivianuu.kommon.core.app.showInputMethod

fun Fragment.hideInputMethod() {
    requireActivity().hideInputMethod()
}

fun Fragment.showInputMethod(view: View, flags: Int = 0) {
    requireActivity().showInputMethod(view, flags)
}