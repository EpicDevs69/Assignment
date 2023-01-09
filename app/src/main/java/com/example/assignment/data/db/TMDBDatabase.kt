package com.example.assignment.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
 import com.example.assignment.data.model.Movie

@Database(entities = [Movie::class], version = 1, exportSchema = false)
abstract class TMDBDatabase:RoomDatabase() {
    abstract fun movieDao(): MovieDao
}