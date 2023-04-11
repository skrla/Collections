package com.example.collections.data.remote.responses


import com.google.gson.annotations.SerializedName

data class PokemonSets(
    @SerializedName("count")
    val count: Int,
    @SerializedName("data")
    val data: List<DataX>,
    @SerializedName("page")
    val page: Int,
    @SerializedName("pageSize")
    val pageSize: Int,
    @SerializedName("totalCount")
    val totalCount: Int
)