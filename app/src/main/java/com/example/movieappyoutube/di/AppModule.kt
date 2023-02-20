package com.example.movieappyoutube.di

import com.example.movieappyoutube.navigation.NavigationProvider
import com.feature.movie.ui.navigation.MovieApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    fun provideNavigationProvider(movieApi: MovieApi):NavigationProvider{
        return NavigationProvider(movieApi)
    }

}