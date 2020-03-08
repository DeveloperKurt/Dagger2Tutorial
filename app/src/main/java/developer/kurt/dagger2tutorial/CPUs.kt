package developer.kurt.dagger2tutorial

import android.util.Log

abstract class CPU{
    //Declares and implements fundamental CPU features. By using inheritance, we are making it easy to provide different classes (CPUs in this case)
    abstract val model : String
}

class IntelCPU(override val model: String) : CPU()

class AMDCPU(override val model: String) : CPU()
