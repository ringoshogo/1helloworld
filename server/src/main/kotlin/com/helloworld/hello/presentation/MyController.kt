package com.helloworld.hello.presentation

//import com.helloworld.hello.infra.repository.UserRepository
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("my")
class MyController(
//    private val userRepository: UserRepository,
) {

    @GetMapping
    fun myGetTest(model: Model ): String {
        return "hello my world日本語はどうだい？"
    }
}