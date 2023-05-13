plugins {
    id("java")
}

group = "com.jmfg.training.java9to17"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.github.spotbugs:spotbugs-annotations:4.7.3")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}


tasks.withType<JavaCompile> {
    options.compilerArgs.add("--enable-preview")
}

tasks.test {
    useJUnitPlatform()
}