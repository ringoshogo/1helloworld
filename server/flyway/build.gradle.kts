import nu.studer.gradle.jooq.JooqEdition
import org.jooq.meta.jaxb.Logging

plugins {
	id("nu.studer.jooq") version "8.1"
	id("java")
}

repositories {
	mavenCentral()
}

dependencies {
	jooqGenerator("org.postgresql:postgresql:42.2.23")
}

jooq {
	version.set("3.18.0")
	edition.set(JooqEdition.OSS)

	configurations {
		create("main") {
			jooqConfiguration.apply {
				logging = Logging.WARN
				jdbc.apply {
					driver = "org.postgresql.Driver"
					url = "jdbc:postgresql://localhost:5432/dev"
					user = "root"
					password = "root"
				}
				generator.apply {
					name = "org.jooq.codegen.DefaultGenerator"
					database.apply {
						name = "org.jooq.meta.postgres.PostgresDatabase"
						inputSchema = "public"
					}
					generate.apply {
						isDeprecated = false
						isRecords = false
						isImmutablePojos = false
						isFluentSetters = false
					}
					target.apply {
						packageName = "com.helloworld.hello.generated"
						directory = "src/main/kotlin/com/helloworld/hello/generated"
					}
					strategy.name = "org.jooq.codegen.DefaultGeneratorStrategy"
				}
			}
		}
	}
}
