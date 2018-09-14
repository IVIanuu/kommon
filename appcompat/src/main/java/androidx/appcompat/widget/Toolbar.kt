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

package androidx.appcompat.widget

import androidx.core.view.color
import androidx.core.view.drawable
import androidx.core.view.iconColor
import androidx.internal.NO_GETTER
import androidx.internal.noGetter

var Toolbar.logoColor: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { logo?.setTint(value) }

var Toolbar.logoColorResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { logoColor = color(value) }

var Toolbar.logoResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { logo = drawable(value) }

var Toolbar.logoDescriptionResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { setLogoDescription(value) }

var Toolbar.menuIconColor: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { menu.iconColor = value }

var Toolbar.menuIconColorResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { menuIconColor = color(value) }

var Toolbar.navigationContentDescriptionResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { setNavigationContentDescription(value) }

var Toolbar.navigationIconResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { setNavigationIcon(value) }

var Toolbar.navigationIconColor: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { navigationIcon?.setTint(value) }

var Toolbar.navigationIconColorResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { navigationIconColor = color(value) }

var Toolbar.overflowIconResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { overflowIcon = drawable(value) }

var Toolbar.overflowIconColor: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { navigationIcon?.setTint(value) }

var Toolbar.overflowIconColorResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { navigationIcon?.setTint(value) }

var Toolbar.titleResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { setTitle(value) }

var Toolbar.titleTextColor: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { setTitleTextColor(value) }

var Toolbar.titleTextColorResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { titleTextColor = color(value) }

var Toolbar.subtitleTextColor: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { setSubtitleTextColor(value) }

var Toolbar.subtitleTextColorResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { subtitleTextColor = color(value) }

var Toolbar.subtitleResource: Int
    @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
    get() = noGetter()
    set(value) { setSubtitle(value) }

fun Toolbar.replaceMenu(newMenu: Int) {
    menu.clear()
    inflateMenu(newMenu)
}