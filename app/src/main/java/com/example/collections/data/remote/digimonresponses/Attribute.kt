package com.example.collections.data.remote.digimonresponses


import com.google.gson.annotations.SerializedName

data class Attribute(
    @SerializedName("attribute")
    val attribute: String,
    @SerializedName("id")
    val id: Int
)