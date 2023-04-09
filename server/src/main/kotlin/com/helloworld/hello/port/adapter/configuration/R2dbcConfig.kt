package com.helloworld.hello.port.adapter.configuration

import io.r2dbc.spi.ConnectionFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.r2dbc.connection.R2dbcTransactionManager

@Configuration
class R2dbcConfig(
    private val connectionFactory: ConnectionFactory
) {

    @Bean
    fun transactionManager(): R2dbcTransactionManager =
        R2dbcTransactionManager(connectionFactory)

}