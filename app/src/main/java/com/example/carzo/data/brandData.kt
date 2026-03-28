package com.example.carzo.data

import com.example.carzo.R
import com.example.carzo.model.Brand

fun brandData(): List<Brand>{
    return listOf(
        Brand(R.drawable.tesla),
        Brand(R.drawable.bmw),
        Brand(R.drawable.ferrari),
        Brand(R.drawable.porsche),
        Brand(R.drawable.mercedes),
        Brand(R.drawable.audi),
        Brand(R.drawable.rr),
    )
}