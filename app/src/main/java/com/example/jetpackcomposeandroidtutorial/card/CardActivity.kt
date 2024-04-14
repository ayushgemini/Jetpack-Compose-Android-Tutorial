package com.example.jetpackcomposeandroidtutorial.card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class CardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShowCard()
        }
    }
}

@Composable
fun ShowCard() {
    // The Card composable creates a Card with rounded corners, a cyan background color, and an elevation of 6dp.
    // It occupies the entire width, has a height of 300dp, and is padded with 16dp.
    // Inside the Card, a Box composable is used to center-align the Text vertically and horizontally.
    // The Text displays the text "Sample Text" and inherits the alignment properties from the Box.

    Card(
        shape = RoundedCornerShape(20),
        colors = CardDefaults.cardColors(Color.Cyan),
        elevation = CardDefaults.cardElevation(6.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .padding(16.dp)
    ) {
        Box(modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
           Text(text = "Sample Text")
        }

    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewCardActivity() {
    ShowCard()
}
