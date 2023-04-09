package com.helloworld.hello.presentation

import com.helloworld.hello.domain.transaction.UserService
import com.helloworld.hello.infra.entity.TodoUser
import com.helloworld.hello.infra.repository.UserRepositoryReactive
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.reactor.mono
import org.springframework.http.MediaType
import org.springframework.transaction.annotation.Transactional
import org.springframework.transaction.reactive.TransactionalOperator
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("users")
class UserController(
    private val userService: UserService
) {

    @GetMapping
    fun getUsers(mav: ModelAndView): Flow<TodoUser> {
        return userService.findAll()
    }

    @PostMapping(consumes = [MediaType.APPLICATION_JSON_VALUE])
    suspend fun postUser(@RequestBody names: List<TodoUser>) {
        names.forEach { println(it.name) }
        userService.saveAll(names)
    }

}
