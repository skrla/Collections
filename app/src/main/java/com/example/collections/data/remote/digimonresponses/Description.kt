package com.example.collections.data.remote.digimonresponses


import com.google.gson.annotations.SerializedName

data class Description(
    @SerializedName("description")
    val description: String,
    @SerializedName("language")
    val language: String,
    @SerializedName("origin")
    val origin: String
)