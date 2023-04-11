package com.example.collections.data.remote.responses


import com.google.gson.annotations.SerializedName

data class Tcgplayer(
    @SerializedName("prices")
    val prices: PricesX,
    @SerializedName("updatedAt")
    val updatedAt: String,
    @SerializedName("url")
    val url: String
)