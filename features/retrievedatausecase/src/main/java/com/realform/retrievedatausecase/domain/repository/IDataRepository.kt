package com.realform.retrievedatausecase.domain.repository

import com.realform.retrievedatausecase.domain.model.MovieItem

interface IDataRepository {
    suspend fun getData(): MovieItem
}
