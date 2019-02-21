package com.ivianuu.kommon.core.transition

import android.os.Build
import android.transition.Transition
import android.transition.TransitionSet
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.KITKAT)
fun transitionSetOf(vararg transitions: Transition) = TransitionSet().apply {
    transitions.forEach { addTransition(it) }
}

@RequiresApi(Build.VERSION_CODES.KITKAT)
fun transitionSetOf(transitions: Iterable<Transition>) = TransitionSet().apply {
    transitions.forEach { addTransition(it) }
}