package com.example.assignment.domain.usecase

import com.example.assignment.data.model.Movie
import com.example.assignment.domain.repository.MoviesRepository

class UpdateMoviesUseCase(private val moviesRepository: MoviesRepository) {
    suspend fun execute():List<Movie>?= moviesRepository.updateMovies()
}