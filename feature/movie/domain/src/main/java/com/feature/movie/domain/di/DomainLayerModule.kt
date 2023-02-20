package com.feature.movie.domain.di

import com.feature.movie.domain.repo.MovieRepository
import com.feature.movie.domain.use_cases.GetMovieListUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DomainLayerModule {


    @Provides
    fun provideGetMovieListUseCase(movieRepository: MovieRepository):GetMovieListUseCase{
        return GetMovieListUseCase(movieRepository)
    }


}