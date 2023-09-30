package com.example.jetpack1.ui.screens

import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpack1.ui.models.NavigationItem
import com.example.jetpack1.ui.theme.BlueGrey
import com.example.jetpack1.ui.theme.LightBlue
import com.example.jetpack1.ui.theme.Red

@Preview(showBackground = true)
@Composable
fun BottomBar() {
    val menu = listOf(
        NavigationItem.Home,
        NavigationItem.Favorite,
        NavigationItem.Ticket,
        NavigationItem.Profile
    )

    var selectedMenu by remember { mutableStateOf(0) }

    BottomAppBar {
        menu.forEachIndexed { index, navigationItem ->
            NavigationBarItem(
                selected = selectedMenu == index,
                onClick = { selectedMenu = index },
                icon = {
                    Icon(
                        painter = painterResource(id = navigationItem.icon),
                        contentDescription = navigationItem.title,
                        modifier = Modifier.size(20.dp)
                    )
                },
                label = {
                    Text(text = navigationItem.title)
                },
                alwaysShowLabel = false,
                /*colors = NavigationBarItemDefaults.colors(
                    indicatorColor = BlueGrey
                )*/
            )
        }
    }
}