package com.example.assignment.presentation.di

import com.example.assignment.domain.repository.MoviesRepository
import com.example.assignment.domain.usecase.GetMoviesUseCase
import com.example.assignment.domain.usecase.UpdateMoviesUseCase
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {
    @Provides
    fun provideGetMoviesUseCase(moviesRepository: MoviesRepository):GetMoviesUseCase{
        return GetMoviesUseCase(moviesRepository)
    }

    @Provides
    fun provideUpdateMoviesUseCase(moviesRepository: MoviesRepository):UpdateMoviesUseCase{
        return UpdateMoviesUseCase(moviesRepository)
    }
}