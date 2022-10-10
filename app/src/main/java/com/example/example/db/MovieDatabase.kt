package com.example.example.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.example.dao.MovieDao
import com.example.example.model.MovieEntity

@Database(
    entities = [MovieEntity::class],
    version = 3,
    exportSchema = false
)
abstract class MovieDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDao
}