import utils.*

plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
}

android {
    compileSdk = Base.currentSDK

    defaultConfig {
        minSdk = Base.minSDK
        targetSdk = Base.currentSDK
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}


dependencies {
    implementation (Dependencies.Ktx.core)
    implementation (Dependencies.Androidx.appCompat)
    implementation (Dependencies.Androidx.material)
    implementation (Dependencies.Androidx.constraintLayout)
}