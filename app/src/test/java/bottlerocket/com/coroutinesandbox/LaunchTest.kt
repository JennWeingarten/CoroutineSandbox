package bottlerocket.com.coroutinesandbox

import kotlinx.coroutines.experimental.*
import org.junit.Test

import org.junit.Assert.*

class LaunchTest {

    @Test
    fun test1() {
        runBlocking {
            val job:Job = launch {
                delay(1000)
                println("Hello")
            }
        }


    }
}