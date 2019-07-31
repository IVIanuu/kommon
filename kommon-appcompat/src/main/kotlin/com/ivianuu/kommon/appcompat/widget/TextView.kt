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

package com.ivianuu.kommon.appcompat.widget

import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.text.PrecomputedTextCompat
import androidx.core.widget.TextViewCompat
import com.ivianuu.kommon.core.view.string

fun TextView.setTextFuture(text: CharSequence?) {
    if (text != null) {
        if (this is AppCompatTextView) {
            val precomputedText = PrecomputedTextCompat
                .getTextFuture(text, TextViewCompat.getTextMetricsParams(this), null)
            setTextFuture(precomputedText)
        } else {
            val precomputedText = PrecomputedTextCompat.create(
                text, TextViewCompat.getTextMetricsParams(this)
            )
            TextViewCompat.setPrecomputedText(this, precomputedText)
        }
    } else {
        this.text = null
    }
}

fun TextView.setTextFuture(textRes: Int) {
    setTextFuture(string(textRes))
}