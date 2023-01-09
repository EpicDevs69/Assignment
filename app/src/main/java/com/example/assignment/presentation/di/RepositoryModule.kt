package com.example.assignment.presentation.di

import com.example.assignment.data.repository.MovieCacheDataSource
import com.example.assignment.data.repository.MovieLocalDataSource
import com.example.assignment.data.repository.MovieRemoteDataSource
import com.example.assignment.data.repository.MovieRepositoryImplements
import com.example.assignment.domain.repository.MoviesRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Singleton
    @Provides
    fun provideMovieRepository(movieRemoteDataSource: MovieRemoteDataSource,
    movieLocalDataSource:MovieLocalDataSource,
    movieCacheDataSource: MovieCacheDataSource ):MoviesRepository{
        return MovieRepositoryImplements(movieRemoteDataSource,movieLocalDataSource,movieCacheDataSource)


    }
}