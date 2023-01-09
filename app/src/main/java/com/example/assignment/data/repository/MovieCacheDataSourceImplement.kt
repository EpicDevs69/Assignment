package com.example.assignment.data.repository

import com.example.assignment.data.model.Movie

class MovieCacheDataSourceImplement:MovieCacheDataSource {
    private var movieList=ArrayList<Movie>()
    override suspend fun getMoviesFromCache(): List<Movie> {
       return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
      movieList.clear()
        movieList=ArrayList(movies)
    }
}