package com.example.example.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "popular_movies")
data class MovieEntity(
    val movieIdx: Int,
    val overview: String,
    val path: String,
    val data: String,
    val title: String,
) {
    @PrimaryKey(autoGenerate = true)
    val idx: Int = 0
}