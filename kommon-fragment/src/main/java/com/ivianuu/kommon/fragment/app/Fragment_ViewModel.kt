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

package com.ivianuu.kommon.fragment.app

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ivianuu.kommon.lifecycle.defaultViewModelKey
import com.ivianuu.kommon.lifecycle.viewModel

inline fun <reified T : ViewModel> Fragment.activityViewModel(
    factory: ViewModelProvider.Factory = ViewModelProvider.NewInstanceFactory(),
    key: String = T::class.defaultViewModelKey
) = requireActivity().viewModel<T>(factory, key)

// todo make crossinline when fixed
inline fun <reified T : ViewModel> Fragment.bindActivityViewModel(
    noinline keyProvider: () -> String = { T::class.defaultViewModelKey },
    noinline factoryProvider: () -> ViewModelProvider.Factory = { ViewModelProvider.NewInstanceFactory() }
) = lazy(LazyThreadSafetyMode.NONE) { activityViewModel<T>(factoryProvider(), keyProvider()) }

inline fun <reified T : ViewModel> Fragment.parentViewModel(
    factory: ViewModelProvider.Factory = ViewModelProvider.NewInstanceFactory(),
    key: String = T::class.defaultViewModelKey
) = requireParentFragment().viewModel<T>(factory, key)

// todo make crossinline when fixed
inline fun <reified T : ViewModel> Fragment.bindParentViewModel(
    noinline keyProvider: () -> String = { T::class.defaultViewModelKey },
    noinline factoryProvider: () -> ViewModelProvider.Factory = { ViewModelProvider.NewInstanceFactory() }
) = lazy(LazyThreadSafetyMode.NONE) { parentViewModel<T>(factoryProvider(), keyProvider()) }

inline fun <reified T : ViewModel> Fragment.targetViewModel(
    factory: ViewModelProvider.Factory = ViewModelProvider.NewInstanceFactory(),
    key: String = T::class.defaultViewModelKey
) = requireTargetFragment().viewModel<T>(factory, key)

// todo make crossinline when fixed
inline fun <reified T : ViewModel> Fragment.bindTargetViewModel(
    noinline keyProvider: () -> String = { T::class.defaultViewModelKey },
    noinline factoryProvider: () -> ViewModelProvider.Factory = { ViewModelProvider.NewInstanceFactory() }
) = lazy(LazyThreadSafetyMode.NONE) { targetViewModel<T>(factoryProvider(), keyProvider()) }