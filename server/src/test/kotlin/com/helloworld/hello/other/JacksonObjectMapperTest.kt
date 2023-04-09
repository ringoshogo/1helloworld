package com.helloworld.hello.other

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.junit.jupiter.api.Test

private class JacksonObjectMapperTest {

    data class Memo(val author: String, val content: String)
    @JsonDeserialize(using = MemoDes::class)
    data class Memos(private val list: List<Memo>): List<Memo> by list

    data class Todo(val content: String, val memos: Memos)

    class MemoDes: StdDeserializer<Memos>(Memos::class.java) {
        companion object {
            private val mapper = jacksonObjectMapper()
        }
        override fun deserialize(p: JsonParser?, ctxt: DeserializationContext?): Memos {
            return Memos(mapper.readValue(p, object : TypeReference<List<Memo>>() {}))
        }
    }

    @Test
    fun deserializeTest() {
        val memoJson = "[{\"author\":\"taro\", \"content\":\"memo1\"},{\"author\":\"jiro\", \"content\":\"memo2\"},{\"author\":\"saburo\", \"content\":\"memo3\"}]"
        val todoJson = "{\"content\":\"やること\",\"memos\":[{\"author\":\"taro\", \"content\":\"memo1\"},{\"author\":\"jiro\", \"content\":\"memo2\"},{\"author\":\"saburo\", \"content\":\"memo3\"}]}"

        val objectMapper = jacksonObjectMapper()

        val memos = objectMapper.readValue(memoJson, Memos::class.java)

        println(memos)

        val todo = objectMapper.readValue(todoJson, Todo::class.java)

        println(todo)


    }

}