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

package androidx.fragment.app

import android.app.Activity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.core.app.hideInputMethod
import androidx.core.app.showInputMethod
import androidx.core.app.startActivityForResult

inline fun Fragment.hideInputMethod() {
    requireActivity().hideInputMethod()
}

inline fun Fragment.showInputMethod(view: View, flags: Int = 0) {
    requireActivity().showInputMethod(view, flags)
}

@RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
inline fun <reified T : Activity> Fragment.startActivityForResult(
    requestCode: Int,
    options: Bundle? = null
) {
    requireActivity().startActivityForResult<T>(requestCode, options)
}

@RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
inline fun <reified T : Activity> Fragment.startActivityForResult(
    requestCode: Int,
    options: Bundle? = null,
    init: Intent.() -> Unit
) {
    requireActivity().startActivityForResult<T>(requestCode, options, init)
}