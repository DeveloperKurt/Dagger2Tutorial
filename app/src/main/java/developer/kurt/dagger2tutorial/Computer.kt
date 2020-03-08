package developer.kurt.dagger2tutorial

import android.util.Log


class Computer(val cpu: CPU, val gpu: GPU) {
    val TAG: String = "Computer"

    fun start() {
        Log.i(
            TAG,
            "System has started with the following CPU and GPU: " + "\t" + cpu.model + "\t" + gpu.model
        )
    }
}
