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

package androidx.core.content

import android.annotation.TargetApi
import android.app.Activity
import android.app.Application
import android.app.Service
import android.content.BroadcastReceiver
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import android.content.res.ColorStateList
import android.content.res.Configuration
import android.content.res.TypedArray
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.os.Build
import android.os.PowerManager
import android.util.DisplayMetrics
import android.util.TypedValue
import android.view.View
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.content.pm.isAppEnabled
import androidx.core.content.pm.isAppInstalled
import androidx.core.content.pm.isAppLaunchable
import androidx.core.content.res.ResourcesCompat
import androidx.core.content.res.isLandscape
import androidx.core.content.res.isPortrait
import androidx.core.content.res.use
import androidx.internal.BatteryUtil

@PublishedApi
internal val _displayMetrics = DisplayMetrics()

inline val Context.configuration: Configuration
    get() = resources.configuration

inline val Context.displayMetrics: DisplayMetrics
    get() = resources.displayMetrics

inline val Context.rotation
    get() = systemService<WindowManager>().defaultDisplay.rotation

inline val Context.isPortrait
    get() = configuration.isPortrait

inline val Context.isLandscape
    get() = configuration.isLandscape

inline val Context.screenWidth: Int
    get() = displayMetrics.widthPixels

inline val Context.screenHeight: Int
    get() = displayMetrics.heightPixels

inline val Context.realScreenWidth: Int
    get() {
        systemService<WindowManager>().defaultDisplay.getRealMetrics(_displayMetrics)
        return _displayMetrics.widthPixels
    }

inline val Context.realScreenHeight: Int
    get() {
        systemService<WindowManager>().defaultDisplay.getRealMetrics(_displayMetrics)
        return _displayMetrics.heightPixels
    }

inline val Context.isScreenOn
    get() =
        systemService<PowerManager>().isInteractive


inline val Context.isScreenOff
    get() =
        !systemService<PowerManager>().isInteractive

inline val Context.isCharging: Boolean
    get() = BatteryUtil.isCharging(this)

inline val Context.batteryLevel: Int
    get() = BatteryUtil.getBatteryLevel(this)

inline fun Context.toastShort(text: CharSequence) =
    Toast.makeText(this, text, Toast.LENGTH_SHORT).apply { show() }

inline fun Context.toastShort(textRes: Int, vararg args: Any) =
    Toast.makeText(this, string(textRes, *args), Toast.LENGTH_SHORT).apply { show() }

inline fun Context.toastLong(text: CharSequence) =
    Toast.makeText(this, text, Toast.LENGTH_LONG).apply { show() }

inline fun Context.toastLong(textRes: Int, vararg args: Any) =
    Toast.makeText(this, string(textRes, *args), Toast.LENGTH_LONG).apply { show() }

inline fun <reified T : Application> Context.app() = applicationContext as T

inline fun <reified T> Context.componentName() = ComponentName(this, T::class.java)

inline fun Context.componentName(className: String) =
    ComponentName(this, className)

inline fun Context.startForegroundServiceCompat(intent: Intent) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        startForegroundService(intent)
    } else {
        startService(intent)
    }
}

inline fun <reified T> Context.systemService() =
    ContextCompat.getSystemService<T>(this, T::class.java)!!

inline fun <reified T> Context.systemServiceOrNull() = try {
    systemService<T>()
} catch (e: Exception) {
    null
}

fun Context.registerReceiver(
    intentFilter: IntentFilter,
    onReceive: (intent: Intent) -> Unit
): BroadcastReceiver {
    return object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            onReceive(intent)
        }
    }.also { registerReceiver(it, intentFilter) }
}

fun Context.hasPermissions(vararg permissions: String): Boolean {
    return permissions.all {
        ContextCompat.checkSelfPermission(this, it) == PackageManager.PERMISSION_GRANTED
    }
}

inline fun Context.isAppInstalled(packageName: String) =
    packageManager.isAppInstalled(packageName)

fun Context.isAppLaunchable(packageName: String) =
    packageManager.isAppLaunchable(packageName)

fun Context.isAppEnabled(packageName: String) =
    packageManager.isAppEnabled(packageName)

inline fun Context.dp(dp: Int) = dp * displayMetrics.density