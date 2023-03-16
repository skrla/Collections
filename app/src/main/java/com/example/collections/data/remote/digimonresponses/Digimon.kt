package com.example.collections.data.remote.digimonresponses


import com.google.gson.annotations.SerializedName

data class Digimon(
    @SerializedName("attributes")
    val attributes: List<Attribute>,
    @SerializedName("descriptions")
    val descriptions: List<Description>,
    @SerializedName("fields")
    val fields: List<Field>,
    @SerializedName("id")
    val id: Int,
    @SerializedName("images")
    val images: List<Image>,
    @SerializedName("levels")
    val levels: List<Level>,
    @SerializedName("name")
    val name: String,
    @SerializedName("nextEvolutions")
    val nextEvolutions: List<NextEvolution>,
    @SerializedName("priorEvolutions")
    val priorEvolutions: List<PriorEvolution>,
    @SerializedName("releaseDate")
    val releaseDate: String,
    @SerializedName("skills")
    val skills: List<Skill>,
    @SerializedName("types")
    val types: List<Type>,
    @SerializedName("xAntibody")
    val xAntibody: Boolean
)