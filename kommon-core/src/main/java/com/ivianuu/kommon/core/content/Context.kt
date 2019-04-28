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

package com.ivianuu.kommon.core.content

import android.content.*
import android.content.pm.PackageManager
import android.content.res.Configuration
import android.os.BatteryManager
import android.os.Build
import android.os.PowerManager
import android.util.DisplayMetrics
import android.view.WindowManager
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import com.ivianuu.kommon.core.content.pm.isAppEnabled
import com.ivianuu.kommon.core.content.pm.isAppInstalled
import com.ivianuu.kommon.core.content.pm.isAppLaunchable
import com.ivianuu.kommon.core.content.res.isLandscape
import com.ivianuu.kommon.core.content.res.isPortrait

inline fun <reified T> Context.componentName(): ComponentName = ComponentName(this, T::class.java)

fun Context.componentName(className: String): ComponentName =
    ComponentName(this, className)

fun Context.startForegroundServiceCompat(intent: Intent) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        startForegroundService(intent)
    } else {
        startService(intent)
    }
}

inline fun <reified T> Context.systemService(): T =
    ContextCompat.getSystemService<T>(this, T::class.java)!!

inline fun <reified T> Context.systemServiceOrNull(): T? = try {
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

fun Context.dp(dp: Int): Float = dp * resources.displayMetrics.density