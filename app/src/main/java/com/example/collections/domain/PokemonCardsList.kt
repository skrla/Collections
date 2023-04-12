package com.example.collections.domain


data class PokemonCardsList(
    val id: String,
    val name: String,
    val superType: String,
    val imageUrl: String,
    val pokedexNumber: Int
)