package com.example.collections.data.remote

import com.example.collections.data.remote.digimonresponses.Digimon
import com.example.collections.data.remote.digimonresponses.DigimonList
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface DigimonApi {

    @GET("digimon")
    suspend fun getDigimons(
        @Query("pageSize") pageSize: Int
    ) : DigimonList

    @GET("digimon/{name}")
    suspend fun getDigimonInfo(@Path("name") name: String): Digimon

}