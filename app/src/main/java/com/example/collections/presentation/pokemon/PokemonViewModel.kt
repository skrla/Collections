package com.example.collections.presentation.pokemon

import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.palette.graphics.Palette
import com.example.collections.data.mappers.toPokemonCardsList
import com.example.collections.data.remote.responses.PokemonTCG
import com.example.collections.repository.PokemonRepository
import com.example.collections.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PokemonViewModel @Inject constructor(private val repository: PokemonRepository) : ViewModel() {

    private var page = 1
    private var total = 0

    var search = MutableStateFlow("")

    @OptIn(ExperimentalCoroutinesApi::class)
    var pokemonCardsList = search.flatMapLatest { searchValue ->
        repository.getPokemonTCGData(searchValue)
    .map {
            card -> card.map { it.toPokemonCardsList() } }
    }
    .stateIn(viewModelScope, SharingStarted.WhileSubscribed(), emptyList())
    var loadError = mutableStateOf("")
    var isLoading = mutableStateOf(false)
    var endReached = mutableStateOf(false)

    init {
        loadPokemonCardsApi()
    }

    private fun loadPokemonCardsApi() {
        viewModelScope.launch {
            if (pokemonCardsList.value.isNotEmpty()) {
                page = pokemonCardsList.value.size / 250 + 1
            }
            when(val result = repository.getPokemons(page)) {
                is Resource.Success -> {
                    val resultData: PokemonTCG = result.data!!
                    endReached.value = resultData.page * resultData.pageSize >= resultData.totalCount
                    total = resultData.totalCount
                    loadError.value = ""
                    isLoading.value = false
                    loadMorePokemonCards()
                }
                is Resource.Error -> {
                    loadError.value = result.message!!
                    isLoading.value = false
                }
                else -> {
                    loadError.value = "Error"
                    isLoading.value = false
                }
            }
        }
    }

    fun calcDominantColor(drawable: Drawable, onFinish: (Color) -> Unit) {
        val bmp = (drawable as BitmapDrawable).bitmap.copy(Bitmap.Config.ARGB_8888, true)

        Palette.from(bmp).generate { palette ->
            palette?.dominantSwatch?.rgb?.let { colorValue ->
                onFinish(Color(colorValue))
            }
        }
    }

    private suspend fun loadMorePokemonCards() {
        if(pokemonCardsList.value.size < total) {
            delay(4000)
            loadPokemonCardsApi()
        }
    }

}