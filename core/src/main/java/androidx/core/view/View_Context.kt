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

package androidx.core.view

import android.view.View
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
import androidx.core.content.realScreenHeight
import androidx.core.content.realScreenWidth
import androidx.core.content.rotation
import androidx.core.content.screenHeight
import androidx.core.content.screenWidth
import androidx.core.content.systemService
import androidx.core.content.systemServiceOrNull
import androidx.core.content.toastLong
import androidx.core.content.toastShort

inline val View.configuration
    get() = context.configuration

inline val View.displayMetrics
    get() = context.displayMetrics

inline val View.rotation
    get() = context.rotation

inline val View.isPortrait
    get() = context.isPortrait

inline val View.isLandscape
    get() = context.isLandscape

inline val View.screenWidth: Int
    get() = context.screenWidth

inline val View.screenHeight: Int
    get() = context.screenHeight

inline val View.realScreenWidth
    get() = context.realScreenWidth

inline val View.realScreenHeight: Int
    get() = context.realScreenHeight

inline val View.isScreenOn
    get() = context.isScreenOn


inline val View.isScreenOff
    get() = context.isScreenOff

inline val View.isCharging: Boolean
    get() = context.isCharging

inline val View.batteryLevel: Int
    get() = context.batteryLevel

inline fun <reified T> View.componentName() =
    context.componentName<T>()

inline fun View.componentName(className: String) =
    context.componentName(className)

inline fun <reified T> View.systemService() = context.systemService<T>()

inline fun <reified T> View.systemServiceOrNull() = context.systemServiceOrNull<T>()

inline fun View.toastShort(text: CharSequence) = context.toastShort(text)

inline fun View.toastShort(textRes: Int, vararg args: Any) =
    context.toastShort(textRes, *args)

inline fun View.toastLong(text: CharSequence) =
    context.toastLong(text)

inline fun View.toastLong(textRes: Int, vararg args: Any) =
    context.toastLong(textRes, *args)

fun View.hasPermissions(vararg permissions: String) =
    context.hasPermissions(*permissions)

inline fun View.isAppInstalled(packageName: String) =
    context.isAppInstalled(packageName)

fun View.isAppLaunchable(packageName: String) =
    context.isAppLaunchable(packageName)

fun View.isAppEnabled(packageName: String) =
    context.isAppEnabled(packageName)

inline fun View.dp(dp: Int) = context.dp(dp)