package com.example.collections.data.remote.responses


import com.google.gson.annotations.SerializedName

data class CardmarketX(
    @SerializedName("prices")
    val prices: PricesXX,
    @SerializedName("updatedAt")
    val updatedAt: String,
    @SerializedName("url")
    val url: String
)