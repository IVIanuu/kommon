package com.ivianuu.kommon.core.animation

import android.animation.Animator
import android.animation.AnimatorSet

fun animatorSetOf(vararg animators: Animator, playTogether: Boolean = true): AnimatorSet {
    return AnimatorSet().apply {
        if (animators.isNotEmpty()) {
            if (playTogether) {
                playTogether(*animators)
            } else {
                playSequentially(*animators)
            }
        }
    }
}

fun animatorSetOf(animators: List<Animator>, playTogether: Boolean = true): AnimatorSet {
    return AnimatorSet().apply {
        if (animators.isNotEmpty()) {
            if (playTogether) {
                playTogether(animators)
            } else {
                playSequentially(animators)
            }
        }
    }
}