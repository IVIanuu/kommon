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

package com.ivianuu.kommon.fragment.app

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ivianuu.kommon.lifecycle.defaultViewModelKey
import com.ivianuu.kommon.lifecycle.getViewModel

inline fun <reified T : ViewModel> Fragment.getActivityViewModel(
    factory: ViewModelProvider.Factory = ViewModelProvider.NewInstanceFactory(),
    key: String = T::class.defaultViewModelKey
): T = requireActivity().getViewModel<T>(factory, key)

inline fun <reified T : ViewModel> Fragment.activityViewModel(
    crossinline keyProvider: () -> String = { T::class.defaultViewModelKey },
    crossinline factoryProvider: () -> ViewModelProvider.Factory = { ViewModelProvider.NewInstanceFactory() }
): Lazy<ViewModel> =
    lazy(LazyThreadSafetyMode.NONE) { getActivityViewModel<T>(factoryProvider(), keyProvider()) }

inline fun <reified T : ViewModel> Fragment.getParentViewModel(
    factory: ViewModelProvider.Factory = ViewModelProvider.NewInstanceFactory(),
    key: String = T::class.defaultViewModelKey
): T = requireParentFragment().getViewModel<T>(factory, key)

inline fun <reified T : ViewModel> Fragment.parentViewModel(
    crossinline keyProvider: () -> String = { T::class.defaultViewModelKey },
    crossinline factoryProvider: () -> ViewModelProvider.Factory = { ViewModelProvider.NewInstanceFactory() }
): Lazy<ViewModel> =
    lazy(LazyThreadSafetyMode.NONE) { getParentViewModel<T>(factoryProvider(), keyProvider()) }

inline fun <reified T : ViewModel> Fragment.getTargetViewModel(
    factory: ViewModelProvider.Factory = ViewModelProvider.NewInstanceFactory(),
    key: String = T::class.defaultViewModelKey
): T = requireTargetFragment().getViewModel<T>(factory, key)

inline fun <reified T : ViewModel> Fragment.targetViewModel(
    crossinline keyProvider: () -> String = { T::class.defaultViewModelKey },
    crossinline factoryProvider: () -> ViewModelProvider.Factory = { ViewModelProvider.NewInstanceFactory() }
): Lazy<ViewModel> =
    lazy(LazyThreadSafetyMode.NONE) { getTargetViewModel<T>(factoryProvider(), keyProvider()) }