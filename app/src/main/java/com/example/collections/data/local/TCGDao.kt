package com.example.collections.data.local

import androidx.room.*
import com.example.collections.data.local.models.PokemonCardsList
import kotlinx.coroutines.flow.Flow


@Dao
interface TCGDao {

    @Query("SELECT * FROM pokemon_tcg")
    fun getPokemonTCGData(): Flow<List<PokemonCardsList>>

    @Upsert
    suspend fun upsertPokemonCard(pokemonCardsList: PokemonCardsList)

    @Upsert
    suspend fun upsertAllPokemonCards(pokemonCardsList: List<PokemonCardsList>)
}