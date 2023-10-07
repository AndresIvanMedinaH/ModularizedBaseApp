package com.data.network.model

import com.google.gson.annotations.SerializedName


data class ProductionCompaniesDTO(

    @SerializedName("id") var id: Int? = null,
    @SerializedName("logo_path") var logoPath: String? = null,
    @SerializedName("name") var name: String? = null,
    @SerializedName("origin_country") var originCountry: String? = null

)