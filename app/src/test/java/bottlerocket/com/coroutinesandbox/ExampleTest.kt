package bottlerocket.com.coroutinesandbox

import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking
import org.junit.Test

import org.junit.Assert.*

class ExampleTest {

    @Test
    fun test1() {
        runBlocking {
            val defered = async {
                delay(1000)
                println("Hello")
            }
        }
    }


}