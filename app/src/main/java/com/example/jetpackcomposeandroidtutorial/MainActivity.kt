package com.example.jetpackcomposeandroidtutorial

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeandroidtutorial.Image.ImageActivity
import com.example.jetpackcomposeandroidtutorial.animation.CrossFadeActivity
import com.example.jetpackcomposeandroidtutorial.card.CardActivity
import com.example.jetpackcomposeandroidtutorial.layout.BoxActivity
import com.example.jetpackcomposeandroidtutorial.layout.ColumnActivity
import com.example.jetpackcomposeandroidtutorial.layout.ConstraintActivity
import com.example.jetpackcomposeandroidtutorial.layout.LazyColumnActivity
import com.example.jetpackcomposeandroidtutorial.layout.LazyRowActivity
import com.example.jetpackcomposeandroidtutorial.layout.RowActivity
import com.example.jetpackcomposeandroidtutorial.text.EditTextActivity
import com.example.jetpackcomposeandroidtutorial.text.TextActivity
import com.example.jetpackcomposeandroidtutorial.text.TextStyleActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Main()
        }
    }
}


@Composable
fun Main() {
    Column(modifier = Modifier.padding(0.dp, 50.dp, 0.dp, 0.dp)) {
        val context = LocalContext.current
        Button(onClick = {
            context.startActivity(Intent(context, BoxActivity::class.java))
        }) {
            Text(text = "Box Layout")
        }
        Button(onClick = {
            context.startActivity(Intent(context, ColumnActivity::class.java))
        }) {
            Text(text = "Column Layout")
        }
        Button(onClick = {
            context.startActivity(Intent(context, ConstraintActivity::class.java))
        }) {
            Text(text = "Constraint Layout")
        }
        Button(onClick = {
            context.startActivity(Intent(context, EditTextActivity::class.java))
        }) {
            Text(text = "EditText")
        }
        Button(onClick = {
            context.startActivity(Intent(context, TextActivity::class.java))
        }) {
            Text(text = "Text")
        }
        Button(onClick = {
            context.startActivity(Intent(context, TextStyleActivity::class.java))
        }) {
            Text(text = "Text Style")
        }

        Button(onClick = {
            context.startActivity(Intent(context, LazyColumnActivity::class.java))
        }) {
            Text(text = "Lazy Column")
        }

        Button(onClick = {
            context.startActivity(Intent(context, LazyRowActivity::class.java))
        }) {
            Text(text = "Lazy Row")
        }
        Button(onClick = {
            context.startActivity(Intent(context, RowActivity::class.java))
        }) {
            Text(text = "Row Layout")
        }

        Button(onClick = {
            context.startActivity(Intent(context, ImageActivity::class.java))
        }) {
            Text(text = "Image")
        }

        Button(onClick = {
            context.startActivity(Intent(context, CardActivity::class.java))
        }) {
            Text(text = "Card")
        }

        Button(onClick = {
            context.startActivity(Intent(context, CrossFadeActivity::class.java))
        }) {
            Text(text = "CrossFadeAnimation")
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Main()
}