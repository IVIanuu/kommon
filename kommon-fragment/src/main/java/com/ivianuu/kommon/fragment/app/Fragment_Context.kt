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

package com.ivianuu.kommon.fragment.app

import android.content.ComponentName
import android.content.SharedPreferences
import android.content.res.Configuration
import android.util.DisplayMetrics
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.ivianuu.kommon.core.content.*

val Fragment.configuration: Configuration
    get() = requireContext().configuration

val Fragment.displayMetrics: DisplayMetrics
    get() = requireContext().displayMetrics

val Fragment.defaultSharedPreferences: SharedPreferences
    get() = requireContext().defaultSharedPreferences

val Fragment.rotation: Int
    get() = requireContext().rotation

val Fragment.isPortrait: Boolean
    get() = requireContext().isPortrait

val Fragment.isLandscape: Boolean
    get() = requireContext().isLandscape

val Fragment.screenWidth: Int
    get() = requireContext().screenWidth

val Fragment.screenHeight: Int
    get() = requireContext().screenHeight

val Fragment.realScreenWidth: Int
    get() = requireContext().realScreenWidth

val Fragment.realScreenHeight: Int
    get() = requireContext().realScreenHeight

val Fragment.isScreenOn: Boolean
    get() = requireContext().isScreenOn

val Fragment.isScreenOff: Boolean
    get() = requireContext().isScreenOff

val Fragment.isCharging: Boolean
    get() = requireContext().isCharging

val Fragment.batteryLevel: Int
    get() = requireContext().batteryLevel

inline fun <reified T> Fragment.componentName(): ComponentName =
    requireContext().componentName<T>()

fun Fragment.componentName(className: String): ComponentName =
    requireContext().componentName(className)

inline fun <reified T> Fragment.systemService(): T = requireContext().systemService<T>()

inline fun <reified T> Fragment.systemServiceOrNull(): T? = requireContext().systemServiceOrNull<T>()

fun Fragment.toastShort(text: CharSequence): Toast = requireContext().toastShort(text)

fun Fragment.toastShort(textRes: Int, vararg args: Any): Toast =
    requireContext().toastShort(textRes, *args)

fun Fragment.toastLong(text: CharSequence): Toast =
    requireContext().toastLong(text)

fun Fragment.toastLong(textRes: Int, vararg args: Any): Toast =
    requireContext().toastLong(textRes, *args)

fun Fragment.hasPermissions(vararg permissions: String): Boolean =
    requireContext().hasPermissions(*permissions)

fun Fragment.isAppInstalled(packageName: String): Boolean =
    requireContext().isAppInstalled(packageName)

fun Fragment.isAppLaunchable(packageName: String): Boolean =
    requireContext().isAppLaunchable(packageName)

fun Fragment.isAppEnabled(packageName: String): Boolean =
    requireContext().isAppEnabled(packageName)

fun Fragment.dp(dp: Int): Float = requireContext().dp(dp)