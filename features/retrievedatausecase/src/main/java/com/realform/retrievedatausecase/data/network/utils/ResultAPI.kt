package com.realform.retrievedatausecase.data.network.utils

sealed class ResultAPI<T> {
    data class Success<T>(val data : T) : ResultAPI<T>()
    data class Error<T>(val message  : String) : ResultAPI<T>()
    data class Loading(val isLoading: Boolean) : ResultAPI<Nothing>()
}