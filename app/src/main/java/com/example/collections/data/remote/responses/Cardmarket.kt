package com.example.collections.data.remote.responses


import com.google.gson.annotations.SerializedName

data class Cardmarket(
    @SerializedName("prices")
    val prices: Prices,
    @SerializedName("updatedAt")
    val updatedAt: String,
    @SerializedName("url")
    val url: String
)