object Version {
    const val core = "1.9.0"
    const val appcompat = "1.5.1"
    const val androidMaterial = "1.6.1"
    const val constraintLayout = "2.1.4"

    const val testRunner = "1.5.2"

    const val testImplJunit = "4.13.2"
    const val androidTestImplJunit = "1.1.3"
    const val androidTestEspresso = "3.4.0"

    const val retrofit = "2.9.0"
    const val gsonConvertor = "2.9.0"
    const val okHttp = "4.9.0"
    const val scalerConvertor = "2.1.0"

    const val kotlinCoroutines = "1.6.1"

    const val coroutineLifecycleScope = "2.5.1"

    const val glide = "4.12.0"

    const val viewModelDeligate = "1.6.0"

    const val dagger = "2.44"
    const val hiltCompiler = "1.0.0"
    const val hiltComposeNavigation = "1.0.0"

    const val roomVersion = "2.4.3"

    const val swipeRefresh = "1.1.0"

    const val lottieAnimations = "3.4.2"

    // compose
    const val composeUiVersion = "1.3.3"
    const val composeActivity = "1.6.1"
    const val composeMaterial = "1.3.1"

    const val composeNavigation = "2.6.0-alpha05"

    const val coilImageLoading = "2.2.2"

    // testImplementation versions
    const val kotlinxCoroutine = "1.6.4"
    const val turbine = "0.12.1"
    const val mockito = "3.9.0"
    const val mockitoKotlin = "2.0.0"
    const val mockitoInline = "2.25.0"

    // dagger hilt testing
    const val daggerHiltTestImpl = "2.44"
    const val daggerHiltAndroidTestImpl = "2.44"
}

object Deps {

    const val core = "androidx.core:core-ktx:${Version.core}"
    const val appCompat = "androidx.appcompat:appcompat:${Version.appcompat}"
    const val androidMaterial = "com.google.android.material:material:${Version.androidMaterial}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Version.constraintLayout}"

    // testing
    const val testRunner = "androidx.test:runner:${Version.testRunner}"

}

object TestImplementation {

    const val junit = "junit:junit:${Version.testImplJunit}"
    const val kotlinxCoroutine =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Version.kotlinxCoroutine}"
    const val turbine = "app.cash.turbine:turbine:${Version.turbine}"
    const val mockito = "org.mockito:mockito-core:${Version.mockito}"
    const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Version.mockitoKotlin}"
    const val mockitoInline = "org.mockito:mockito-inline:${Version.mockitoInline}"
}

object AndroidTestImplementation {

    const val junit = "androidx.test.ext:junit:${Version.androidTestImplJunit}"
    const val espresso = "androidx.test.espresso:espresso-core:${Version.androidTestEspresso}"

}


object Retrofit {
    const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
    const val gsonConvertor = "com.squareup.retrofit2:converter-gson:${Version.gsonConvertor}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Version.okHttp}"
    const val scalersConvertors =
        "com.squareup.retrofit2:converter-scalars:${Version.scalerConvertor}"
}

object Coroutines {
    const val coroutineCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.kotlinCoroutines}"
    const val coroutineAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.kotlinCoroutines}"
}

object CoroutinesLifecycleScope {
    const val lifecycleViewModel =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.coroutineLifecycleScope}"
    const val lifeCycleRuntime =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Version.coroutineLifecycleScope}"
}

object Glide {
    const val glide = "com.github.bumptech.glide:glide:${Version.glide}"
    const val annotationProcessor = "com.github.bumptech.glide:compiler:${Version.glide}"
}

object CoilImageLoadingLib {
    const val coil = "io.coil-kt:coil-compose:${Version.coilImageLoading}"
}

object ViewModelDelegate {
    const val viewModelDeligate = "androidx.activity:activity-ktx:${Version.viewModelDeligate}"
}

object DaggerHilt {
    const val hilt = "com.google.dagger:hilt-android:${Version.dagger}"
    const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:${Version.dagger}"
    const val hiltCompiler = "com.google.dagger:hilt-compiler:${Version.dagger}"
    const val hiltComposeNavigation =
        "androidx.hilt:hilt-navigation-compose:${Version.hiltComposeNavigation}"
}

object DaggerHiltTestingTestImpl {
    // For Robolectric tests.
    const val daggerHiltTestImplRobolectric = "com.google.dagger:hilt-android-testing:${Version.daggerHiltTestImpl}"
    const val daggerHiltKaptTestRobolectric = "com.google.dagger:hilt-android-compiler:${Version.daggerHiltTestImpl}"

    // For instrumented tests.
    const val daggerHiltAndroidTestImpl = "com.google.dagger:hilt-android-testing:${Version.daggerHiltAndroidTestImpl}"
    const val daggerHiltAndroidTestKapt = "com.google.dagger:hilt-android-compiler:${Version.daggerHiltAndroidTestImpl}"
}

object Room {
    const val roomCompiler = "androidx.room:room-compiler:${Version.roomVersion}"
    const val room = "androidx.room:room-ktx:${Version.roomVersion}"
}

object CircularProgressBar {
    const val swipeRefresh = "androidx.swiperefreshlayout:swiperefreshlayout:${Version.swipeRefresh}"
}

object LottieAnimations {
    const val lottieAnimations = "com.airbnb.android:lottie:${Version.lottieAnimations}"
}

// compose

object JetpackCompose {
    const val composeActivity = "androidx.activity:activity-compose:${Version.composeActivity}"
    const val composeUi = "androidx.compose.ui:ui:${Version.composeUiVersion}"
    const val composeUiToolingPreview =
        "androidx.compose.ui:ui-tooling-preview:${Version.composeUiVersion}"
    const val composeMaterial = "androidx.compose.material:material:${Version.composeMaterial}"
    const val navigation = "androidx.navigation:navigation-compose:${Version.composeNavigation}"
}

object ComposeAndroidTestImplementation {
    const val composeUiTest = "androidx.compose.ui:ui-test-junit4:${Version.composeMaterial}"
}

object ComposeDebugImplementation {
    const val toolingUi = "androidx.compose.ui:ui-tooling:${Version.composeUiVersion}"
    const val manifestTest = "androidx.compose.ui:ui-test-manifest:${Version.composeUiVersion}"
}


object Plugins {
    const val ANDROID_LIBRARY = "com.android.library"
    const val KOTLIN_ANDROID = "org.jetbrains.kotlin.android"
    const val DAGGER_HILT = "com.google.dagger.hilt.android"
    const val KOTLIN_KAPT = "kapt"
}


