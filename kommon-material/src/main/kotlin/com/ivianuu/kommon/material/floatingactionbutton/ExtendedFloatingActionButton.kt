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

package com.ivianuu.kommon.material.floatingactionbutton

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton

fun ExtendedFloatingActionButton.showIf(
    show: Boolean,
    animate: Boolean = true
) {
    if (show) show(animate) else hide(animate)
}

fun ExtendedFloatingActionButton.hideIf(
    hide: Boolean,
    animate: Boolean = true
) {
    if (hide) hide(animate) else show(animate)
}

fun ExtendedFloatingActionButton.extendIf(
    extend: Boolean,
    animate: Boolean = true
) {
    if (extend) extend(animate) else shrink(animate)
}

fun ExtendedFloatingActionButton.shrinkIf(
    hide: Boolean,
    animate: Boolean = true
) {
    if (hide) shrink(animate) else extend(animate)
}