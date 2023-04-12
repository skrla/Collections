package com.example.collections.data.local

import androidx.room.*
import kotlinx.coroutines.flow.Flow


@Dao
interface  TCGDao {

    @Transaction
    @Query("SELECT * FROM pokemon_tcg WHERE UPPER(name) LIKE UPPER(:query) || '%' ")
    fun getPokemonTCGData(query: String): Flow<List<PokemonCardEntity>>

    @Upsert
    suspend fun upsertPokemonCard(pokemonCardEntity: PokemonCardEntity)

    @Upsert
    suspend fun upsertAllPokemonCards(pokemonCardEntity: List<PokemonCardEntity>)
}