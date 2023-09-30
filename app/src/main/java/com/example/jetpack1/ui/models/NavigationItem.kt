package com.example.jetpack1.ui.models

import androidx.annotation.DrawableRes
import com.example.jetpack1.R

sealed class NavigationItem(var route: String, var title: String, @DrawableRes var icon: Int) {
    object Home : NavigationItem("home", "Home", R.drawable.home)
    object Favorite : NavigationItem("favorite", "Favorite", R.drawable.heart)
    object Ticket : NavigationItem("ticket", "Ticket", R.drawable.ticket)
    object Profile : NavigationItem("profile", "Profile", R.drawable.profile)
}
