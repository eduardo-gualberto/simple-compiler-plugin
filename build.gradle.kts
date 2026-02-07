plugins {
    kotlin("jvm") version "2.3.0"
}

group = "simple.gradle.plugin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    // Only dependency needed
    compileOnly("org.jetbrains.kotlin:kotlin-compiler:2.3.0")
}

kotlin {
    jvmToolchain(21)

    // This avoids having to use OptIn annotations
    compilerOptions {
        optIn.add("org.jetbrains.kotlin.compiler.plugin.ExperimentalCompilerApi")
    }
}

tasks.test {
    useJUnitPlatform()
}