package com.helloworld.hello.infra.repository;

import com.helloworld.hello.infra.entity.TodoUser
import org.jooq.DSLContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
class JooqUserRepository(
    private val dslContext: DSLContext,
) {

    suspend fun saveAll(list: List<TodoUser>) {
//        dslContext.insertInto(Use)
    }
}
