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
import com.ivianuu.kommon.core.content.*

val View.configuration: Configuration
    get() = context.configuration

val View.displayMetrics: DisplayMetrics
    get() = context.displayMetrics

val View.defaultSharedPreferences: SharedPreferences
    get() = context.defaultSharedPreferences

val View.rotation: Int
    get() = context.rotation

val View.isPortrait: Boolean
    get() = context.isPortrait

val View.isLandscape: Boolean
    get() = context.isLandscape

val View.screenWidth: Int
    get() = context.screenWidth

val View.screenHeight: Int
    get() = context.screenHeight

val View.realScreenWidth: Int
    get() = context.realScreenWidth

val View.realScreenHeight: Int
    get() = context.realScreenHeight

val View.isScreenOn: Boolean
    get() = context.isScreenOn

val View.isScreenOff: Boolean
    get() = context.isScreenOff

val View.isCharging: Boolean
    get() = context.isCharging

val View.batteryLevel: Int
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