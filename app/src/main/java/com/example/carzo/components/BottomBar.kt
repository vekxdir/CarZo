package com.example.carzo.components
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.carzo.navigation.Screen

@Composable
fun BottomBar(navController: NavController) {

    val items = listOf(
        Screen.Home,
        Screen.Favorite,
        Screen.Profile
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),   // space from screen edge
        contentAlignment = Alignment.Center
    ) {

        NavigationBar(
            modifier = Modifier
                .height(70.dp)
                .clip(RoundedCornerShape(40.dp))
                .background(Color.White.copy(alpha = 0.85f))
                .shadow(10.dp, RoundedCornerShape(40.dp)),

            containerColor = Color.Transparent
        ) {

            items.forEach { screen ->

                NavigationBarItem(
                    selected = currentRoute == screen.route,

                    onClick = {
                        navController.navigate(screen.route) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                            restoreState = true
                        }
                    },

                    icon = {
                        Icon(
                            imageVector = screen.icon,
                            contentDescription = screen.label
                        )
                    },

                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.White,
                        indicatorColor = Color(0xFF2962FF),
                        unselectedIconColor = Color.Gray
                    )
                )
            }
        }
    }
}