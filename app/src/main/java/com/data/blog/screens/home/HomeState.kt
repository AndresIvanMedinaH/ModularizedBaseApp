package com.data.blog.screens.home

import com.domain.model.MovieItem

data class HomeState(
    var isLoading :Boolean = false,
    var data: MovieItem = MovieItem(),
    )
