package com.example.carzo.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.carzo.data.brandData


@Composable
fun BrandItems(){
    val brands = brandData()
    LazyRow (horizontalArrangement = Arrangement.SpaceEvenly){
        items(brands){brand->
        BrandLogoItem(brand.img)

        }
    }
}