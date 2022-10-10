package com.example.example.usecase

import com.example.example.repository.FakeMovieRepository

class UpdateMoviesUsecase(
    private val repository: FakeMovieRepository
) {
    suspend operator fun invoke() {
        repository.updateMovies()
    }
}