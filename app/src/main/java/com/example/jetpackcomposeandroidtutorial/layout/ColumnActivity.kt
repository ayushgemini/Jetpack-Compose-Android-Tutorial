package com.example.jetpackcomposeandroidtutorial.layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class ColumnActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ColumnFunction()
        }
    }
}

@Composable
fun ColumnFunction() {
    // It is similar to LinearLayout with vertical orientation.
    Column {
        Text(text = "Hello Folks, This is first Text")
        Text(text = "Hello Folks, This is Second Text")
        Text(text = "Hello Folks, This is Third Text")
        Text(text = "Hello Folks, This is Fourth Text")
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewColumnActivity() {
    ColumnFunction()
}