package com.example.assignment.presentation.di

import com.example.assignment.data.repository.MovieCacheDataSource
import com.example.assignment.data.repository.MovieCacheDataSourceImplement
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {
    @Singleton
    @Provides
    fun provideMovieCacheDataSource():MovieCacheDataSource{
        return MovieCacheDataSourceImplement()
    }
}