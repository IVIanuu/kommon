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

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.ivianuu.kommon.core.content.app

inline fun <reified T : Activity> Fragment.activity(): T = requireActivity() as T

fun Fragment.requireArgs(): Bundle =
    arguments ?: throw IllegalStateException("no arguments provided")

fun Fragment.requireParentFragment(): Fragment =
    parentFragment ?: throw IllegalStateException("parent fragment is null")

fun Fragment.requireTargetFragment(): Fragment =
    targetFragment ?: throw IllegalStateException("target fragment is null")

fun Fragment.requireView(): View = view ?: throw IllegalStateException("view is null")

inline fun <reified T : Fragment> Fragment.parentFragment(): T = requireParentFragment() as T

inline fun <reified T : Fragment> Fragment.parentFragmentOrNull(): T? = try {
    parentFragment<T>()
} catch (e: Exception) {
    null
}

inline fun <reified T : Fragment> Fragment.targetFragment(): T = requireTargetFragment() as T

inline fun <reified T : Fragment> Fragment.targetFragmentOrNull(): T? = try {
    targetFragment<T>()
} catch (e: Exception) {
    null
}

inline fun <reified T : Application> Fragment.app(): T = requireContext().app<T>()