// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.0.2" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
}
buildscript{
    repositories{
        google()
        mavenCentral()

        maven {
            url = uri("https://devrepo.kakao.com/nexus/repository/kakaomap-releases/")
        }
    }
    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.44.2")
    }
}