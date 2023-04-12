package com.example.collections.data.remote.responses


import com.google.gson.annotations.SerializedName

data class PricesXXX(
    @SerializedName("holofoil")
    val holofoil: Holofoil,
    @SerializedName("reverseHolofoil")
    val reverseHolofoil: ReverseHolofoil
)