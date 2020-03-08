package developer.kurt.dagger2tutorial.di

import dagger.Module
import dagger.Provides
import developer.kurt.dagger2tutorial.AMDGPU
import developer.kurt.dagger2tutorial.GPU
import developer.kurt.dagger2tutorial.NvidiaGPU
import javax.inject.Named

@Module
class GPUModule {
    @Provides
    @Named("NvidiaGPU")
    fun provideNvidiaGPU(@Named("GPUModel") model: String ) : GPU {
        return NvidiaGPU(model)
    }

    @Provides
    @Named("AMDGPU")
    fun provideAMDGPU(@Named("GPUModel") model: String) : GPU {
        return AMDGPU(model)
    }
}