package com.feature.movie_details.domain.use_cases

import com.core.common.UiEvent
import com.feature.movie_details.domain.model.MovieDetails
import com.feature.movie_details.domain.repository.MovieDetailsRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject


class GetMovieDetailsUseCase @Inject constructor(private val movieDetailsRepo: MovieDetailsRepo){

   operator fun invoke(id:String,apiKey:String) : Flow<UiEvent<MovieDetails>> = flow {
       emit(UiEvent.Loading())
       emit(UiEvent.Success(movieDetailsRepo.getMovieDetails(id,apiKey)))
   }.catch {
       emit(UiEvent.Error(it.message.toString()))
   }.flowOn(Dispatchers.IO)

}