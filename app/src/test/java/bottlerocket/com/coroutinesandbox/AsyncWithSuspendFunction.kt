package bottlerocket.com.coroutinesandbox

import kotlinx.coroutines.experimental.*
import org.junit.Test

import org.junit.Assert.*
import java.util.concurrent.TimeUnit

class AsyncWithSuspendFunction {

    @Test
    fun test1() {
        runBlocking {
            val deferred:Deferred<Int> = async{
                getFive()
            }
            val result:Int = deferred.await()
            assertEquals(5,result)
        }
    }

    suspend fun getFive():Int{
        return 5
    }
}