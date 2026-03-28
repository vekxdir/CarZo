package com.example.carzo.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.carzo.components.BrandItems
import com.example.carzo.components.CarCard
import com.example.carzo.components.CarObjects
import com.example.carzo.components.Header
import com.example.carzo.data.getCar
import com.example.carzo.navigation.NavGraph
import com.example.carzo.ui.theme.CarZoTheme

@Composable
fun HomeScreen() {
    val cars = getCar()
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFF2F2F2))
            .statusBarsPadding()
            .padding(15.dp)

    ) {
        item { Header() }
        item { Spacer(Modifier.height(20.dp)) }
        item { BrandItems() }
        item { Spacer(Modifier.height(25.dp)) }
        items(cars) { car ->
            CarCard(car = car)
            Spacer(Modifier.height(25.dp))


        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewTest() {
    CarZoTheme {
        NavGraph()
    }
}