package com.example.collections.data.remote.responses


import com.google.gson.annotations.SerializedName

data class PokemonTCG(
    @SerializedName("count")
    val count: Int,
    @SerializedName("data")
    val data: List<Data>,
    @SerializedName("page")
    val page: Int,
    @SerializedName("pageSize")
    val pageSize: Int,
    @SerializedName("totalCount")
    val totalCount: Int
)