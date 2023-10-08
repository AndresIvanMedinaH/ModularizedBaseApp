package com.realform.blog.screens.home

import com.realform.retrievedatausecase.domain.model.MovieItem


data class HomeState(
    var isLoading :Boolean = false,
    var data: MovieItem = MovieItem(),
    )
