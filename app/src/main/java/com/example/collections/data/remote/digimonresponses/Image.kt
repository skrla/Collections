package com.example.collections.data.remote.digimonresponses


import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName("href")
    val href: String,
    @SerializedName("transparent")
    val transparent: Boolean
)