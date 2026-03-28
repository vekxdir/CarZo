package com.example.carzo.components

import android.R.attr.start
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carzo.R
import com.example.carzo.model.Car
import com.example.carzo.ui.theme.CarZoTheme

@Composable
fun CarCard(car: Car) {


    Box(
        modifier = Modifier
            .fillMaxWidth()
            .shadow(6.dp, RoundedCornerShape(20.dp))
            .background(color = Color.White, RoundedCornerShape(20.dp))
            .wrapContentHeight()
            .padding(16.dp)
    ) {
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                BrandLogoItem(car.logo)
                //column
                Column(
                    modifier = Modifier.padding(start = 10.dp)
                ) {
                    Text(
                        text = car.name,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = car.edition,
                        fontSize = 14.sp
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                ArrowButton()
            }
            //row
            Row(
                modifier = Modifier.fillMaxWidth().padding(top = 15.dp),
                horizontalArrangement = Arrangement.SpaceEvenly

            ) {
                SpecChip(car.price)
                SpecChip(car.hp)
                SpecChip(car.transmission)
            }

            //box
            Box(
                modifier = Modifier.fillMaxWidth()
                    .padding(top = 30.dp)
            ){

                Image(
                    painter = painterResource(car.image),
                    contentDescription = "car_image"
                )

            }
        }
    }
}

