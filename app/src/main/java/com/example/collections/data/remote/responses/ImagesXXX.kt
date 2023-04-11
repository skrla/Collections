package com.example.collections.data.remote.responses


import com.google.gson.annotations.SerializedName

data class ImagesXXX(
    @SerializedName("large")
    val large: String,
    @SerializedName("small")
    val small: String
)