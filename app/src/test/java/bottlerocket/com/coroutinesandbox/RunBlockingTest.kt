package bottlerocket.com.coroutinesandbox

import kotlinx.coroutines.experimental.*
import org.junit.Test

import org.junit.Assert.*

class RunBlockingTestTest {

    @Test
    fun test() {
        runBlocking {
            delay(1000)
        }
    }

}