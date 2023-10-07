package com.domain.usecases

import com.data.network.utils.ResultResource
import com.data.repository.DataRepositoryImpl
import com.domain.model.MovieItem
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