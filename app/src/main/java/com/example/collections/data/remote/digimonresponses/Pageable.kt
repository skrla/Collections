package com.example.collections.data.remote.digimonresponses


import com.google.gson.annotations.SerializedName

data class Pageable(
    @SerializedName("currentPage")
    val currentPage: Int,
    @SerializedName("elementsOnPage")
    val elementsOnPage: Int,
    @SerializedName("nextPage")
    val nextPage: String,
    @SerializedName("previousPage")
    val previousPage: String,
    @SerializedName("totalElements")
    val totalElements: Int,
    @SerializedName("totalPages")
    val totalPages: Int
)