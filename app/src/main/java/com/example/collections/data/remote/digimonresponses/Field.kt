package com.example.collections.data.remote.digimonresponses


import com.google.gson.annotations.SerializedName

data class Field(
    @SerializedName("field")
    val `field`: String,
    @SerializedName("id")
    val id: Int
)