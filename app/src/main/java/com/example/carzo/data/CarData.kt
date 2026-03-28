package com.example.carzo.data

import com.example.carzo.R
import com.example.carzo.model.Car

fun getCar():List<Car>{
    return listOf(
        Car(
            name = "Porsche 918",
            image = R.drawable.porsche_918,
            price = "$555,000",
            hp = "518 hp",
            transmission = "Automatic",
            edition = "2025 Sport Edition",
            logo = R.drawable.porsche
            ),

        Car(
            name = "Lamborghini Aventador",
            image = R.drawable.lamborghin_aventador,
            price = "$625,000",
            hp = "536 hp",
            transmission = "Automatic",
            edition = "2025 Sport Edition",
            logo = R.drawable.lamborghin_aventador
        ),

        Car(
            name = "Bugatti Veyron",
            image = R.drawable.bugatti_veyron,
            price = "$973,000",
            hp = "611 hp",
            transmission = "Automatic",
            edition = "2026 Sport Edition",
            logo = R.drawable.bugatti_veyron

        ),

        Car(
            name = "Audi RS7",
            image = R.drawable.audi_rs7,
            price = "$255,000",
            hp = "436 hp",
            transmission = "Automatic",
            edition = "2024 Sport Edition",
            logo = R.drawable.audi

        ),

        Car(
            name = "BMW 7 Series",
            image = R.drawable.bmw_7,
            price = "$355,000",
            hp = "485 hp",
            transmission = "Automatic",
            edition = "2025 Sport Edition",
            logo = R.drawable.bmw

        ),

        Car(
            name = "Ferrari 488",
            image = R.drawable.ferrari_488,
            price = "$755,000",
            hp = "700 hp",
            transmission = "Automatic",
            edition = "2025 Sport Edition",
            logo = R.drawable.ferrari

        )

    )
}