package developer.kurt.dagger2tutorial.di

import dagger.Module
import dagger.Provides
import developer.kurt.dagger2tutorial.AMDCPU
import developer.kurt.dagger2tutorial.CPU
import developer.kurt.dagger2tutorial.IntelCPU
import javax.inject.Named

@Module
class CPUModule {

    @Provides
    @Named("IntelCPU")
    fun provideIntelCPU(@Named("CPUModel") model: String ) : CPU {
        return IntelCPU(model)
    }

    @Provides
    @Named("AMDCPU")
    fun provideAMDCPU(@Named("CPUModel") model: String) : CPU {
        return AMDCPU(model)
    }
}