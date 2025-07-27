plugins {
    kotlin("jvm") version "2.0.20"
    application
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("MainKt")
}

dependencies {

}

repositories {
    mavenCentral()
}

group = "org.example"
version = "1.0-SNAPSHOT"



tasks.test {
    useJUnitPlatform()
}
