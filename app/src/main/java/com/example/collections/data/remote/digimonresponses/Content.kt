package com.example.collections.data.remote.digimonresponses


import com.google.gson.annotations.SerializedName

data class Content(
    @SerializedName("href")
    val href: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String
)