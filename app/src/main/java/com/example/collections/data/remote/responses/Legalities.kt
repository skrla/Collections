package com.example.collections.data.remote.responses


import com.google.gson.annotations.SerializedName

data class Legalities(
    @SerializedName("expanded")
    val expanded: String,
    @SerializedName("standard")
    val standard: String,
    @SerializedName("unlimited")
    val unlimited: String
)