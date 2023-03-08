package com.feature.movie_details.ui.screen

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun MovieDetailsScreen(id: String, viewModel: MovieDetailsViewModel) {

    val result = viewModel.movieDetails.value

    Scaffold(topBar = {
        TopAppBar(title = {
            Text(text = "Movie Details")
        })
    }) {
        Log.d("TAG", "MovieDetailsScreen: ${it}")

        if (result.isLoading) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator()
            }
        }

        if (result.error.isNotBlank()) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(text = result.error)
            }
        }

        result.data?.let {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
            ) {

                AsyncImage(
                    model = it.imageUrl,
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(300.dp),
                    contentScale = ContentScale.Crop
                )

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp)
                ) {

                    Column(Modifier.fillMaxWidth()) {

                        Text(text = it.title, style = MaterialTheme.typography.h5)

                        Text(text = it.desc, style = MaterialTheme.typography.body1)

                    }

                }

            }
        }
    }

}