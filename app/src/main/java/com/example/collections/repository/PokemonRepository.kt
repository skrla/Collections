package com.example.collections.repository

import com.example.collections.data.local.TCGDao
import com.example.collections.data.local.models.PokemonCardsList
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
        savePokemonData(response)
        return Resource.Success(response)
    }

    fun getPokemonTCGData(): Flow<List<PokemonCardsList>> {
        return tcgDao.getPokemonTCGData()
    }

    suspend fun upsertAllPokemonCards(pokemonCardsList: List<PokemonCardsList>) {
        tcgDao.upsertAllPokemonCards(pokemonCardsList)
    }

    private suspend fun savePokemonData(pokemonTCG: PokemonTCG) {
        val pokemonCards = pokemonTCG.data.mapIndexed { index, card ->
            PokemonCardsList(
                card.id,
                card.name.replaceFirstChar {
                    if(it.isLowerCase()) it.titlecaseChar() else it },
                card.supertype,
                card.images.large,
                if (card.nationalPokedexNumbers.isNullOrEmpty()) 0 else card.nationalPokedexNumbers.get(0)
            )
        }
        upsertAllPokemonCards(pokemonCards)
    }
}