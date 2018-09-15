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

package com.ivianuu.androidktx.core.content

import android.content.Intent
import android.os.Build
import androidx.annotation.RequiresApi

inline fun Intent.clearTask(): Intent = addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)

inline fun Intent.clearTop(): Intent = addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)

inline fun Intent.clearWhenTaskReset(): Intent =
    addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET)

inline fun Intent.excludeFromRecents(): Intent = addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS)

inline fun Intent.forwardResult(): Intent = addFlags(Intent.FLAG_ACTIVITY_FORWARD_RESULT)

@RequiresApi(Build.VERSION_CODES.N)
inline fun Intent.launchAdjacent(): Intent = addFlags(Intent.FLAG_ACTIVITY_LAUNCH_ADJACENT)

inline fun Intent.multipleTask(): Intent = addFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK)

inline fun Intent.newDocument(): Intent = addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT)

inline fun Intent.newTask(): Intent = addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

inline fun Intent.noAnimation(): Intent = addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)

inline fun Intent.noHistory(): Intent = addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY)

inline fun Intent.noUserAction(): Intent = addFlags(Intent.FLAG_ACTIVITY_NO_USER_ACTION)

inline fun Intent.previousIsTop(): Intent = addFlags(Intent.FLAG_ACTIVITY_PREVIOUS_IS_TOP)

inline fun Intent.reorderToFront(): Intent = addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)

inline fun Intent.resetTaskIfNeeded(): Intent = addFlags(Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED)

inline fun Intent.retainInRecents(): Intent = addFlags(Intent.FLAG_ACTIVITY_RETAIN_IN_RECENTS)

inline fun Intent.singleTop(): Intent = addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)

inline fun Intent.taskOnHome(): Intent = addFlags(Intent.FLAG_ACTIVITY_TASK_ON_HOME)