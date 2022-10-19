plugins {
    id("java")
}

group = "ru.girmank.vk"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.code.gson:gson:2.9.1")
    implementation(project(":models"))
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}