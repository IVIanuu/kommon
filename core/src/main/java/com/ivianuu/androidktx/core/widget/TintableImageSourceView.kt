package com.ivianuu.androidktx.core.widget

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.view.View
import androidx.core.widget.TintableImageSourceView
import com.ivianuu.androidktx.core.view.color
import com.ivianuu.androidktx.core.view.colorStateList
import com.ivianuu.androidktx.internal.NO_GETTER
import com.ivianuu.androidktx.internal.noGetter

var TintableImageSourceView.supportImageColor: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    @SuppressLint("RestrictedApi")
    set(value) {
        supportImageTintList = ColorStateList.valueOf(value)
    }

var <T> T.supportImageColorResource: Int where T : TintableImageSourceView, T : View
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) {
        supportImageColor = color(value)
    }

var <T> T.supportImageTintListResource: Int where T : TintableImageSourceView, T : View
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    @SuppressLint("RestrictedApi")
    set(value) {
        supportImageTintList = colorStateList(value)
    }