package bottlerocket.com.coroutinesandbox

import kotlinx.coroutines.experimental.*
import org.junit.Test

import org.junit.Assert.*
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit

class AsyncShowTimingTest {

    @Test
    fun test1() {
        runBlocking {
            val job1 = async { delayTimePrinter("first") }
            val job2 = async { delayTimePrinter("second") }
            job1.join()
            job2.join()
        }
    }


    suspend fun delayTimePrinter(name:String){
        val dateFormat = SimpleDateFormat("mm:ss:SS")
        System.out.println("Start "+name+"  at "+ dateFormat.format(Date()));
        delay(5,TimeUnit.SECONDS)
        System.out.println("End "+name+"  at "+ dateFormat.format(Date()));
    }
}