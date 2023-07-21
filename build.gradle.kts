import org.jetbrains.kotlin.gradle.dsl.KotlinCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions

plugins {
  kotlin("jvm") version "1.9.0"
  application
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.2")
}

kotlin {
  jvmToolchain(17)
}

tasks.withType<KotlinCompile<KotlinJvmOptions>> {
  kotlinOptions {
    freeCompilerArgs += "-Xcontext-receivers"
  }
}

application {
  mainClass.set("MainKt")
}
