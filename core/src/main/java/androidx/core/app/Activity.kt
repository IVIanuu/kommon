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

package androidx.core.app

import android.annotation.TargetApi
import android.app.Activity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.core.content.intent
import androidx.core.content.systemService
import androidx.core.view.isDrawUnderStatusBar
import androidx.core.view.isNavigationBarHidden
import androidx.core.view.isNavigationBarLight
import androidx.core.view.isNavigationBarLightCompat
import androidx.core.view.isNavigationBarTranslucent
import androidx.core.view.isNavigationBarTransparent
import androidx.core.view.isStatusBarHidden
import androidx.core.view.isStatusBarLight
import androidx.core.view.isStatusBarLightCompat
import androidx.core.view.isStatusBarTranslucent
import androidx.core.view.isStatusBarTransparent

inline var Activity.isStatusBarLight: Boolean
    @TargetApi(Build.VERSION_CODES.M)
    get() = window.isStatusBarLight
    @TargetApi(Build.VERSION_CODES.M)
    set(value) {
        window.isStatusBarLight = value
    }

inline var Activity.isStatusBarLightCompat: Boolean
    get() = window.isStatusBarLightCompat
    set(value) {
        window.isStatusBarLightCompat = value
    }

inline var Activity.isDrawUnderStatusBar: Boolean
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    get() = window.isDrawUnderStatusBar
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    set(value) {
        window.isDrawUnderStatusBar = value
    }

inline var Activity.isStatusBarTranslucent: Boolean
    @TargetApi(Build.VERSION_CODES.KITKAT)
    get() = window.isStatusBarTranslucent
    @TargetApi(Build.VERSION_CODES.KITKAT)
    set(value) {
        window.isStatusBarTranslucent = value
    }

inline var Activity.isStatusBarTransparent: Boolean
    get() = window.isStatusBarTransparent
    set(value) {
        window.isStatusBarTransparent = value
    }

inline var Activity.isStatusBarHidden: Boolean
    get() = window.isStatusBarHidden
    set(value) {
        window.isStatusBarHidden = value
    }

inline var Activity.navigationBarColor: Int
    get() = window.navigationBarColor
    set(value) {
        window.navigationBarColor = value
    }

inline var Activity.isNavigationBarTranslucent: Boolean
    @TargetApi(Build.VERSION_CODES.KITKAT)
    get() = window.isNavigationBarTranslucent
    @TargetApi(Build.VERSION_CODES.KITKAT)
    set(value) {
        window.isNavigationBarTranslucent = value
    }

inline var Activity.isNavigationBarTransparent: Boolean
    get() = window.isNavigationBarTransparent
    set(value) {
        window.isNavigationBarTransparent = value
    }

inline var Activity.isNavigationBarHidden: Boolean
    @TargetApi(Build.VERSION_CODES.KITKAT)
    get() = window.isNavigationBarHidden
    @TargetApi(Build.VERSION_CODES.KITKAT)
    set(value) {
        window.isNavigationBarHidden = value
    }

inline var Activity.isNavigationBarLight: Boolean
    @TargetApi(Build.VERSION_CODES.O)
    get() = window.isNavigationBarLight
    @TargetApi(Build.VERSION_CODES.O)
    set(value) {
        window.isNavigationBarLight = value
    }

inline var Activity.isNavigationBarLightCompat: Boolean
    get() = window.isNavigationBarLightCompat
    set(value) {
        window.isNavigationBarLightCompat = value
    }

inline fun Activity.hideInputMethod() {
    systemService<InputMethodManager>().hideSoftInputFromWindow(
        window.peekDecorView().windowToken,
        0
    )
}

inline fun Activity.showInputMethod(view: View, flags: Int = 0) {
    systemService<InputMethodManager>().showSoftInput(view, flags)
}

inline fun <reified T : Activity> Activity.startActivityForResult(
    requestCode: Int,
    options: Bundle? = null
) {
    startActivityForResult(intent<T>(), requestCode, options)
}

inline fun <reified T : Activity> Activity.startActivityForResult(
    requestCode: Int,
    options: Bundle? = null,
    init: Intent.() -> Unit
) {
    startActivityForResult(intent<T>(init), requestCode, options)
}