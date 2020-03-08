package developer.kurt.dagger2tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import developer.kurt.dagger2tutorial.di.ComputerComponent
import developer.kurt.dagger2tutorial.di.DaggerComputerComponent
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var computer: Computer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val computerComponent : ComputerComponent = DaggerComputerComponent.builder().CPUModel("I9 9900k").GPUModel("GTX 2080").build()
        computerComponent.inject(this)
        computer.start()
    }
}
