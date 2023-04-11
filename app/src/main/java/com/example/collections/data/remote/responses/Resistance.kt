package com.example.collections.data.remote.responses


import com.google.gson.annotations.SerializedName

data class Resistance(
    @SerializedName("type")
    val type: String,
    @SerializedName("value")
    val value: String
)