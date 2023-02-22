package com.feature.movie.data.mapper

import com.core.network.model.MovieListResponse
import com.feature.movie.domain.model.Movie

fun MovieListResponse.toDomainMovieList():List<Movie>{
    return this.results.map {
        Movie(makeFullUrl( it.poster_path))
    }
}

fun makeFullUrl(path:String) = "https://image.tmdb.org/t/p/w500/${path}"