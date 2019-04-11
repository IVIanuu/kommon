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

package com.ivianuu.kommon.lifecycle

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner

fun ViewModelStoreOwner.viewModelProvider(
    factory: ViewModelProvider.Factory = ViewModelProvider.NewInstanceFactory()
): ViewModelProvider = ViewModelProvider(this, factory)

inline fun <reified T : ViewModel> ViewModelStoreOwner.getViewModel(
    factory: ViewModelProvider.Factory = ViewModelProvider.NewInstanceFactory(),
    key: String = T::class.defaultViewModelKey
): T = viewModelProvider(factory).get(key, T::class.java)

inline fun <reified T : ViewModel> ViewModelStoreOwner.viewModel(
    crossinline keyProvider: () -> String = { T::class.defaultViewModelKey },
    crossinline factoryProvider: () -> ViewModelProvider.Factory = { ViewModelProvider.NewInstanceFactory() }
): Lazy<ViewModel> =
    lazy(LazyThreadSafetyMode.NONE) { getViewModel<T>(factoryProvider(), keyProvider()) }