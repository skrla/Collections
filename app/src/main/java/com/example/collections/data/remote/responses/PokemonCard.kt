package com.example.collections.data.remote.responses


import com.google.gson.annotations.SerializedName

data class PokemonCard(
    @SerializedName("data")
    val `data`: DataXX
)