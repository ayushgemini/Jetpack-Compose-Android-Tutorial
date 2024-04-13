package com.example.jetpackcomposeandroidtutorial.layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout


class ConstraintActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ConstraintFunction()
        }
    }
}

@Composable
fun ConstraintFunction() {

// The ConstraintLayout composable is used to create a layout with constraints that define the positioning of its children.
// In this layout:
// - A Button is placed at the center of the ConstraintLayout and occupies the entire space.
// - Four Text  are positioned around the Button: Left Text, Top Text, Right Text, and Bottom Text.
// - Each Text  is constrained relative to the Button and the parent ConstraintLayout using the ConstraintLayout's createRefs() function.
// - The constraints specify the positioning of each Text relative to the Button and the edges of the ConstraintLayout.
// - The Button displays the text "Sample Button" and has an onClick listener attached.
// - Each Text displays a sample text string and is positioned according to its constraints.

    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (button, textLeft, textTop, textRight, textBottom) = createRefs()
        Button(
            onClick = { /*On click of button*/ },
            modifier = Modifier.constrainAs(button) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                bottom.linkTo(parent.bottom)
                end.linkTo(parent.end)
            },
        ) {
            Text(text = "Sample Button")
        }
        Text(text = "Left Text", modifier = Modifier.constrainAs(textLeft) {
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            end.linkTo(button.start)
            bottom.linkTo(parent.bottom)
        })

        Text(text = "Top Text", modifier = Modifier.constrainAs(textTop) {
            top.linkTo(parent.top)
            bottom.linkTo(button.top)
            start.linkTo(button.start)
            end.linkTo(button.end)
        })

        Text(text = "Right Text", modifier = Modifier.constrainAs(textRight) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(button.end)
            end.linkTo(parent.end)
        })

        Text(text = "Bottom Text", modifier = Modifier.constrainAs(textBottom) {
            top.linkTo(button.bottom)
            start.linkTo(button.start)
            end.linkTo(button.end)
            bottom.linkTo(parent.bottom)
        })
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewConstraintActivity() {
    ConstraintFunction()
}