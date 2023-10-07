package com.data.network.di

import com.example.network.utils.ApiService
import com.example.repository.DataRepositoryImpl
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
    fun provideApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Provides
    fun providesDataRepository(apiService: ApiService): DataRepositoryImpl {
        return DataRepositoryImpl(network = apiService)
    }

}
