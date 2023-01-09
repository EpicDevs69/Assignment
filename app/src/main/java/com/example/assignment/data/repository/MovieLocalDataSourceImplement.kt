package com.example.assignment.data.repository

import com.example.assignment.data.db.MovieDao
import com.example.assignment.data.model.Movie
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieLocalDataSourceImplement(private val movieDao:MovieDao):MovieLocalDataSource {
    override suspend fun getMoviesFromDB(): List<Movie> {
       return movieDao.GetAllMovies()
    }

    override suspend fun saveMoviesToDB(movies: List<Movie>) {
       CoroutineScope(Dispatchers.IO).launch {
           movieDao.saveMovies(movies)
       }
    }

    override suspend fun clearAll() {
CoroutineScope(Dispatchers.IO).launch {
    movieDao.deleteAllMovies()
}    }
}