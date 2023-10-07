package com.data.network.utils

sealed class ResultResource<T>{
    data class Success<T>(val data : T) : ResultResource<T>()
    data class Error<T>(val message  : String) : ResultResource<T>()
    class Loading<T>(message: String?) : ResultResource<T>()
}
