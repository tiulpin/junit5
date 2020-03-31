plugins {
	`kotlin-dsl`
}

repositories {
	mavenCentral()
	gradlePluginPortal()
	maven {
		url = uri("https://repo.gradle.org/gradle/enterprise-libs-snapshots-local")
		credentials {
			username = extra["enterprise.snapshots.username"].toString()
			password = extra["enterprise.snapshots.password"].toString()
		}
		authentication {
			create<BasicAuthentication>("basic")
		}
	}
}

dependencies {
	implementation(kotlin("gradle-plugin"))
	implementation("de.marcphilipp.gradle:nexus-publish-plugin:0.4.0")
	implementation("biz.aQute.bnd:biz.aQute.bnd.gradle:5.0.0")
	implementation("com.github.jengelman.gradle.plugins:shadow:5.2.0")
	implementation("com.gradle.enterprise:test-distribution-gradle-plugin:1.0-20200324095937-master")
}
