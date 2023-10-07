package com.data.mappers

import com.example.network.model.MovieItemDTO
import com.example.network.model.ProductionCompaniesDTO
import com.example.network.model.ProductionCountriesDTO
import com.example.network.model.SpokenLanguagesDTO
import com.example.domain.model.Genres
import com.example.domain.model.MovieItem
import com.example.domain.model.ProductionCompanies
import com.example.domain.model.ProductionCountries
import com.example.domain.model.SpokenLanguages
import com.data.blog.GenresDTO

fun MovieItemDTO.toMovieItem():MovieItem{
    return MovieItem(
            adult = this.adult,
            backdropPath = this.backdropPath,
            belongsToCollection = this.belongsToCollection,
            budget = this.budget,
            genres = this.genres.toDomain()?:  ArrayList(),
            homepage = this.homepage,
            id =this.id,
            imdbId =this.imdbId,
            originalLanguage = this.originalLanguage,
            originalTitle = this.originalTitle,
            overview =this.overview,
            popularity =this.popularity,
            posterPath =this.posterPath,
            productionCompany = this.productionCompanyDTOS.toDomain() ?: ArrayList(),
            productionCountry =this.productionCountryDTOS.toDomain()?: ArrayList(),
            releaseDate =this.releaseDate,
            revenue =this.revenue,
            runtime =this.runtime,
            spokenLanguage =this.spokenLanguageDTOS.toDomain() ?: ArrayList(),
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
            genres = it.genres.toDomain()?:  ArrayList(),
            homepage = it.homepage,
            id =it.id,
            imdbId =it.imdbId,
            originalLanguage = it.originalLanguage,
            originalTitle = it.originalTitle,
            overview =it.overview,
            popularity =it.popularity,
            posterPath =it.posterPath,
            productionCompany = it.productionCompanyDTOS.toDomain() ?: ArrayList(),
            productionCountry =it.productionCountryDTOS.toDomain()?: ArrayList(),
            releaseDate =it.releaseDate,
            revenue =it.revenue,
            runtime =it.runtime,
            spokenLanguage =it.spokenLanguageDTOS.toDomain() ?: ArrayList(),
            status =it.status,
            tagline =it.tagline,
            title =it.title,
            video =it.video,
            voteAverage =it.voteAverage,
            voteCount =it.voteCount

        )
    }
}

fun ArrayList<GenresDTO>.toDomain(): ArrayList<Genres> {
    return ArrayList( map {
        Genres(
            id = it.id,
            name = it.name
        )
    })
}

fun ArrayList<ProductionCompaniesDTO>.toDomain(): ArrayList<ProductionCompanies> {
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

fun ArrayList<ProductionCountriesDTO>.toDomain(): ArrayList<ProductionCountries> {
    return ArrayList(
        map {

            ProductionCountries(
                iso31661 = it.iso31661,
                name = it.name
            )
        })
}

fun ArrayList<SpokenLanguagesDTO>.toDomain(): ArrayList<SpokenLanguages> {
    return  ArrayList(
        map {
            SpokenLanguages(
                englishName = it.englishName,
                iso6391 = it.iso6391,
                name = it.name
            )
        })
}