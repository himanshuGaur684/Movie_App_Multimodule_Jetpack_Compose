package com.feature.movie_details.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.core.feature_api.FeatureApi

interface MovieDetailsApi : FeatureApi {

}

class MovieDetailsApiImpl : MovieDetailsApi {
    override fun registerGraph(navController: NavHostController, navGraphBuilder: NavGraphBuilder) {
        InternalMovieDetailsApi.registerGraph(navController, navGraphBuilder)
    }
}