import com.gradle.enterprise.testdistribution.gradle.plugin.internal.TestDistributionExtensionInternal

plugins {
    id("com.gradle.enterprise.test-distribution")
}

tasks.withType<Test>().configureEach {
    distribution {
        enabled.set(true)
        maxLocalExecutors.set(0)
        this as TestDistributionExtensionInternal
        server.set(uri("https://ge-experiment.grdev.net"))
    }
}
