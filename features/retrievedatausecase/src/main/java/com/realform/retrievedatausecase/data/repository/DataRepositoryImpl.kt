package com.realform.retrievedatausecase.data.repository

import com.realform.retrievedatausecase.data.network.utils.ApiService
import com.realform.retrievedatausecase.domain.model.MovieItem
import com.realform.retrievedatausecase.data.mappers.toMovieItem
import com.realform.retrievedatausecase.domain.repository.IDataRepository

class DataRepositoryImpl(private var  network: ApiService): IDataRepository {
    override suspend fun getData(): MovieItem {
     return   network.getMovieDataFromApi().toMovieItem()
    }
}
