@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.androidApp)
    alias(libs.plugins.jetbrainskotlinAndroid)
    id("kotlin-kapt")
    alias(libs.plugins.daggerHilt)
}

android {
    namespace = "com.realform.blog"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.realform.blog"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose=true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.kotlinCompilerExtensionVersion.get()
    }
    packaging {
            resources {
                excludes += "/META-INF/{AL2.0,LGPL2.1}"
                merge( "META-INF/gradle/incremental.annotation.processors")
                resources.excludes.add("META-INF/*")
            }
    }
}

dependencies {

    implementation(libs.bundles.core)
    implementation(libs.bundles.compose)
    implementation (libs.bundles.composeBOM)
    testImplementation(libs.bundles.testImplementation)

    implementation(libs.bundles.hilt)
    kapt (libs.hiltCompiler)

    implementation( project(":Core:data"))
    implementation( project(":Core:domain"))
}