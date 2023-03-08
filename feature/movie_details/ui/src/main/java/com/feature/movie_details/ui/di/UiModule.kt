package com.feature.movie_details.ui.di

import com.feature.movie_details.ui.navigation.MovieDetailsApi
import com.feature.movie_details.ui.navigation.MovieDetailsApiImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object UiModule {
    @Provides
    fun provideMovieDetailsApi(): MovieDetailsApi {
        return MovieDetailsApiImpl()
    }
}
