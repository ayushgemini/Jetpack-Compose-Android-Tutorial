package com.example.jetpackcomposeandroidtutorial.text

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class TextStyleActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StyleMyText(
                displayText = "Hi, I'm Ayush Gemini. Welcome to our Jetpack Compose journey, " +
                        "where we delve into the art of text styling. Join me as we explore the nuances of " +
                        "typography and design in this exciting adventure! " +
                        "Get ready to unleash your creativity and make your text stand out!"
            )
        }
    }
}

@Composable
fun StyleMyText(displayText: String) {
// This Text composable displays the text specified by the 'displayText' variable, with a maximum of 6 lines.
// It applies various text styling attributes, including a gray background, centered alignment, red color,
// 20sp font size, Sans Serif font family, bold (weight 900), 3sp letter spacing, line-through text decoration,
// a black shadow with a 5.0F blur radius, and a line height of 30sp. It is padded vertically by 20dp and horizontally by 10dp.
    Text(
        text = displayText,
        modifier = Modifier.padding(10.dp, 20.dp,10.dp, 0.dp),
        maxLines = 6,
        style = TextStyle(
            background = Color.Gray,
            textAlign = TextAlign.Center,
            color = Color.Red,
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.W900,
            letterSpacing = TextUnit(3F, TextUnitType.Sp),
            textDecoration = TextDecoration.LineThrough,
            shadow = Shadow(Color.Black, Offset.Zero, 5.0F),
            lineHeight = TextUnit(30F, TextUnitType.Sp)

        )

    )
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewUI() {
    StyleMyText(
        displayText = "Hi, I'm Ayush Gemini. Welcome to our Jetpack Compose journey, " +
                "where we delve into the art of text styling. Join me as we explore the nuances of " +
                "typography and design in this exciting adventure! " +
                "Get ready to unleash your creativity and make your text stand out!"
    )
}

