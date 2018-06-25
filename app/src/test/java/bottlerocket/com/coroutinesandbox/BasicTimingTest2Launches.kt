package bottlerocket.com.coroutinesandbox

import kotlinx.coroutines.experimental.*
import org.junit.Test

import org.junit.Assert.*
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit

class BasicTimingTest2Launches {

    @Test
    fun test1() {
        val job1 = launch {
                val result1:String = delayTimePrinter("job1")
                val result2:String = delayTimePrinter("job2")
                System.out.println(result1+" and "+result2+" are done");
        }
        launch {
            val result1:String = delayTimePrinter("job1")
            val result2:String = delayTimePrinter("job2")
            System.out.println(result1+" and "+result2+" are done");
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