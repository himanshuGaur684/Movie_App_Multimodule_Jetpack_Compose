package com.feature.movie_details.mappers

import com.core.network.model.MovieDetailsDTO
import com.feature.movie_details.domain.model.MovieDetails


fun MovieDetailsDTO.toDomain():MovieDetails{
    return MovieDetails(
        title = this.original_title,
        desc =  this.overview,
        imageUrl = makeFullUrl(this.poster_path)
    )
}

fun makeFullUrl(path:String) = "https://image.tmdb.org/t/p/w500/${path}"