package com.example.carzo.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.carzo.R

@Composable
fun ArrowButton(){
    Box(
        modifier = Modifier
            .size(40.dp)
            .background(color = Color(0xFF6E95FF), shape = CircleShape),
        contentAlignment = Alignment.Center
    ){
        Image(
            painter = painterResource(R.drawable.arrow),
            contentDescription = "arrow",
            modifier = Modifier.size(18.dp)
                .clickable(onClick = {/*code here*/})
        )
    }
}