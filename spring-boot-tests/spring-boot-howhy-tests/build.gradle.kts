plugins {
    id("java")
}

group = "com.example.dubbo"
version = "2.7.18-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

	implementation(enforcedPlatform(project(":spring-boot-project:spring-boot-autoconfigure")))
	implementation(enforcedPlatform(project(":spring-boot-project:spring-boot-dependencies")))
	implementation(project(":spring-boot-project:spring-boot"))
	implementation("jakarta.validation:jakarta.validation-api")

	testImplementation(project(":spring-boot-project:spring-boot-starters:spring-boot-starter-test"))
	testImplementation(project(":spring-boot-project:spring-boot-tools:spring-boot-configuration-metadata"))
}

tasks.test {
    useJUnitPlatform()
}