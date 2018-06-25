package bottlerocket.com.coroutinesandbox

import kotlinx.coroutines.experimental.*
import org.junit.Test

import org.junit.Assert.*
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit

class BasicTimingTestAsync {

    @Test
    fun test1() {
        runBlocking {
            val one = async { delayTimePrinter("job1") }
            val two = async { delayTimePrinter("job2") }
            println("The answer is ${one.await() + two.await()}")
        }
    }


    suspend fun delayTimePrinter(name:String):String{
        val dateFormat = SimpleDateFormat("mm:ss:SS")
        System.out.println("Start "+name+"  at "+ dateFormat.format(Date()));
        delay(5,TimeUnit.SECONDS)
        System.out.println("End "+name+"  at "+ dateFormat.format(Date()));
        return name
    }
}