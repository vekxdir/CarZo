package com.example.carzo.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.carzo.data.getCar

@Composable
fun CarObjects(){
    val cars = getCar()

    cars.forEach { car->
        CarCard(car)
    }
    }
