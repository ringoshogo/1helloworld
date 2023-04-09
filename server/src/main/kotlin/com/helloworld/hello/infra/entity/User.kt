package com.helloworld.hello.infra.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table("todo_users")
data class TodoUser (
    @Id
    val id: Long?,
    @Column("name")
    val name: String,
    )