package com.example.assignment.presentation.di

import com.example.assignment.domain.usecase.GetMoviesUseCase
import com.example.assignment.domain.usecase.UpdateMoviesUseCase
import com.example.assignment.presentation.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewFactory(getMoviesUseCase: GetMoviesUseCase,
                                updateMoviesUseCase: UpdateMoviesUseCase):MovieViewModelFactory{
        return MovieViewModelFactory(getMoviesUseCase, updateMoviesUseCase)
    }
}