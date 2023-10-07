package com.domain.repository

import com.domain.model.MovieItem

interface IDataRepository {
    suspend fun getData(): MovieItem
}
