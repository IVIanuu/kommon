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
    const val version = "${Build.versionName}-dev-1"
}

object Versions {
    const val androidGradlePlugin = "3.3.0"
    const val androidxAnnotation = "1.0.0"
    const val androidxAppCompat = "1.0.2"
    const val androidxCore = "1.0.1"
    const val androidxFragment = "1.0.0"
    const val androidxLifecycle = "2.0.0"
    const val androidxRecyclerView = "1.0.0"
    const val androidxViewPager = "1.0.0"
    const val bintray = "1.8.4"
    const val constraintLayout = "1.1.3"
    const val kotlin = "1.3.20"
    const val materialComponents = "1.1.0-alpha02"
    const val mavenGradle = "2.1"
}

object Deps {
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"

    const val androidXAnnotation = "androidx.annotation:annotation:${Versions.androidxAnnotation}"
    const val androidxAppCompat = "androidx.appcompat:appcompat:${Versions.androidxAppCompat}"
    const val androidxCore = "androidx.core:core:${Versions.androidxCore}"
    const val androidxCoreKtx = "androidx.core:core-ktx:${Versions.androidxCore}"
    const val androidxFragment = "androidx.fragment:fragment:${Versions.androidxFragment}"
    const val androidxLifecycleExtensions =
        "androidx.lifecycle:lifecycle-extensions:${Versions.androidxLifecycle}"
    const val androidxRecyclerView =
        "androidx.recyclerview:recyclerview:${Versions.androidxRecyclerView}"
    const val androidxViewPager = "androidx.viewpager:viewpager:${Versions.androidxViewPager}"

    const val bintrayGradlePlugin =
        "com.jfrog.bintray.gradle:gradle-bintray-plugin:${Versions.bintray}"

    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    const val materialComponents =
        "com.google.android.material:material:${Versions.materialComponents}"

    const val mavenGradlePlugin = "com.github.dcendents:android-maven-gradle-plugin:${Versions.mavenGradle}"
}