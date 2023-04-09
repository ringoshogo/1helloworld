package com.helloworld.hello.infra.repository

import com.helloworld.hello.infra.entity.TodoUser
import org.springframework.context.annotation.Configuration
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
//import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Component

// 同期・ブロッキング処理
//@Component
//interface UserRepository: CrudRepository<User, Long>

// 非同期・ノンブロッキング処理
@Component
interface UserRepositoryReactive: CoroutineCrudRepository<TodoUser, Long>