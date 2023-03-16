package com.example.collections.data.remote.digimonresponses


import com.google.gson.annotations.SerializedName

data class DigimonList(
    @SerializedName("content")
    val content: List<Content>,
    @SerializedName("pageable")
    val pageable: Pageable
)