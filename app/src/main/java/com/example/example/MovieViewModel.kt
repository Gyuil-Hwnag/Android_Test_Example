package com.example.example

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.example.usecase.GetMoviesUseCase
import com.example.example.usecase.UpdateMoviesUsecase
import kotlinx.coroutines.flow.flow

class MovieViewModel(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUsecase: UpdateMoviesUsecase
) : ViewModel() {

    fun getMovies() = flow {
        val movieList = getMoviesUseCase.invoke()
        emit(movieList)
    }

    fun updateMovies() = flow {
        val movieList = updateMoviesUsecase.invoke()
        emit(movieList)
    }

}