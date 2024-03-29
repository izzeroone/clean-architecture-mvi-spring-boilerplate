import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
plugins {
    base
    kotlin("jvm") version "1.3.41" apply false
}

allprojects {

    group = "com.example"

    version = "1.0"

    repositories {
        jcenter()
    }
}

dependencies {
    // Make the root project archives configuration depend on every subproject
    subprojects.forEach {
        archives(it)
    }
}