package com.example.assignment.domain.repository

import com.example.assignment.data.model.Movie

interface MoviesRepository {
    suspend fun getMovies():List<Movie>?
    suspend fun updateMovies():List<Movie>?
}