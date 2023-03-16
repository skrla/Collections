package com.example.collections.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.collections.R

@Composable
fun MainScreen(
    navController: NavController
) {
    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            contentAlignment = Alignment.TopCenter,
            modifier = Modifier.padding(start = 10.dp, end = 10.dp, bottom = 10.dp)
        ) {
            Column {
                Spacer(modifier = Modifier.height(25.dp))
                Text(
                    text = "COLLECTORS APP",
                    textAlign = TextAlign.Center,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(150.dp))
                Image(
                    painter = painterResource(id = R.drawable.ic_digimon_logo),
                    contentDescription = "Digimon",
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(CenterHorizontally)
                        .size(150.dp)
                        .clickable {
                            navController.navigate("digimon_screen")
                        }
                )
                Spacer(modifier = Modifier.height(150.dp))
                Image(
                    painter = painterResource(id = R.drawable.ic_pokemon_logo),
                    contentDescription = "Digimon",
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(CenterHorizontally)
                        .size(150.dp)
                )
            }
        }

    }
}