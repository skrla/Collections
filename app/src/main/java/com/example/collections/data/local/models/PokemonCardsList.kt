package com.example.collections.data.local.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pokemon_tcg")
data class PokemonCardsList(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val name: String,
    val superType: String,
    val imageUrl: String,
    val pokedexNumber: Int
)
