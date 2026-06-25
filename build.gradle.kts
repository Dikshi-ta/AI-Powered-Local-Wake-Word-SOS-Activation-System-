// build.gradle.kts (Project-level)
plugins {
    id("com.android.application") version "8.13.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
}

task("clean", Delete::class) {
    delete(rootProject.buildDir)
}