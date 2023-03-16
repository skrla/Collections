package com.example.collections.data.remote.digimonresponses


import com.google.gson.annotations.SerializedName

data class NextEvolution(
    @SerializedName("condition")
    val condition: String,
    @SerializedName("digimon")
    val digimon: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String
)