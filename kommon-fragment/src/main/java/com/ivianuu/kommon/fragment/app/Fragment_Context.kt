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

import androidx.fragment.app.Fragment
import com.ivianuu.kommon.core.content.batteryLevel
import com.ivianuu.kommon.core.content.componentName
import com.ivianuu.kommon.core.content.configuration
import com.ivianuu.kommon.core.content.defaultSharedPreferences
import com.ivianuu.kommon.core.content.displayMetrics
import com.ivianuu.kommon.core.content.dp
import com.ivianuu.kommon.core.content.hasPermissions
import com.ivianuu.kommon.core.content.isAppEnabled
import com.ivianuu.kommon.core.content.isAppInstalled
import com.ivianuu.kommon.core.content.isAppLaunchable
import com.ivianuu.kommon.core.content.isCharging
import com.ivianuu.kommon.core.content.isLandscape
import com.ivianuu.kommon.core.content.isPortrait
import com.ivianuu.kommon.core.content.isScreenOff
import com.ivianuu.kommon.core.content.isScreenOn
import com.ivianuu.kommon.core.content.realScreenHeight
import com.ivianuu.kommon.core.content.realScreenWidth
import com.ivianuu.kommon.core.content.rotation
import com.ivianuu.kommon.core.content.screenHeight
import com.ivianuu.kommon.core.content.screenWidth
import com.ivianuu.kommon.core.content.systemService
import com.ivianuu.kommon.core.content.systemServiceOrNull
import com.ivianuu.kommon.core.content.toastLong
import com.ivianuu.kommon.core.content.toastShort

inline val Fragment.configuration
    get() = requireContext().configuration

inline val Fragment.displayMetrics
    get() = requireContext().displayMetrics

inline val Fragment.defaultSharedPreferences
    get() = requireContext().defaultSharedPreferences

inline val Fragment.rotation
    get() = requireContext().rotation

inline val Fragment.isPortrait
    get() = requireContext().isPortrait

inline val Fragment.isLandscape
    get() = requireContext().isLandscape

inline val Fragment.screenWidth: Int
    get() = requireContext().screenWidth

inline val Fragment.screenHeight: Int
    get() = requireContext().screenHeight

inline val Fragment.realScreenWidth
    get() = requireContext().realScreenWidth

inline val Fragment.realScreenHeight: Int
    get() = requireContext().realScreenHeight

inline val Fragment.isScreenOn
    get() = requireContext().isScreenOn

inline val Fragment.isScreenOff
    get() = requireContext().isScreenOff

inline val Fragment.isCharging: Boolean
    get() = requireContext().isCharging

inline val Fragment.batteryLevel: Int
    get() = requireContext().batteryLevel

inline fun <reified T> Fragment.componentName() =
    requireContext().componentName<T>()

fun Fragment.componentName(className: String) =
    requireContext().componentName(className)

inline fun <reified T> Fragment.systemService() = requireContext().systemService<T>()

inline fun <reified T> Fragment.systemServiceOrNull() = requireContext().systemServiceOrNull<T>()

fun Fragment.toastShort(text: CharSequence) = requireContext().toastShort(text)

fun Fragment.toastShort(textRes: Int, vararg args: Any) =
    requireContext().toastShort(textRes, *args)

fun Fragment.toastLong(text: CharSequence) =
    requireContext().toastLong(text)

fun Fragment.toastLong(textRes: Int, vararg args: Any) =
    requireContext().toastLong(textRes, *args)

fun Fragment.hasPermissions(vararg permissions: String) =
    requireContext().hasPermissions(*permissions)

fun Fragment.isAppInstalled(packageName: String) =
    requireContext().isAppInstalled(packageName)

fun Fragment.isAppLaunchable(packageName: String) =
    requireContext().isAppLaunchable(packageName)

fun Fragment.isAppEnabled(packageName: String) =
    requireContext().isAppEnabled(packageName)

fun Fragment.dp(dp: Int) = requireContext().dp(dp)