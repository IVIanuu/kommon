package com.ivianuu.androidktx.core.view

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.os.Build
import android.view.View
import androidx.annotation.RequiresApi
import androidx.core.view.TintableBackgroundView
import com.ivianuu.androidktx.internal.NO_GETTER
import com.ivianuu.androidktx.internal.noGetter

var TintableBackgroundView.supportBackgroundColor: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    @SuppressLint("RestrictedApi")
    set(value) {
        supportBackgroundTintList = ColorStateList.valueOf(value)
    }

var <T> T.supportBackgroundColorResource: Int where T : TintableBackgroundView, T : View
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) {
        supportBackgroundColor = color(value)
    }

var <T> T.supportBackgroundTintListResource: Int where T : TintableBackgroundView, T : View
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    set(value) {
        supportBackgroundTintList = colorStateList(value)
    }