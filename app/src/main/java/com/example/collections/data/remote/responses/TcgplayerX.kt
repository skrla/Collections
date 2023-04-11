package com.example.collections.data.remote.responses


import com.google.gson.annotations.SerializedName

data class TcgplayerX(
    @SerializedName("prices")
    val prices: PricesXXX,
    @SerializedName("updatedAt")
    val updatedAt: String,
    @SerializedName("url")
    val url: String
)