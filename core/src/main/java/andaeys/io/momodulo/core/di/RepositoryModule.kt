package andaeys.io.momodulo.core.di

import andaeys.io.momodulo.core.api.ApiService
import andaeys.io.momodulo.core.repository.TopNewsRepository
import andaeys.io.momodulo.core.repository.TopNewsRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideTopNewsRepository(apiService: ApiService): TopNewsRepository{
        return TopNewsRepositoryImpl(apiService)
    }
}
