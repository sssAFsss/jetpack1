package com.example.jetpack1.ui.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpack1.ui.theme.Black
import com.example.jetpack1.ui.theme.Blue
import com.example.jetpack1.ui.theme.Grey
import com.example.jetpack1.ui.theme.White

@Composable
fun HeaderFilter(filterList: List<String>) {
    var selectedFilterIndex by remember { mutableStateOf(0) }
    LazyRow(
        modifier = Modifier.padding(20.dp, 0.dp, 0.dp, 0.dp)
    ) {
        items(filterList.size) { index ->
            TextButton(
                onClick = { selectedFilterIndex = index },
                colors = ButtonDefaults.textButtonColors(
                    containerColor = if (selectedFilterIndex == index) Blue else Grey,
                    contentColor = if (selectedFilterIndex == index) White else Black
                ),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 3.dp
                )
            ) {
                Text(text = filterList[index])
            }
            Spacer(modifier = Modifier.width(10.dp))
        }
    }
}