package com.feature.movie_details.di

import com.core.network.dataproviders.MovieDataProviders
import com.feature.movie_details.domain.repository.MovieDetailsRepo
import com.feature.movie_details.repo.MovieDetailsRepoImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DataModule {


    @Provides
    fun provideMovieDetailsRepo(movieDataProviders: MovieDataProviders):MovieDetailsRepo{
        return MovieDetailsRepoImpl(movieDataProviders)
    }


}