package com.example.assignment.data.repository

import com.example.assignment.data.api.TMDBService
import com.example.assignment.data.model.MovieList
import retrofit2.Response

class MovieRemoteDataSourceImplement(private val tmdbService: TMDBService,private val apikey:String):MovieRemoteDataSource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getTopRatedMovies(apikey)

}