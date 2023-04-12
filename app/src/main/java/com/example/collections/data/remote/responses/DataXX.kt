package com.example.collections.data.remote.responses


import com.google.gson.annotations.SerializedName

data class DataXX(
    @SerializedName("artist")
    val artist: String,
    @SerializedName("attacks")
    val attacks: List<Attack>,
    @SerializedName("cardmarket")
    val cardmarket: Cardmarket,
    @SerializedName("convertedRetreatCost")
    val convertedRetreatCost: Int,
    @SerializedName("hp")
    val hp: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("images")
    val images: Images,
    @SerializedName("legalities")
    val legalities: Legalities,
    @SerializedName("level")
    val level: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("nationalPokedexNumbers")
    val nationalPokedexNumbers: List<Int>,
    @SerializedName("number")
    val number: String,
    @SerializedName("rarity")
    val rarity: String,
    @SerializedName("resistances")
    val resistances: List<Resistance>,
    @SerializedName("retreatCost")
    val retreatCost: List<String>,
    @SerializedName("set")
    val cardSet: Set,
    @SerializedName("subtypes")
    val subtypes: List<String>,
    @SerializedName("supertype")
    val supertype: String,
    @SerializedName("tcgplayer")
    val tcgplayer: Tcgplayer,
    @SerializedName("types")
    val types: List<String>,
    @SerializedName("weaknesses")
    val weaknesses: List<Weaknesse>
)