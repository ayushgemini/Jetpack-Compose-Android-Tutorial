package com.example.jetpackcomposeandroidtutorial.button

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeandroidtutorial.layout.showToast

class ButtonActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column {
                SimpleButton()
                RoundedCornerButton()
                BorderButton()
                IconButton()
            }

        }
    }
}


@Composable
fun RoundedCornerButton() {
    val context = LocalContext.current
    Button(onClick = { showToast("On Click event of Rounded Button", context) },
        shape = RoundedCornerShape(30), modifier =  Modifier.padding(10.dp)

    ) {
        Text(text = "Rounded Corner Button")

    }
}
@Composable
fun SimpleButton() {
   val context = LocalContext.current
    Button(onClick = { showToast("On Click event of Simple Button", context) },
        shape = RoundedCornerShape(0),
         modifier =  Modifier.padding(10.dp)
    ) {
        Text(text = "Simple Button")
    }
}

@Composable
fun BorderButton() {
    val context = LocalContext.current
    Button(onClick = { showToast("On Click event of Border Button", context) },
        shape = RoundedCornerShape(30),
        modifier =  Modifier.padding(10.dp),
        border = BorderStroke(1.dp, color = Color.Red),
        colors = ButtonDefaults.buttonColors(Color.Black)

    ) {
        Text(text = "Border Button")
    }
}

@Composable
fun IconButton() {
    val context = LocalContext.current
    Button(onClick = { showToast("On Click event of Icon Button", context) },
        shape = RoundedCornerShape(30),
        modifier =  Modifier.padding(10.dp),
        border = BorderStroke(1.dp, color = Color.Red),
        colors = ButtonDefaults.buttonColors(Color.Black)

    ) {
        Text(text = "Icon Button")
        Icon(imageVector = Icons.Default.Face, contentDescription = "face", modifier = Modifier.padding(10.dp, 0.dp,0.dp,0.dp))

    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewButtonActivity() {
    Column {
        SimpleButton()
        RoundedCornerButton()
        BorderButton()
        IconButton()
    }


}