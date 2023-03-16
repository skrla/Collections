package com.example.collections.data.remote.digimonresponses


import com.google.gson.annotations.SerializedName

data class Level(
    @SerializedName("id")
    val id: Int,
    @SerializedName("level")
    val level: String
)