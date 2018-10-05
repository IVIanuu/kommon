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

package com.ivianuu.androidktx.core.content

import android.app.Activity
import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.annotation.RequiresApi

val intentInitStub: Intent.() -> Unit = {}

inline fun <reified T> Context.intent() = intent<T>(intentInitStub)

inline fun <reified T> Context.intent(init: Intent.() -> Unit) =
    Intent(this, T::class.java).apply(init)

inline fun <reified T : Activity> Context.startActivity() {
    startActivity(intent<T>())
}

inline fun <reified T : Activity> Context.startActivity(init: Intent.() -> Unit) {
    startActivity(intent<T>(init))
}

inline fun <reified T : Service> Context.startService() {
    startService(intent<T>())
}

inline fun <reified T : Service> Context.startService(init: Intent.() -> Unit) {
    startService(intent<T>(init))
}

@RequiresApi(Build.VERSION_CODES.O)
inline fun <reified T : Service> Context.startForegroundService() {
    startForegroundService(intent<T>())
}

@RequiresApi(Build.VERSION_CODES.O)
inline fun <reified T : Service> Context.startForegroundService(init: Intent.() -> Unit) {
    startForegroundService(intent<T>(init))
}

inline fun <reified T : Service> Context.startForegroundServiceCompat() {
    startForegroundServiceCompat(intent<T>())
}

inline fun <reified T : Service> Context.startForegroundServiceCompat(init: Intent.() -> Unit) {
    startForegroundServiceCompat(intent<T>(init))
}