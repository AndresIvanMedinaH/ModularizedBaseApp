package com.realform.retrievedatausecase.domain.usecase

import com.realform.retrievedatausecase.data.network.utils.ResultResource
import com.realform.retrievedatausecase.data.repository.DataRepositoryImpl
import com.realform.retrievedatausecase.domain.model.MovieItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject


class RetrieveMovieDataUseCase @Inject constructor(private val dataRepository: com.realform.retrievedatausecase.data.repository.DataRepositoryImpl) {

     operator fun invoke(): Flow<com.realform.retrievedatausecase.data.network.utils.ResultResource<MovieItem>> = flow{
        emit(com.realform.retrievedatausecase.data.network.utils.ResultResource.Loading(null))
        try {
            val resource = dataRepository.getData()
            emit(com.realform.retrievedatausecase.data.network.utils.ResultResource.Success(resource))

        }catch (e:Exception){
            emit(com.realform.retrievedatausecase.data.network.utils.ResultResource.Error("Error retrieving data"))
        }
    }

}