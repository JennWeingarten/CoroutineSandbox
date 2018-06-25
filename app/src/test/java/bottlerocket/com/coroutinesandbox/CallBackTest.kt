package bottlerocket.com.coroutinesandbox

import org.junit.Test
import kotlin.coroutines.experimental.suspendCoroutine

class CallBackTest {

    @Test
    fun test1() {
        val listener = ExampleCallback()
      //  someLongFunctionWithCallback(listener)

    }

    fun someLongFunctionWithCallback(callback:CallbackInterface, input:Int){
        callback.done(input)
    }

   /* suspend fun someLongComputation(param: CallbackInterface, input: Int) = suspendCoroutine { cont ->
        someLongFunctionWithCallback(param, input) { cont.resume(it) }
    } */
}