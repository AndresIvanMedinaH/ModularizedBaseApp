package com.data.blog

import com.google.gson.annotations.SerializedName

data class GenresDTO(
    @SerializedName("id")
    var id: Int? = null,
    @SerializedName("name")
    var name: String? = null
)
