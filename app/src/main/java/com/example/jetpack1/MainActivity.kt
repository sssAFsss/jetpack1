package com.example.jetpack1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpack1.ui.models.Travel
import com.example.jetpack1.ui.screens.BottomBar
import com.example.jetpack1.ui.screens.GridMenu
import com.example.jetpack1.ui.screens.Header
import com.example.jetpack1.ui.screens.HeaderFilter
import com.example.jetpack1.ui.screens.Search
import com.example.jetpack1.ui.theme.Jetpack1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpack1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainView()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainView() {

    val filterList = listOf("All", "Flight", "Cruise", "Train", "Car", "Ship")
    val travels = listOf(
        Travel("Las Vegas", 777, R.drawable.vegas),
        Travel("Paris", 250, R.drawable.paris),
        Travel("Tehran", 150, R.drawable.tehran),
        Travel("Rome", 200, R.drawable.rome),
        Travel("Rio", 230, R.drawable.brezil),
        Travel("New York", 330, R.drawable.usa),
        Travel("Moscow", 180, R.drawable.moscow),
        Travel("Hawaii", 280, R.drawable.hawaii),
        Travel("Disney", 280, R.drawable.disneyland),
    )

    Scaffold(
        bottomBar = {
            BottomBar()
        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Header()
                Spacer(modifier = Modifier.height(10.dp))
                Search()
                Spacer(modifier = Modifier.height(10.dp))
                HeaderFilter(filterList)
                Spacer(modifier = Modifier.height(10.dp))
                GridMenu(travels)
            }
        }
    }

}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Jetpack1Theme {
        MainView()
    }
}