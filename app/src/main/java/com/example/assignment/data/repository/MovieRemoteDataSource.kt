package com.example.assignment.data.repository

import com.example.assignment.data.model.Movie
import com.example.assignment.data.model.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {
    suspend fun getMovies():Response<MovieList>
}