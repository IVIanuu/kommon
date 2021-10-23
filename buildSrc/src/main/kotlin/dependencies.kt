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

@file:Suppress("ClassName", "unused")

object Build {
    const val applicationId = "com.ivianuu.kommon.sample"
    const val buildToolsVersion = "28.0.3"

    const val compileSdk = 28
    const val minSdk = 14
    const val targetSdk = 28
    const val versionCode = 1
    const val versionName = "0.0.1"
}

object Publishing {
    const val groupId = "com.ivianuu.kommon"
    const val vcsUrl = "https://github.com/IVIanuu/kommon"
    const val version = "${Build.versionName}-dev13"
}

object Versions {
    const val androidGradlePlugin = "3.6.0"
    const val androidxAppCompat = "1.1.0-alpha05"
    const val androidxCore = "1.1.0-alpha05"
    const val androidxFragment = "1.1.0-alpha08"
    const val androidxLifecycle = "2.2.0-alpha01"
    const val androidxRecyclerView = "1.1.0-alpha04"
    const val androidxViewPager = "1.0.0"
    const val bintray = "1.8.4"
    const val constraintLayout = "2.0.0-beta3"
    const val kotlin = "1.3.40"
    const val materialComponents = "1.1.0-alpha06"
    const val mavenGradle = "2.1"
}

object Deps {
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"

    const val androidxAppCompat = "androidx.appcompat:appcompat:${Versions.androidxAppCompat}"
    const val androidxCore = "androidx.core:core-ktx:${Versions.androidxCore}"
    const val androidxFragment = "androidx.fragment:fragment-ktx:${Versions.androidxFragment}"
    const val androidxLifecycleLiveData =
        "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.androidxLifecycle}"
    const val androidxLifecycleViewModel =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.androidxLifecycle}"
    const val androidxRecyclerView =
        "androidx.recyclerview:recyclerview:${Versions.androidxRecyclerView}"
    const val androidxViewPager = "androidx.viewpager:viewpager:${Versions.androidxViewPager}"

    const val bintrayGradlePlugin =
        "com.jfrog.bintray.gradle:gradle-bintray-plugin:${Versions.bintray}"

    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    const val materialComponents =
        "com.google.android.material:material:${Versions.materialComponents}"

    const val mavenGradlePlugin =
        "com.github.dcendents:android-maven-gradle-plugin:${Versions.mavenGradle}"
}