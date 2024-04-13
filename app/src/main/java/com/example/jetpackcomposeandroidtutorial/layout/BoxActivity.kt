package com.example.jetpackcomposeandroidtutorial.layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height


import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp

import com.example.jetpackcomposeandroidtutorial.R

class BoxActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BoxFunction()
        }
    }
}

@Composable
fun BoxFunction() {
    // The Box composable is used to contain an Image and Text composables.
// The Image is aligned to the bottom center of the Box using the align modifier.
// Similarly, the Text is also aligned to the bottom center and padded with 10dp.
// Both the Image and Text display the same text from the string resource R.string.sample_image_desc.
// The Image shows an image represented by the R.drawable.sample resource.
    Box(
        modifier = Modifier.fillMaxWidth(),
    ) {
        Image(
            modifier = Modifier.align(Alignment.BottomCenter),
            painter = painterResource(id = R.drawable.sample),
            contentDescription = stringResource(id = R.string.sample_image_desc)
        )
        Text(
            text = stringResource(id = R.string.sample_image_desc),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(10.dp),
            style = TextStyle(
                fontSize = TextUnit(value = 20F, TextUnitType.Sp),
                color = androidx.compose.ui.graphics.Color.Red
            )
        )

    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewBoxActivity() {
    BoxFunction()
}
