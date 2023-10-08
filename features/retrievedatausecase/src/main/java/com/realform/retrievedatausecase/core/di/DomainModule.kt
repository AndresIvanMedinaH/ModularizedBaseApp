package com.realform.retrievedatausecase.core.di

import com.realform.retrievedatausecase.data.repository.DataRepositoryImpl
import com.realform.retrievedatausecase.domain.usecase.RetrieveMovieDataUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DomainModule {

    @Provides
    fun providesGetMovieDataUseCase(dataRepositoryImpl: com.realform.retrievedatausecase.data.repository.DataRepositoryImpl): com.realform.retrievedatausecase.domain.usecase.RetrieveMovieDataUseCase {
        return com.realform.retrievedatausecase.domain.usecase.RetrieveMovieDataUseCase(
            dataRepositoryImpl
        )
    }
}
