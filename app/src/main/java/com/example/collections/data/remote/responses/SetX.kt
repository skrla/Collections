package com.example.collections.data.remote.responses


import com.google.gson.annotations.SerializedName

data class SetX(
    @SerializedName("id")
    val id: String,
    @SerializedName("images")
    val images: ImagesXXXX,
    @SerializedName("legalities")
    val legalities: LegalitiesXX,
    @SerializedName("name")
    val name: String,
    @SerializedName("printedTotal")
    val printedTotal: Int,
    @SerializedName("ptcgoCode")
    val ptcgoCode: String,
    @SerializedName("releaseDate")
    val releaseDate: String,
    @SerializedName("series")
    val series: String,
    @SerializedName("total")
    val total: Int,
    @SerializedName("updatedAt")
    val updatedAt: String
)