package com.helloworld.hello.domain.transaction

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class SyncService(
) {



}

@Service
class HeavyProcess {

    suspend fun heavy1(): List<String> {
        delay(1000)
        return listOf(
            "heavy1のstring1",
            "heavy1のstring2",
            "heavy1のstring3",
        )
    }

    fun heavy2(): Flow<String> = flow {
        delay(1000)
        emit("heavy2のstring1")
        emit("heavy2のstring2")
        emit("heavy2のstring3")
    }
}
