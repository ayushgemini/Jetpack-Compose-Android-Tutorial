package com.example.jetpackcomposeandroidtutorial.layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class RowActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RowItems()
        }
    }
}

@Composable
fun RowItems() {
    // It is similar to LinearLayout with horizontal orientation.
    Row (modifier = Modifier.padding(10.dp)){
        Text(text = "one", modifier = Modifier.padding(10.dp))
        Text(text = "two", modifier = Modifier.padding(10.dp))
        Text(text = "Three", modifier = Modifier.padding(10.dp))
        Text(text = "Four", modifier = Modifier.padding(10.dp))
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewRowActivity() {
    RowItems()
}