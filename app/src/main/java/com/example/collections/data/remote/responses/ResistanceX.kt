package com.example.collections.data.remote.responses


import com.google.gson.annotations.SerializedName

data class ResistanceX(
    @SerializedName("type")
    val type: String,
    @SerializedName("value")
    val value: String
)