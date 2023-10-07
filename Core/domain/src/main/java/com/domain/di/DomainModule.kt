package com.domain.di

import com.data.repository.DataRepositoryImpl
import com.domain.usecases.RetrieveMovieDataUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DomainModule {

    @Provides
    fun providesGetMovieDataUseCase(dataRepositoryImpl: DataRepositoryImpl): RetrieveMovieDataUseCase {
        return RetrieveMovieDataUseCase(dataRepositoryImpl)
    }
}
