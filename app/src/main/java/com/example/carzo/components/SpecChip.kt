package com.example.carzo.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SpecChip(name:String){
    Box(
        modifier = Modifier
            .background(color = Color(0xFFF4F4F4),
                shape = RoundedCornerShape(20.dp)

            )
            .padding(horizontal = 12.dp, vertical = 6.dp)
    ){
        Text(text = name, fontSize = 12.sp)
    }
}