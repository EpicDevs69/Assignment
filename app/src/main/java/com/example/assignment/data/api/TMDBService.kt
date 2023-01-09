package com.example.assignment.data.api

 import com.example.assignment.data.model.MovieList
import retrofit2.Response
 import retrofit2.http.GET
 import retrofit2.http.Query

interface TMDBService {
    @GET("movie/top_rated")
    suspend fun getTopRatedMovies(@Query("api_key")apikey:String):Response<MovieList>
}