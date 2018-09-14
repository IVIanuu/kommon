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

import android.app.Application
import android.content.BroadcastReceiver
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import android.content.res.Configuration
import android.os.Build
import android.os.PowerManager
import android.util.DisplayMetrics
import android.view.WindowManager
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.content.pm.isAppEnabled
import androidx.core.content.pm.isAppInstalled
import androidx.core.content.pm.isAppLaunchable
import androidx.core.content.res.isLandscape
import androidx.core.content.res.isPortrait
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
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    get() {
        systemService<WindowManager>().defaultDisplay.getRealMetrics(_displayMetrics)
        return _displayMetrics.widthPixels
    }

inline val Context.realScreenHeight: Int
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    get() {
        systemService<WindowManager>().defaultDisplay.getRealMetrics(_displayMetrics)
        return _displayMetrics.heightPixels
    }

inline val Context.isScreenOn: Boolean
    get() {
        val pm = systemService<PowerManager>()
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            pm.isInteractive
        } else {
            pm.isScreenOn
        }
    }


inline val Context.isScreenOff
    get() = !isScreenOn

inline val Context.isCharging: Boolean
    get() = BatteryUtil.isCharging(this)

inline val Context.batteryLevel: Int
    get() = BatteryUtil.getBatteryLevel(this)

inline fun Context.toastShort(text: CharSequence): Toast =
    Toast.makeText(this, text, Toast.LENGTH_SHORT).apply { show() }

inline fun Context.toastShort(textRes: Int, vararg args: Any): Toast =
    Toast.makeText(this, string(textRes, *args), Toast.LENGTH_SHORT).apply { show() }

inline fun Context.toastLong(text: CharSequence): Toast =
    Toast.makeText(this, text, Toast.LENGTH_LONG).apply { show() }

inline fun Context.toastLong(textRes: Int, vararg args: Any): Toast =
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