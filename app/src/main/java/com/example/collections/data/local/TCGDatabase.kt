package com.example.collections.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.collections.data.local.models.PokemonCardsList

@Database(entities = [PokemonCardsList::class], version = 1, exportSchema = false)
abstract class TCGDatabase : RoomDatabase() {

    abstract val tcgDao: TCGDao
}