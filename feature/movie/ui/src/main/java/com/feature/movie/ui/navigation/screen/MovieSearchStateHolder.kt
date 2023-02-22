package com.feature.movie.ui.navigation.screen

import com.feature.movie.domain.model.Movie

data class MovieSearchStateHolder(
    val isLoading:Boolean=false,
    val data:List<Movie>?=null,
    val error:String =""
)
