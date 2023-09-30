package com.example.jetpack1.ui.models

import androidx.annotation.DrawableRes

data class Travel(
    val title: String,
    val price: Int,
    @DrawableRes val image: Int
)
