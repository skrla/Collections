package com.example.collections.data.remote.responses


import com.google.gson.annotations.SerializedName

data class PricesXXX(
    @SerializedName("holofoil")
    val holofoil: HolofoilX,
    @SerializedName("reverseHolofoil")
    val reverseHolofoil: ReverseHolofoilX
)