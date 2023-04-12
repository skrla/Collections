package com.example.collections.data.mappers

import com.example.collections.data.local.PokemonCardEntity
import com.example.collections.data.remote.responses.Data
import com.example.collections.domain.PokemonCardsList

fun Data.toPokemonCardEntity() : PokemonCardEntity {
    return PokemonCardEntity(
    id = id,
    name = name ,
    superType = supertype,
    imageUrl = images.small,
    pokedexNumber = if (nationalPokedexNumbers.isNullOrEmpty()) 0 else nationalPokedexNumbers.get(0)
    )
}

fun PokemonCardEntity.toPokemonCardsList() : PokemonCardsList {
    return PokemonCardsList(
        id = id,
        name = name,
        superType = superType,
        imageUrl = imageUrl,
        pokedexNumber = pokedexNumber
    )
}