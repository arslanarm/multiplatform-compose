plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

version = "unspecified"

repositories {
    mavenCentral()
}

kotlin {
    js(IR) {
        browser {
            binaries.executable()
        }
    }

    sourceSets {
        named("jsMain") {
            dependencies {
                implementation(project(":common"))
                implementation(compose.web.core)
            }
        }
    }
}
