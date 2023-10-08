package com.realform.retrievedatausecase.core.di

import com.realform.retrievedatausecase.data.network.utils.ApiService
import com.realform.retrievedatausecase.data.repository.DataRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit

@InstallIn(SingletonComponent::class)
@Module
object DataModule {

    @Provides
    fun providesRetrofit(): Retrofit {
    return Retrofit.Builder().baseUrl("").addConverterFactory(GsonConverterFactory.create()).build()
    }

    @Provides
    fun provideApiService(retrofit: Retrofit): com.realform.retrievedatausecase.data.network.utils.ApiService {
        return retrofit.create(com.realform.retrievedatausecase.data.network.utils.ApiService::class.java)
    }

    @Provides
    fun providesDataRepository(apiService: com.realform.retrievedatausecase.data.network.utils.ApiService): com.realform.retrievedatausecase.data.repository.DataRepositoryImpl {
        return com.realform.retrievedatausecase.data.repository.DataRepositoryImpl(network = apiService)
    }

}
