package bottlerocket.com.coroutinesandbox

import kotlinx.coroutines.experimental.*
import org.junit.Test

import org.junit.Assert.*
import java.util.concurrent.TimeUnit

class trash {

}


/*
    CameraDevice .StateCallback()

    interface StateCallback{
        fun onClosed(CameraDevice camera)
        fun onDisconnected(CameraDevice camera)
        fun onError(CameraDevice camera, int error)
        fun onOpened(CameraDevice camera)
    }


    suspend fun login(email: String, password: String): Result<String> {
            try {
                    val result:Result<MetaDTO> = apiClient.login(email, password)
                    if(Result.Successful) {
                        ...
                    }
            }catch (exception:Exception){
                Result.Error(ApiError("fail",exception.localizedMessage))
            }
    }*/