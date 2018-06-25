package bottlerocket.com.coroutinesandbox

import kotlinx.coroutines.experimental.*
import org.junit.Test

import org.junit.Assert.*
import java.util.concurrent.TimeUnit

class AsyncTestCreateDeferred {

    @Test
    fun test1() {
        runBlocking {
            val deferred:Deferred<Int> = async{
                delay(1,TimeUnit.SECONDS)
                return@async 5
            }
            val result:Int = deferred.await()
            assertEquals(5,result)
        }
    }
}