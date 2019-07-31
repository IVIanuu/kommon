/*
 * Copyright 2019 Manuel Wrage
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

package com.ivianuu.kommon.core.graphics

import android.graphics.Bitmap
import android.util.Base64
import java.io.ByteArrayOutputStream
import kotlin.math.round

fun Bitmap.resize(width: Int, height: Int): Bitmap {
    val srcWidth = getWidth()

    val srcHeight = getHeight()

    val widthRatio = srcWidth.toFloat() / width.toFloat()
    val heightRatio = srcHeight.toFloat() / height.toFloat()

    return if (widthRatio < heightRatio) {
        val scaleBitmap = Bitmap.createScaledBitmap(
            this, width,
            round(srcHeight / widthRatio).toInt(), true
        )
        Bitmap.createBitmap(
            scaleBitmap, 0, round((scaleBitmap.height - height) / 2.0f).toInt(),
            width, height
        )
    } else {
        val scaleBitmap = Bitmap.createScaledBitmap(
            this, round(srcWidth / heightRatio).toInt(),
            height, true
        )

        Bitmap.createBitmap(
            scaleBitmap, round((scaleBitmap.width - width) / 2.0f).toInt(), 0,
            width, height
        )
    }
}

fun Bitmap.toBase64String(): String {
    return Base64.encodeToString(toByteArray(), Base64.DEFAULT)
}

fun Bitmap.toByteArray(compressFormat: Bitmap.CompressFormat = Bitmap.CompressFormat.PNG): ByteArray {
    val stream = ByteArrayOutputStream()
    compress(compressFormat, 100, stream)
    return stream.toByteArray()
}