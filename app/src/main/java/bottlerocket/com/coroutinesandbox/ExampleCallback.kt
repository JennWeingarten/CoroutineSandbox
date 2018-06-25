package bottlerocket.com.coroutinesandbox

interface CallbackInterface{
    fun done(input: Int):Int
}

class ExampleCallback:CallbackInterface{
    override fun done(input:Int):Int{
        return input
    }
}