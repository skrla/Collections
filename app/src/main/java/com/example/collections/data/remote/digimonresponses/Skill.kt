package com.example.collections.data.remote.digimonresponses


import com.google.gson.annotations.SerializedName

data class Skill(
    @SerializedName("description")
    val description: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("skill")
    val skill: String,
    @SerializedName("translation")
    val translation: String
)