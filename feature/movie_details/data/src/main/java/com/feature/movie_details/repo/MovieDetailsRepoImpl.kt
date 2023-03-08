package com.feature.movie_details.repo

import com.core.network.dataproviders.MovieDataProviders
import com.feature.movie_details.domain.model.MovieDetails
import com.feature.movie_details.domain.repository.MovieDetailsRepo
import com.feature.movie_details.mappers.toDomain
import javax.inject.Inject

class MovieDetailsRepoImpl @Inject constructor(private val movieDataProviders: MovieDataProviders) : MovieDetailsRepo{
    override suspend fun getMovieDetails(id: String, apiKey: String): MovieDetails {
       return movieDataProviders.getMovieDetails(id,apiKey).toDomain()
    }
}