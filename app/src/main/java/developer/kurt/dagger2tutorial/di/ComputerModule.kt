package developer.kurt.dagger2tutorial.di

import dagger.Module
import dagger.Provides
import developer.kurt.dagger2tutorial.CPU
import developer.kurt.dagger2tutorial.Computer
import developer.kurt.dagger2tutorial.GPU
import javax.inject.Named

@Module
class ComputerModule {

    @Provides
    fun provideComputer(@Named("IntelCPU")cpu: CPU, @Named("NvidiaGPU")gpu: GPU): Computer{
        return Computer(cpu, gpu)
    }
}