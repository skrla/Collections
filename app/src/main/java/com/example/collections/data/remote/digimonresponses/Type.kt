package com.example.collections.data.remote.digimonresponses


import com.google.gson.annotations.SerializedName

data class Type(
    @SerializedName("id")
    val id: Int,
    @SerializedName("type")
    val type: String
)