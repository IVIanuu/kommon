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

package com.ivianuu.kommon.core.app

import android.app.Activity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.annotation.RequiresApi
import com.ivianuu.kommon.core.content.intent
import com.ivianuu.kommon.core.content.systemService

fun Activity.hideInputMethod() {
    systemService<InputMethodManager>().hideSoftInputFromWindow(
        window.peekDecorView().windowToken,
        0
    )
}

fun Activity.showInputMethod(view: View, flags: Int = 0) {
    systemService<InputMethodManager>().showSoftInput(view, flags)
}

@RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
inline fun <reified T : Activity> Activity.startActivityForResult(
    requestCode: Int,
    options: Bundle? = null
) {
    startActivityForResult(intent<T>(), requestCode, options)
}

@RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
inline fun <reified T : Activity> Activity.startActivityForResult(
    requestCode: Int,
    options: Bundle? = null,
    init: Intent.() -> Unit
) {
    startActivityForResult(intent<T>(init), requestCode, options)
}