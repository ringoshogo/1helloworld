package com.helloworld.hello.port.adapter.configuration

import io.r2dbc.spi.ConnectionFactory
import org.jooq.DSLContext
import org.jooq.SQLDialect
import org.jooq.impl.DefaultDSLContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class JooqConfig(
    private val connectionFactory: ConnectionFactory,
) {

    @Bean
    fun dslContext(): DSLContext =
        DefaultDSLContext(connectionFactory, SQLDialect.POSTGRES)
}