package com.realform.blog.screens.home

import androidx.lifecycle.ViewModel
import com.domain.usecases.RetrieveMovieDataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor(private  val dataUseCase: RetrieveMovieDataUseCase): ViewModel() {

   // private val movieData = mutableStateOf()

fun getMovieData(){
    dataUseCase.invoke()
}

}