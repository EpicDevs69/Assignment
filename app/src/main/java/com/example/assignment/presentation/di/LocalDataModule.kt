package com.example.assignment.presentation.di

import com.example.assignment.data.db.MovieDao
import com.example.assignment.data.repository.MovieLocalDataSource
import com.example.assignment.data.repository.MovieLocalDataSourceImplement
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {
    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao):MovieLocalDataSource{
        return MovieLocalDataSourceImplement(movieDao)
    }
}