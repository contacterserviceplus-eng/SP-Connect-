plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    // id("com.google.gms.google-services")  <- ENLEVE LE TEMPS DU TEST
}

android {
    namespace = "com.spconnect.application"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.spconnect.application"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled =
