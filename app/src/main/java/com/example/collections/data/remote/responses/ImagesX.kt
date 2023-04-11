package com.example.collections.data.remote.responses


import com.google.gson.annotations.SerializedName

data class ImagesX(
    @SerializedName("logo")
    val logo: String,
    @SerializedName("symbol")
    val symbol: String
)