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

package com.ivianuu.kommon.core.content

import android.content.Intent
import android.os.Build
import androidx.annotation.RequiresApi

fun Intent.clearTask(): Intent = addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)

fun Intent.clearTop(): Intent = addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)

fun Intent.clearWhenTaskReset(): Intent =
    addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET)

fun Intent.excludeFromRecents(): Intent = addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS)

fun Intent.forwardResult(): Intent = addFlags(Intent.FLAG_ACTIVITY_FORWARD_RESULT)

@RequiresApi(Build.VERSION_CODES.N)
fun Intent.launchAdjacent(): Intent = addFlags(Intent.FLAG_ACTIVITY_LAUNCH_ADJACENT)

fun Intent.multipleTask(): Intent = addFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK)

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Intent.newDocument(): Intent = addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT)

fun Intent.newTask(): Intent = addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

fun Intent.noAnimation(): Intent = addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)

fun Intent.noHistory(): Intent = addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY)

fun Intent.noUserAction(): Intent = addFlags(Intent.FLAG_ACTIVITY_NO_USER_ACTION)

fun Intent.previousIsTop(): Intent = addFlags(Intent.FLAG_ACTIVITY_PREVIOUS_IS_TOP)

fun Intent.reorderToFront(): Intent = addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)

fun Intent.resetTaskIfNeeded(): Intent = addFlags(Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED)

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Intent.retainInRecents(): Intent = addFlags(Intent.FLAG_ACTIVITY_RETAIN_IN_RECENTS)

fun Intent.singleTop(): Intent = addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)

fun Intent.taskOnHome(): Intent = addFlags(Intent.FLAG_ACTIVITY_TASK_ON_HOME)