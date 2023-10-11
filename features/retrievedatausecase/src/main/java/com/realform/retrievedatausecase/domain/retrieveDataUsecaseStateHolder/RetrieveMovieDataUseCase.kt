package com.realform.retrievedatausecase.domain.retrieveDataUsecaseStateHolder

import com.realform.retrievedatausecase.data.network.utils.ResultResource
import com.realform.retrievedatausecase.data.repository.DataRepositoryImpl
import com.realform.retrievedatausecase.domain.model.MovieItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject


class RetrieveMovieDataUseCase @Inject constructor(private val dataRepository: DataRepositoryImpl) {

     operator fun invoke(): Flow<ResultResource<MovieItem>> = flow{
        emit(ResultResource.Loading(null))
        try {
            val resource = dataRepository.getData()
            emit(ResultResource.Success(resource))

        }catch (e:Exception){
            emit(ResultResource.Error("Error retrieving data"))
        }
    }

}