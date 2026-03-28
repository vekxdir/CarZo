package com.example.carzo.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(
    val route: String,
    val icon: ImageVector,
    val label: String
) {

    object Home : Screen(
        route = "home",
        icon = Icons.Default.Home,
        label = "Home"
    )

    object Favorite : Screen(
        route = "favorite",
        icon = Icons.Default.Favorite,
        label = "Favorite"
    )

    object Profile : Screen(
        route = "profile",
        icon = Icons.Default.Person,
        label = "Profile"
    )
}