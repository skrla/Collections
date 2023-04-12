package com.example.collections.repository

import com.example.collections.data.local.TCGDao
import com.example.collections.data.local.PokemonCardEntity
import com.example.collections.data.mappers.toPokemonCardEntity
import com.example.collections.data.remote.PokemonApi
import com.example.collections.data.remote.responses.PokemonTCG
import com.example.collections.util.Resource
import kotlinx.coroutines.flow.Flow

class PokemonRepository(private val api: PokemonApi, private val tcgDao: TCGDao) {
    suspend fun getPokemons(page: Int) : Resource<PokemonTCG> {
        val response = try {
            api.getPokemons(page)
        } catch (e: Exception) {
            return Resource.Error("Can't connect to the server")
        }
        val pokemonCardEntities = response.data.map { it.toPokemonCardEntity() }
        tcgDao.upsertAllPokemonCards(pokemonCardEntities)
        return Resource.Success(response)
    }

    fun getPokemonTCGData(query: String): Flow<List<PokemonCardEntity>> {
        return tcgDao.getPokemonTCGData(query)
    }

}