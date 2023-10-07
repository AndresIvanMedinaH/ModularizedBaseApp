package com.data.repository

import com.data.network.utils.ApiService
import com.domain.model.MovieItem
import com.data.mappers.toMovieItem
import com.domain.repository.IDataRepository

class DataRepositoryImpl(private var  network: ApiService): IDataRepository {
    override suspend fun getData(): MovieItem {
     return   network.getMovieDataFromApi().toMovieItem()
    }
}
