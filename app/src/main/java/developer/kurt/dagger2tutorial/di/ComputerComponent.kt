package developer.kurt.dagger2tutorial.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import developer.kurt.dagger2tutorial.CPU
import developer.kurt.dagger2tutorial.GPU
import developer.kurt.dagger2tutorial.MainActivity
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ComputerModule::class, CPUModule::class, GPUModule::class))
interface ComputerComponent {
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {
        fun build(): ComputerComponent

        @BindsInstance
        fun CPUModel(@Named("CPUModel") model: String): Builder

        @BindsInstance
        fun GPUModel(@Named("GPUModel") model: String): Builder
    }
}