package com.feature.movie.ui.navigation.screen

import android.util.Log
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun MovieScreen(viewModel: MovieSearchViewModel) {

    val result = viewModel.movieList.value
    val query = viewModel.query.collectAsState()

    Scaffold(topBar = {
        TextField(
            modifier=Modifier.fillMaxWidth(),
            value = query.value,
            onValueChange = {
                viewModel.setQuery(it)
            },
            colors = TextFieldDefaults.textFieldColors(
                disabledIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                backgroundColor = Color.Transparent
            ), placeholder = { Text(text = "Search Movie...") }, trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = null
                )
            }
        )

    }) {
        Log.d("TAG", "MovieScreen: ${it}")

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

            if (it.isEmpty()) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Text(text = "Nothing found")
                }
            } else {
                LazyVerticalGrid(columns = GridCells.Adaptive(minSize = 128.dp), content = {
                    items(it) {

                        Box(
                            modifier = Modifier
                                .height(200.dp)
                                .border(width = 1.dp, color = Color.White)
                        ) {
                            AsyncImage(
                                model = it.imageUrl,
                                contentDescription = null,
                                contentScale = ContentScale.Fit
                            )

                        }

                    }

                })
            }


        }


    }


}