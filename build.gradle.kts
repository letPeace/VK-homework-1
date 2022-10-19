plugins {
    id("java")
}

group = "ru.girmank.vk"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

}

allprojects{
    apply(plugin = "java")
    dependencies{
        implementation("com.intellij:annotations:12.0")
        implementation("org.projectlombok:lombok:1.18.22")
        annotationProcessor("org.projectlombok:lombok:1.18.22")
    }
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}