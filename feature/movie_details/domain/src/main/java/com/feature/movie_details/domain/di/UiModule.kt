package com.feature.movie_details.domain.di

import com.feature.movie_details.domain.repository.MovieDetailsRepo
import com.feature.movie_details.domain.use_cases.GetMovieDetailsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object UiModule {

    @Provides
    fun provideGetMovieDetailsUseCase(movieDetailsRepo: MovieDetailsRepo): GetMovieDetailsUseCase {
        return GetMovieDetailsUseCase(movieDetailsRepo)
    }

}