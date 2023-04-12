package com.example.collections.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [PokemonCardEntity::class], version = 1, exportSchema = false)
abstract class TCGDatabase : RoomDatabase() {

    abstract val tcgDao: TCGDao
}