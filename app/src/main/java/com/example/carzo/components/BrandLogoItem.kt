package com.example.carzo.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun BrandLogoItem(img: Int){
    Box(
        modifier = Modifier
            .size(60.dp)
            .background(
                color = Color.White,
                shape = CircleShape
            )
            .shadow(4.dp,CircleShape),
        contentAlignment = Alignment.Center
    ){
        Image(
            painter = painterResource(img),
            contentDescription = "brand_img",
            modifier = Modifier.size(30.dp)
        )
    }
}