package com.example.collections.repository

import com.example.collections.data.remote.DigimonApi
import com.example.collections.data.remote.digimonresponses.DigimonList
import com.example.collections.util.Resource
import javax.inject.Inject

class DigimonRepository @Inject constructor(private val api: DigimonApi) {
    suspend fun getDigimons(pageSize: Int) : Resource<DigimonList> {
        val response = try {
            api.getDigimons(pageSize)
        } catch (e: Exception) {
            return Resource.Error("Can't connect to the server")
        }
        return Resource.Success(response)
    }
}