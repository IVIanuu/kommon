package com.ivianuu.kommon.material.floatingactionbutton

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton

fun ExtendedFloatingActionButton.showIf(
    show: Boolean,
    animate: Boolean = true
) {
    if (show) show(animate) else hide(animate)
}

fun ExtendedFloatingActionButton.hideIf(
    hide: Boolean,
    animate: Boolean = true
) {
    if (hide) hide(animate) else show(animate)
}

fun ExtendedFloatingActionButton.extendIf(
    extend: Boolean,
    animate: Boolean = true
) {
    if (extend) extend(animate) else shrink(animate)
}

fun ExtendedFloatingActionButton.shrinkIf(
    hide: Boolean,
    animate: Boolean = true
) {
    if (hide) shrink(animate) else extend(animate)
}