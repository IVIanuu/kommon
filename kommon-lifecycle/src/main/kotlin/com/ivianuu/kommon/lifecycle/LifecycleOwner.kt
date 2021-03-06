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

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner

fun LifecycleOwner.doOnAny(block: (owner: LifecycleOwner, event: Lifecycle.Event) -> Unit): LifecycleObserver =
    lifecycle.doOnAny(block)

fun LifecycleOwner.doOnCreate(block: (owner: LifecycleOwner) -> Unit): LifecycleObserver =
    lifecycle.doOnCreate(block)

fun LifecycleOwner.doOnStart(block: (owner: LifecycleOwner) -> Unit): LifecycleObserver =
    lifecycle.doOnStart(block)

fun LifecycleOwner.doOnResume(block: (owner: LifecycleOwner) -> Unit): LifecycleObserver =
    lifecycle.doOnResume(block)

fun LifecycleOwner.doOnPause(block: (owner: LifecycleOwner) -> Unit): LifecycleObserver =
    lifecycle.doOnPause(block)

fun LifecycleOwner.doOnStop(block: (owner: LifecycleOwner) -> Unit): LifecycleObserver =
    lifecycle.doOnStop(block)

fun LifecycleOwner.doOnDestroy(block: (owner: LifecycleOwner) -> Unit): LifecycleObserver =
    lifecycle.doOnDestroy(block)