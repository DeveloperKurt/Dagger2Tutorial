package developer.kurt.dagger2tutorial

import android.util.Log

abstract class GPU {
    //Declares and implements fundamental GPU features. By using inheritance, we are making it easy to provide different classes (GPUs in this case)
    abstract val model : String
}

class NvidiaGPU(override val model: String) : GPU()

class AMDGPU(override val model: String) : GPU()