plugins {
    java
    id("org.springframework.boot") version "3.4.3"
    id("io.spring.dependency-management") version "1.1.7"
}

var mapstructVersion = "1.6.3"
var lombokVersion = "1.18.36"
var lombokMapstructBindingVersion = "0.2.0"

group = "roshka.diegoduarte"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-web")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    implementation ("org.springframework.boot:spring-boot-starter-validation")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    implementation ("org.mapstruct:mapstruct:${mapstructVersion}")
    implementation ("org.projectlombok:lombok:${lombokVersion}")

    annotationProcessor ("org.mapstruct:mapstruct-processor:${mapstructVersion}")
    annotationProcessor ("org.projectlombok:lombok:${lombokVersion}")
    annotationProcessor ("org.projectlombok:lombok-mapstruct-binding:${lombokMapstructBindingVersion}")
    //testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    // JUnit 5 (Jupiter)
    testImplementation ("org.junit.jupiter:junit-jupiter-api")
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine")
    testImplementation ("org.mockito:mockito-core:5.16.0")
    testImplementation ("org.mockito:mockito-junit-jupiter:5.16.0")
    //database
    runtimeOnly ("com.h2database:h2")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
tasks.withType<JavaCompile> {
    options.compilerArgs.add("-Amapstruct.defaultComponentModel=spring")
}
