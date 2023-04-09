import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jooq.meta.jaxb.ForcedType
import org.jooq.meta.jaxb.Logging
import org.jooq.meta.jaxb.Property

repositories {
	mavenCentral()
}

plugins {
	id("nu.studer.jooq") version "8.1"
	kotlin("jvm") version "1.7.22"
}

dependencies {
	implementation("org.jooq:jooq:3.18.0")
	implementation("org.jooq:jooq-codegen:3.18.0")
}

jooq {
	configurations {
		create("main") {
			jooqConfiguration.apply {
				jdbc.apply {
					driver = "org.postgresql.Driver"
					url = "jdbc:postgresql://localhost:5432/dev"
					user = "root"
					password = "root"
				}
				generator.apply {
					database.apply {
						name = "org.jooq.meta.postgres.PostgresDatabase"
						includes = ".*"
						excludes = ""
						inputSchema = "public"
					}
					target.apply {
						packageName = "com.helloworld.hello"
						directory = "src/main/kotlin"
					}
				}
			}
		}
	}
}
