package com.example.composecourseyt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //Literally Columns to seem like a xml organized layout
            //Can be row too
            Column(modifier = Modifier
                .fillMaxSize() // can put a fraction, like (0.5f) to fill half the size of screen
                //Can also define height() and width()
                .background(Color.Green),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
                    // for a row are reverse, horizontalArragement and vertialAligment
                ) {
                // CTRL P shows what can be inserted into the () in column
                Text("Hello")
                Text("World")
                Text("Hello")
            }
        }
    }
}
