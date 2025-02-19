plugins {
    id("java")
}

group = "a2"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation ("org.projectlombok:lombok:1.18.32")
    annotationProcessor ("org.projectlombok:lombok:1.18.32")
    testAnnotationProcessor ("org.projectlombok:lombok:1.18.32")

    implementation ("com.fasterxml.jackson.core:jackson-databind:2.15.2")
    implementation ("com.fasterxml.jackson.core:jackson-annotations:2.15.2")
    implementation ("com.fasterxml.jackson.core:jackson-core:2.15.2")
}

tasks.test {
    useJUnitPlatform()
}