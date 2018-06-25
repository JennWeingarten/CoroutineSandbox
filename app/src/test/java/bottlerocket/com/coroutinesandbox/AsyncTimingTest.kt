package bottlerocket.com.coroutinesandbox

import kotlinx.coroutines.experimental.*
import org.junit.Test

import org.junit.Assert.*
import java.util.concurrent.TimeUnit

class AsyncTimingTest {

    @Test
    fun test1() {
        runBlocking {
            val deferred = async { delayTimePrinter("first") }
            async { delayTimePrinter("second") }
            deferred.join()
        }
    }

    suspend fun delayTimePrinter(name:String){
        System.out.println("Start "+name);
        delay(5,TimeUnit.SECONDS)
        System.out.println("End "+name);
    }
}