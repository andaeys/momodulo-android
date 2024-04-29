package andaeys.io.momodulo.core.di

import andaeys.io.momodulo.core.api.ApiService
import andaeys.io.momodulo.core.api.RetrofitBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    fun provideApiService(): ApiService {
        return RetrofitBuilder.build().create(ApiService::class.java)
    }
}
