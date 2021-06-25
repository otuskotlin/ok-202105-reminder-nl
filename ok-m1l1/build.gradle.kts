plugins {
    kotlin("jvm") version "1.5.10"
}

group = "ru.otus.larna"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    testImplementation(kotlin("test-junit"))
}
