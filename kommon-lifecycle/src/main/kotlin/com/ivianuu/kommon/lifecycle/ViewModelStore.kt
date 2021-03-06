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

package com.ivianuu.kommon.lifecycle

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelStore

private val mMapField by lazy {
    val field = ViewModelStore::class.java.getDeclaredField("mMap")
    field.isAccessible = true
    field
}

val ViewModelStore.viewModels: Map<String, ViewModel>
    get() = mMapField.get(this) as Map<String, out ViewModel>