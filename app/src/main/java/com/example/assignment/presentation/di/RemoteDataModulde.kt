package com.example.assignment.presentation.di

import com.example.assignment.data.api.TMDBService
import com.example.assignment.data.repository.MovieRemoteDataSource
import com.example.assignment.data.repository.MovieRemoteDataSourceImplement
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModulde(private val apiKey:String) {
    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService):MovieRemoteDataSource{
        return MovieRemoteDataSourceImplement(tmdbService,apiKey)
    }
}