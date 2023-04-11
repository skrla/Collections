package com.example.collections.ui.pokemon

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.collections.R
import com.example.collections.data.local.models.PokemonCardsList

@Composable
fun PokemonTCGScreen(
    navController: NavController,
    viewModel: PokemonViewModel = hiltViewModel()
) {
    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier.fillMaxSize()
    ) {
        Column {
            Spacer(
                modifier = Modifier.height(20.dp)
            )
            PokemonCardList(navController = navController)
        }

    }

}

@Composable
fun PokemonCardList(
    navController: NavController,
    viewModel: PokemonViewModel = hiltViewModel()
) {
    val pokemonCardList by viewModel.pokemonCardsList.collectAsState()
    val endReach by remember { viewModel.endReached }
    val loadError by remember { viewModel.loadError }
    val isLoading by remember { viewModel.isLoading }

    LazyColumn(
        contentPadding = PaddingValues(16.dp)
    ) {
        val itemCount = if (pokemonCardList.size % 2 == 0) {
            pokemonCardList.size / 2
        } else {
            pokemonCardList.size / 2 + 1
        }
        items(itemCount) {
            PokemonCardRow(rowIndex = it, pokemonCardsList = pokemonCardList, navController = navController)
        }
    }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxWidth()
    ) {
        if (isLoading) {
            CircularProgressIndicator(color = MaterialTheme.colorScheme.primary)
        }
    }
}

@Composable
fun PokemonCardRow(
    rowIndex: Int,
    pokemonCardsList: List<PokemonCardsList>,
    navController: NavController
) {
    Column {
        Row {
            PokemonCardInList(
                pokemonCard = pokemonCardsList[rowIndex * 2],
                navController = navController,
                modifier = Modifier
                    .weight(1f)
            )
            Spacer(modifier = Modifier.width(16.dp))
            if (pokemonCardsList.size >= rowIndex * 2 + 2) {
                PokemonCardInList(
                    pokemonCard = pokemonCardsList[rowIndex * 2 + 1],
                    navController = navController,
                    modifier = Modifier
                        .weight(1f)
                )
            } else {
                Spacer(modifier = Modifier.weight(1f))
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
    }
}

@Composable
fun PokemonCardInList(
    pokemonCard: PokemonCardsList,
    navController: NavController,
    modifier: Modifier = Modifier,
    viewModel: PokemonViewModel = hiltViewModel()
) {
    val defaultDominantColor = MaterialTheme.colorScheme.surface
    var dominantColor by remember {
        mutableStateOf(defaultDominantColor)
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .shadow(10.dp, RoundedCornerShape(10.dp))
            .clip(RoundedCornerShape(10.dp))
            .height(250.dp)
            .background(
                Brush.verticalGradient(
                    listOf(
                        dominantColor,
                        defaultDominantColor
                    )
                )
            )
            .clickable {
            }
    ) {
        Column {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(pokemonCard.imageUrl)
                    .crossfade(true)
                    .build(),
                contentDescription = pokemonCard.name,
                modifier = Modifier
                    .requiredSize(200.dp)
                    .align(CenterHorizontally),
                onSuccess = { success ->
                    viewModel.calcDominantColor(success.result.drawable) { color ->
                        dominantColor = color
                    }
                },
                placeholder = painterResource(id = R.drawable.ic_pokemon_logo)
            )
            Text(
                text = pokemonCard.name,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}