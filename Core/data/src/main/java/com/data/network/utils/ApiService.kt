package com.data.network.utils

import com.data.network.model.MovieItemDTO
import retrofit2.http.GET

interface ApiService {
    @GET("movie")
    suspend fun getMovieDataFromApi(): MovieItemDTO
}
