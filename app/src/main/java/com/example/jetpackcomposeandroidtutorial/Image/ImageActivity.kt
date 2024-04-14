package com.example.jetpackcomposeandroidtutorial.Image

import android.content.res.Resources
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeandroidtutorial.R

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column {
                LoadImage()
                LoadCircularImage()
            }
        }
    }
}

@Composable
fun LoadImage() {
    Image(
        painter = painterResource(id = R.drawable.sample),
        contentDescription = "Sample Image",
        modifier = Modifier.padding(20.dp)
    )
}

@Composable
fun LoadCircularImage() {
    Image(
        painter = painterResource(id = R.drawable.sample),
        contentDescription = "Sample Image",
        contentScale = ContentScale.Inside,
        modifier = Modifier.padding(20.dp).clip(RoundedCornerShape(80),

        )
    )
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewImageActivity() {
    Column {
        LoadImage()
        LoadCircularImage()
    }

}

