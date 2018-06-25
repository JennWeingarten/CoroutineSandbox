package bottlerocket.com.coroutinesandbox

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleCoroutineFromRegFunctinErrorTest {
    @Test
    fun ExampleCoroutineFromRegFunctinError() {
   //     doSomething("abc")
    }

    suspend fun doSomething(foo: String): String {
        return foo
    }
}
