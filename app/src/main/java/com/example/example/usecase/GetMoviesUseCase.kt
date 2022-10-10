package com.example.example.usecase

import com.example.example.repository.FakeMovieRepository

class GetMoviesUseCase(
    private val repository: FakeMovieRepository
) {
    suspend operator fun invoke() {
        repository.getMovies()
    }
}