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

package com.ivianuu.kommon.core.view

import android.content.ComponentName
import android.content.SharedPreferences
import android.content.res.Configuration
import android.util.DisplayMetrics
import android.view.View
import android.widget.Toast
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

inline val View.configuration: Configuration
    get() = context.configuration

inline val View.displayMetrics: DisplayMetrics
    get() = context.displayMetrics

inline val View.defaultSharedPreferences: SharedPreferences
    get() = context.defaultSharedPreferences

inline val View.rotation: Int
    get() = context.rotation

inline val View.isPortrait: Boolean
    get() = context.isPortrait

inline val View.isLandscape: Boolean
    get() = context.isLandscape

inline val View.screenWidth: Int
    get() = context.screenWidth

inline val View.screenHeight: Int
    get() = context.screenHeight

inline val View.realScreenWidth: Int
    get() = context.realScreenWidth

inline val View.realScreenHeight: Int
    get() = context.realScreenHeight

inline val View.isScreenOn: Boolean
    get() = context.isScreenOn

inline val View.isScreenOff: Boolean
    get() = context.isScreenOff

inline val View.isCharging: Boolean
    get() = context.isCharging

inline val View.batteryLevel: Int
    get() = context.batteryLevel

inline fun <reified T> View.componentName(): ComponentName =
    context.componentName<T>()

fun View.componentName(className: String): ComponentName =
    context.componentName(className)

inline fun <reified T> View.systemService(): T = context.systemService<T>()

inline fun <reified T> View.systemServiceOrNull(): T? = context.systemServiceOrNull<T>()

fun View.toastShort(text: CharSequence): Toast = context.toastShort(text)

fun View.toastShort(textRes: Int, vararg args: Any): Toast =
    context.toastShort(textRes, *args)

fun View.toastLong(text: CharSequence): Toast =
    context.toastLong(text)

fun View.toastLong(textRes: Int, vararg args: Any): Toast =
    context.toastLong(textRes, *args)

fun View.hasPermissions(vararg permissions: String): Boolean =
    context.hasPermissions(*permissions)

fun View.isAppInstalled(packageName: String): Boolean =
    context.isAppInstalled(packageName)

fun View.isAppLaunchable(packageName: String): Boolean =
    context.isAppLaunchable(packageName)

fun View.isAppEnabled(packageName: String): Boolean =
    context.isAppEnabled(packageName)

fun View.dp(dp: Int): Float = context.dp(dp)