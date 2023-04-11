package com.example.collections.data.remote.responses


import com.google.gson.annotations.SerializedName

data class DataXX(
    @SerializedName("artist")
    val artist: String,
    @SerializedName("attacks")
    val attacks: List<AttackX>,
    @SerializedName("cardmarket")
    val cardmarket: CardmarketX,
    @SerializedName("convertedRetreatCost")
    val convertedRetreatCost: Int,
    @SerializedName("hp")
    val hp: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("images")
    val images: ImagesXXX,
    @SerializedName("legalities")
    val legalities: LegalitiesXX,
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
    val resistances: List<ResistanceX>,
    @SerializedName("retreatCost")
    val retreatCost: List<String>,
    @SerializedName("set")
    val `set`: SetX,
    @SerializedName("subtypes")
    val subtypes: List<String>,
    @SerializedName("supertype")
    val supertype: String,
    @SerializedName("tcgplayer")
    val tcgplayer: TcgplayerX,
    @SerializedName("types")
    val types: List<String>,
    @SerializedName("weaknesses")
    val weaknesses: List<WeaknesseX>
)