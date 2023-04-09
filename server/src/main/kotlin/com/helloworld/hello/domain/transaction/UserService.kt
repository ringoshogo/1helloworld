package com.helloworld.hello.domain.transaction

import com.helloworld.hello.infra.entity.TodoUser
import com.helloworld.hello.infra.repository.UserRepositoryReactive
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.withContext
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
@Transactional
@Service
class UserService(
    private val userRepositoryReactive: UserRepositoryReactive
) {

    fun findAll(): Flow<TodoUser> =
        userRepositoryReactive.findAll()

    suspend fun saveAll(list: List<TodoUser>) =
        userRepositoryReactive.saveAll(list).collect()
}

