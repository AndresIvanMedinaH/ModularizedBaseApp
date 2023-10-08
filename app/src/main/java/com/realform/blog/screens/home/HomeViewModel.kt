package com.realform.blog.screens.home

import androidx.lifecycle.ViewModel
import com.realform.retrievedatausecase.domain.usecase.RetrieveMovieDataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor(private  val dataUseCase: com.realform.retrievedatausecase.domain.usecase.RetrieveMovieDataUseCase): ViewModel() {

   // private val movieData = mutableStateOf()

fun getMovieData(){
    dataUseCase.invoke()
}

}