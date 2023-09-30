package com.example.jetpack1.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack1.ui.models.Travel
import com.example.jetpack1.ui.theme.Black
import com.example.jetpack1.ui.theme.White
import com.nesyou.staggeredgrid.LazyStaggeredGrid
import com.nesyou.staggeredgrid.StaggeredCells

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun GridMenu(travels: List<Travel>) {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp)
    ) {
        LazyStaggeredGrid(
            cells = StaggeredCells.Fixed(2),

            ) {

            // this is test
            // this is test2
            items(travels.size) {
                Card(
                    onClick = {},
                    shape = RoundedCornerShape(17.dp),
                    modifier = Modifier.padding(5.dp)
                ) {
                    Box {
                        Image(
                            painter = painterResource(id = travels[it].image),
                            contentDescription = travels[it].title,
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillWidth
                        )
                        Text(
                            text = travels[it].title,
                            modifier = Modifier
                                .align(
                                    Alignment.BottomStart
                                )
                                .padding(10.dp),
                            color = White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )
                        Text(
                            text = "${travels[it].price}$",
                            modifier = Modifier
                                .align(Alignment.BottomEnd)
                                .padding(10.dp)
                                .background(White, shape = RoundedCornerShape(10.dp))
                                .padding(3.dp),
                            color = Black,
                        )
                    }
                }
            }
        }
    }
}