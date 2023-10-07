package com.data.network.model

import com.google.gson.annotations.SerializedName
import com.data.blog.GenresDTO
//TODO if data doens not parse, change List to ArrayList on Mappers an
data class MovieItemDTO(
    @SerializedName("adult") var adult: Boolean = false,
    @SerializedName("backdrop_path") var backdropPath: String? = null,
    @SerializedName("belongs_to_collection") var belongsToCollection: String? = null,
    @SerializedName("budget") var budget: Int? = null,
    @SerializedName("genres") var genres: ArrayList<GenresDTO> = arrayListOf(),
    @SerializedName("homepage") var homepage: String? = null,
    @SerializedName("id") var id: Int? = null,
    @SerializedName("imdb_id") var imdbId: String? = null,
    @SerializedName("original_language") var originalLanguage: String? = null,
    @SerializedName("original_title") var originalTitle: String? = null,
    @SerializedName("overview") var overview: String? = null,
    @SerializedName("popularity") var popularity: Double? = null,
    @SerializedName("poster_path") var posterPath: String? = null,
    @SerializedName("production_companies") var productionCompanyDTOS: ArrayList<ProductionCompaniesDTO> = arrayListOf(),
    @SerializedName("production_countries") var productionCountryDTOS: ArrayList<ProductionCountriesDTO> = arrayListOf(),
    @SerializedName("release_date") var releaseDate: String? = null,
    @SerializedName("revenue") var revenue: Int? = null,
    @SerializedName("runtime") var runtime: Int? = null,
    @SerializedName("spoken_languages") var spokenLanguageDTOS: ArrayList<SpokenLanguagesDTO> = arrayListOf(),
    @SerializedName("status") var status: String? = null,
    @SerializedName("tagline") var tagline: String? = null,
    @SerializedName("title") var title: String? = null,
    @SerializedName("video") var video: Boolean? = null,
    @SerializedName("vote_average") var voteAverage: Double? = null,
    @SerializedName("vote_count") var voteCount: Int? = null
)
