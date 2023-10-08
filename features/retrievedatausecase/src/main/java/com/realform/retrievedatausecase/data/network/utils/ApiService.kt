package com.realform.retrievedatausecase.data.network.utils

import com.realform.retrievedatausecase.data.network.model.MovieItemDTO
import retrofit2.http.GET

interface ApiService {
    @GET("movie")
    suspend fun getMovieDataFromApi(): MovieItemDTO
}
