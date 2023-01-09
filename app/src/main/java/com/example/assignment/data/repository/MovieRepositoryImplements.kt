package com.example.assignment.data.repository

import android.util.Log
import com.example.assignment.data.model.Movie
import com.example.assignment.data.model.MovieList
import com.example.assignment.domain.repository.MoviesRepository
import retrofit2.Response

class MovieRepositoryImplements(private val movieRemoteDataSource: MovieRemoteDataSource,
private val movieLocalDataSource: MovieLocalDataSource,
private val movieCacheDataSource: MovieCacheDataSource):MoviesRepository {
    override suspend fun getMovies(): List<Movie>? {
       return getMoviesFromCache()
    }

    override suspend fun updateMovies(): List<Movie>? {
       val newListOfMovies=getMoviesFromAPI()
        movieLocalDataSource.clearAll()
        movieLocalDataSource.saveMoviesToDB(newListOfMovies)
        movieCacheDataSource.saveMoviesToCache(newListOfMovies)
        return newListOfMovies

    }
    suspend fun getMoviesFromAPI():List<Movie>{
        lateinit var movieList: List<Movie>
        try {
            val response= movieRemoteDataSource.getMovies()
            val body= response.body()
            if (body!=null){
                movieList=body.movies
            }

        } catch (exception:Exception){
            Log.i("checkem",exception.message.toString())
        }
        return  movieList

    }
    suspend fun getMoviesFromDB():List<Movie>{
        lateinit var movieList: List<Movie>
        try {
            movieList= movieLocalDataSource.getMoviesFromDB()

        } catch (exception:Exception){
            Log.i("checkem",exception.message.toString())
        }
        if (movieList.size>0){
            return movieList
        }else{
            movieList=getMoviesFromAPI()
            movieLocalDataSource.saveMoviesToDB(movieList)
        }
        return  movieList

    }
    suspend fun getMoviesFromCache():List<Movie>{ lateinit var movieList: List<Movie>
        try {
            movieList= movieCacheDataSource.getMoviesFromCache()

        } catch (exception:Exception){
            Log.i("checkem",exception.message.toString())
        }
        if (movieList.size>0){
            return movieList
        }else{
            movieList=getMoviesFromDB()
            movieCacheDataSource.saveMoviesToCache(movieList)
        }
        return  movieList}

}