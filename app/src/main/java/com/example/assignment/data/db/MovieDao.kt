package com.example.assignment.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.assignment.data.model.Movie
import com.example.assignment.data.model.MovieList

@Dao
interface MovieDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveMovies(movies:List<Movie>)

    @Query("DELETE FROM POPULAR_MOVIES")
    suspend fun deleteAllMovies()

    @Query("SELECT * FROM POPULAR_MOVIES")
    suspend fun GetAllMovies():List<Movie>
}