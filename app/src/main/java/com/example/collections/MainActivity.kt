package com.example.collections

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.collections.ui.MainScreen
import com.example.collections.ui.digimon.DigimonScreen
import com.example.collections.ui.theme.CollectionsTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CollectionsTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "main_screen"
                ) {
                    composable("main_screen") {
                        MainScreen(navController = navController)
                    }
                    composable("digimon_screen") {
                        DigimonScreen(navController = navController)
                    }
                }
            }
        }
    }
}