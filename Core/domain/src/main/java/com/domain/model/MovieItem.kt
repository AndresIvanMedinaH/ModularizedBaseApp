package com.domain.model

data class MovieItem(
    var adult: Boolean? = false,
    var backdropPath: String? = null,
    var belongsToCollection: String? = null,
    var budget: Int? = null,
    var genres: ArrayList<Genres> = arrayListOf(),
    var homepage: String? = null,
    var id: Int? = null,
    var imdbId: String? = null,
    var originalLanguage: String? = null,
    var originalTitle: String? = null,
    var overview: String? = null,
    var popularity: Double? = null,
    var posterPath: String? = null,
    var productionCompany: ArrayList<ProductionCompanies> = arrayListOf(),
    var productionCountry: ArrayList<ProductionCountries> = arrayListOf(),
    var releaseDate: String? = null,
    var revenue: Int? = null,
    var runtime: Int? = null,
    var spokenLanguage: ArrayList<SpokenLanguages> = arrayListOf(),
    var status: String? = null,
    var tagline: String? = null,
    var title: String? = null,
    var video: Boolean? = null,
    var voteAverage: Double? = null,
    var voteCount: Int? = null
)
