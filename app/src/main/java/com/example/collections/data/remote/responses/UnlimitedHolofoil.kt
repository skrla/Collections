package com.example.collections.data.remote.responses


import com.google.gson.annotations.SerializedName

data class UnlimitedHolofoil(
    @SerializedName("directLow")
    val directLow: Double,
    @SerializedName("high")
    val high: Double,
    @SerializedName("low")
    val low: Double,
    @SerializedName("market")
    val market: Double,
    @SerializedName("mid")
    val mid: Double
)