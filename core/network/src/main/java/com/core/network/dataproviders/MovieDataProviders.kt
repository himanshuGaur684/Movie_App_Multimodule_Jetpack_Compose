package com.core.network.dataproviders

import com.core.network.ApiService
import javax.inject.Inject

class MovieDataProviders @Inject constructor(private val apiService: ApiService) {

    suspend fun getMovieLIst(apikey:String,q:String) = apiService.getMovieList(apikey,q)

}