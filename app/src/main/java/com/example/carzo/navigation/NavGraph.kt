package com.example.carzo.navigation
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.*
import com.example.carzo.components.BottomBar
import com.example.carzo.screen.*

@Composable
fun NavGraph() {

    val navController = rememberNavController()

    Scaffold(
        containerColor = Color.Transparent,
        bottomBar = {
            BottomBar(navController)
        }
    ) { padding ->

        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(padding)
        ) {

            composable(Screen.Home.route) {
                HomeScreen()
            }
//
//            composable(Screen.Favorite.route) {
//                FavoriteScreen()
//            }
//
//            composable(Screen.Profile.route) {
//                ProfileScreen()
//            }

        }
    }
}