package com.example.assignment.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.assignment.domain.usecase.GetMoviesUseCase
import com.example.assignment.domain.usecase.UpdateMoviesUseCase

class MovieViewModelFactory(private val getMoviesUseCase: GetMoviesUseCase,
                            private val updateMoviesUseCase: UpdateMoviesUseCase ):ViewModelProvider.Factory {


    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MovieViewModel(getMoviesUseCase,updateMoviesUseCase) as T
    }
}