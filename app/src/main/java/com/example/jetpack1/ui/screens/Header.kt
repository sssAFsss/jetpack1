package com.example.jetpack1.ui.screens

import android.preference.PreferenceActivity.Header
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack1.R

@Composable
fun Header() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp, 20.dp, 20.dp, 0.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Text(
            fontSize = 33.sp,
            text = "Where Would you like to travel?",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.weight(0.8f),
            style = LocalTextStyle.current.copy(lineHeight = 35.sp)
        )
        //Spacer(modifier = Modifier.height(0.dp))
        Image(
            painter = painterResource(id = R.drawable.yuga),
            contentDescription = "profile image",
            modifier = Modifier
                .weight(0.2f)
                .clip(RoundedCornerShape(50))
        )
    }
}