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

import android.content.Context
import android.content.pm.PackageManager
import android.content.res.Configuration
import android.os.PowerManager
import android.util.DisplayMetrics
import android.view.WindowManager
import androidx.core.content.ContextCompat
import androidx.core.content.batteryLevel
import androidx.core.content.componentName
import androidx.core.content.configuration
import androidx.core.content.displayMetrics
import androidx.core.content.dp
import androidx.core.content.hasPermissions
import androidx.core.content.isAppEnabled
import androidx.core.content.isAppInstalled
import androidx.core.content.isAppLaunchable
import androidx.core.content.isCharging
import androidx.core.content.isLandscape
import androidx.core.content.isPortrait
import androidx.core.content.isScreenOff
import androidx.core.content.isScreenOn
import androidx.core.content.pm.isAppEnabled
import androidx.core.content.pm.isAppInstalled
import androidx.core.content.pm.isAppLaunchable
import androidx.core.content.realScreenHeight
import androidx.core.content.realScreenWidth
import androidx.core.content.res.isLandscape
import androidx.core.content.res.isPortrait
import androidx.core.content.rotation
import androidx.core.content.screenHeight
import androidx.core.content.screenWidth
import androidx.core.content.systemService
import androidx.core.content.systemServiceOrNull
import androidx.core.content.toastLong
import androidx.core.content.toastShort
import androidx.internal.BatteryUtil

inline val Fragment.configuration
    get() = requireContext().configuration

inline val Fragment.displayMetrics
    get() = requireContext().displayMetrics

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

inline fun Fragment.componentName(className: String) =
    requireContext().componentName(className)

inline fun <reified T> Fragment.systemService() = requireContext().systemService<T>()

inline fun <reified T> Fragment.systemServiceOrNull() = requireContext().systemServiceOrNull<T>()

inline fun Fragment.toastShort(text: CharSequence) = requireContext().toastShort(text)

inline fun Fragment.toastShort(textRes: Int, vararg args: Any) =
    requireContext().toastShort(textRes, *args)

inline fun Fragment.toastLong(text: CharSequence) =
    requireContext().toastLong(text)

inline fun Fragment.toastLong(textRes: Int, vararg args: Any) =
    requireContext().toastLong(textRes, *args)

fun Fragment.hasPermissions(vararg permissions: String) =
    requireContext().hasPermissions(*permissions)

inline fun Fragment.isAppInstalled(packageName: String) =
    requireContext().isAppInstalled(packageName)

fun Fragment.isAppLaunchable(packageName: String) =
    requireContext().isAppLaunchable(packageName)

fun Fragment.isAppEnabled(packageName: String) =
    requireContext().isAppEnabled(packageName)

inline fun Fragment.dp(dp: Int) = requireContext().dp(dp)