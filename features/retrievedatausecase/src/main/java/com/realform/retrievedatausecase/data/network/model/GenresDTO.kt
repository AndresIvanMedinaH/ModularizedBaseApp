package com.realform.retrievedatausecase.data.network.model

import com.google.gson.annotations.SerializedName

data class GenresDTO(
    @SerializedName("id")
    var id: Int? = null,
    @SerializedName("name")
    var name: String? = null
)
