package com.example.collections.data.remote

import com.example.collections.data.remote.responses.PokemonCard
import com.example.collections.data.remote.responses.PokemonTCG
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokemonApi {

    @GET("cards")
    suspend fun getPokemons(
        @Query("page") page: Int
    ) : PokemonTCG

    @GET("cards/{id}")
    suspend fun getPokemonCardInfo(@Path("name") name: String): PokemonCard


}