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
import android.app.Service
import android.content.Intent
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.core.content.intent
import androidx.core.content.startActivity
import androidx.core.content.startForegroundService
import androidx.core.content.startForegroundServiceCompat
import androidx.core.content.startService

inline fun <reified T> Fragment.intent() = requireContext().intent<T>()

inline fun <reified T> Fragment.intent(init: Intent.() -> Unit) =
    requireContext().intent<T>(init)

inline fun <reified T : Activity> Fragment.startActivity() {
    requireContext().startActivity<T>()
}

inline fun <reified T : Activity> Fragment.startActivity(init: Intent.() -> Unit) {
    requireContext().startActivity<T>(init)
}

inline fun <reified T : Service> Fragment.startService() {
    requireContext().startService<T>()
}

inline fun <reified T : Service> Fragment.startService(init: Intent.() -> Unit) {
    requireContext().startService<T>(init)
}

@RequiresApi(Build.VERSION_CODES.O)
inline fun <reified T : Service> Fragment.startForegroundService() {
    requireContext().startForegroundService<T>()
}

@RequiresApi(Build.VERSION_CODES.O)
inline fun <reified T : Service> Fragment.startForegroundService(init: Intent.() -> Unit) {
    requireContext().startForegroundService<T>(init)
}
inline fun <reified T : Service> Fragment.startForegroundServiceCompat() {
    requireContext().startForegroundServiceCompat<T>()
}

inline fun <reified T : Service> Fragment.startForegroundServiceCompat(init: Intent.() -> Unit) {
    requireContext().startForegroundServiceCompat<T>(init)
}