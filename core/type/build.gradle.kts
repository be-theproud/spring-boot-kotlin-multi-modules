import org.springframework.boot.gradle.tasks.bundling.BootJar

tasks {
    withType<BootJar> {
        enabled = false
    }

    withType<Jar> {
        enabled = true
    }
}

dependencies {
}