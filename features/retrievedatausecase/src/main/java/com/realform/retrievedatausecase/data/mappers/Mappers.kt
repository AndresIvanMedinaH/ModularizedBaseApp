package com.realform.retrievedatausecase.data.mappers

import com.realform.retrievedatausecase.data.network.model.MovieItemDTO
import com.realform.retrievedatausecase.domain.model.Genres
import com.realform.retrievedatausecase.domain.model.MovieItem
import com.realform.retrievedatausecase.domain.model.ProductionCompanies
import com.realform.retrievedatausecase.domain.model.ProductionCountries
import com.realform.retrievedatausecase.domain.model.SpokenLanguages

fun MovieItemDTO.toMovieItem():MovieItem{
    return MovieItem(
            adult = this.adult,
            backdropPath = this.backdropPath,
            belongsToCollection = this.belongsToCollection,
            budget = this.budget,
            genres = this.genres.toGenresDomain()?:  ArrayList(),
            homepage = this.homepage,
            id =this.id,
            imdbId =this.imdbId,
            originalLanguage = this.originalLanguage,
            originalTitle = this.originalTitle,
            overview =this.overview,
            popularity =this.popularity,
            posterPath =this.posterPath,
            productionCompany = this.productionCompanyDTOS.toCompaniesDomain() ?: ArrayList(),
            productionCountry =this.productionCountryDTOS.toCountriesDomain()?: ArrayList(),
            releaseDate =this.releaseDate,
            revenue =this.revenue,
            runtime =this.runtime,
            spokenLanguage =this.spokenLanguageDTOS.toLanguageDomain() ?: ArrayList(),
            status =this.status,
            tagline =this.tagline,
            title =this.title,
            video =this.video,
            voteAverage =this.voteAverage,
            voteCount =this.voteCount
    )
}




fun List<MovieItemDTO>.toDomain():List<MovieItem>{
    return map {
        MovieItem(
            adult = it.adult,
            backdropPath = it.backdropPath,
            belongsToCollection = it.belongsToCollection,
            budget = it.budget,
            genres = it.genres.toGenresDomain()?:  ArrayList(),
            homepage = it.homepage,
            id =it.id,
            imdbId =it.imdbId,
            originalLanguage = it.originalLanguage,
            originalTitle = it.originalTitle,
            overview =it.overview,
            popularity =it.popularity,
            posterPath =it.posterPath,
            productionCompany = it.productionCompanyDTOS.toCompaniesDomain() ?: ArrayList(),
            productionCountry =it.productionCountryDTOS.toCountriesDomain()?: ArrayList(),
            releaseDate =it.releaseDate,
            revenue =it.revenue,
            runtime =it.runtime,
            spokenLanguage =it.spokenLanguageDTOS.toLanguageDomain() ?: ArrayList(),
            status =it.status,
            tagline =it.tagline,
            title =it.title,
            video =it.video,
            voteAverage =it.voteAverage,
            voteCount =it.voteCount

        )
    }
}

fun ArrayList<com.realform.retrievedatausecase.data.network.model.GenresDTO>.toGenresDomain(): ArrayList<Genres> {
    return ArrayList( map {
        Genres(
            id = it.id,
            name = it.name
        )
    })
}

fun ArrayList<com.realform.retrievedatausecase.data.network.model.ProductionCompaniesDTO>.toCompaniesDomain(): ArrayList<ProductionCompanies> {
    return ArrayList(
        map {
            ProductionCompanies(
                id = it.id,
                logoPath = it.logoPath,
                name = it.name,
                originCountry = it.originCountry
            )
        }
    )
}

fun ArrayList<com.realform.retrievedatausecase.data.network.model.ProductionCountriesDTO>.toCountriesDomain(): ArrayList<ProductionCountries> {
    return ArrayList(
        map {

            ProductionCountries(
                iso31661 = it.iso31661,
                name = it.name
            )
        })
}

fun ArrayList<com.realform.retrievedatausecase.data.network.model.SpokenLanguagesDTO>.toLanguageDomain(): ArrayList<SpokenLanguages> {
    return  ArrayList(
        map {
            SpokenLanguages(
                englishName = it.englishName,
                iso6391 = it.iso6391,
                name = it.name
            )
        })
}