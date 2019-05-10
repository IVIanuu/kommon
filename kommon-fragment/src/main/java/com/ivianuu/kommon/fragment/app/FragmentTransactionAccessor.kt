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

package androidx.fragment.app

internal fun FragmentTransaction.addSharedElementImpl(
    src: String,
    target: String
): FragmentTransaction {
    if (FragmentTransition.supportsTransition() && this is BackStackRecord) {
        when {
            mSharedElementSourceNames == null -> {
                mSharedElementSourceNames = ArrayList()
                mSharedElementTargetNames = ArrayList()
            }
            mSharedElementTargetNames.contains(target) -> {
                throw IllegalArgumentException(
                    "A shared element with the target name '$target' has already been added to the transaction."
                )
            }
            mSharedElementSourceNames.contains(src) -> {
                throw IllegalArgumentException(
                    "A shared element with the source name '$src' has already been added to the transaction."
                )
            }
        }

        mSharedElementSourceNames.add(src)
        mSharedElementTargetNames.add(target)
    }

    return this
}