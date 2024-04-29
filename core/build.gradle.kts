plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    kotlin("kapt")
    alias(libs.plugins.daggerHilt)
}

android {
    namespace = "andaeys.io.momodulo.core"
    compileSdk = 34

    defaultConfig {
        minSdk = AppConfig.minSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)

    //dagger Hiltk
    implementation(libs.hilt.android)
    kapt(libs.dagger.hilt.android.compiler)

    // Kotlin Coroutines
    implementation(libs.kotlinx.coroutines.android)
    // Retrofit
    implementation(libs.retrofit)
    implementation(libs.converter.moshi)

    testImplementation(libs.junit)
    testImplementation(libs.mockito.core)
    testImplementation(libs.gson)
    testImplementation(libs.kotlinx.coroutines.test)
    testImplementation(libs.junit.v412)

    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}

// Allow references to generated code
kapt {
    correctErrorTypes = true
}
