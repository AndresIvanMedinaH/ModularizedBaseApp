package com.data.network.model

import com.google.gson.annotations.SerializedName


data class ProductionCountriesDTO(

    @SerializedName("iso_3166_1") var iso31661: String? = null,
    @SerializedName("name") var name: String? = null

)