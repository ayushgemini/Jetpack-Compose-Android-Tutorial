package com.example.jetpackcomposeandroidtutorial.text

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposeandroidtutorial.R

class TextActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        /* The SetContent block n Jetpack Compose defines the layout of the activity and
    replaces the traditional method of inflating layouts from XML files using
    setContent(R.id.some_xml_file). It's an extension function of the Activity class. Within this block,
    we can call all our @Composable functions, defining the UI elements programmatically instead of using XML files.
    */
        setContent {
            Greeting(name = getString(R.string.greet_name))
        }
    }

}


// This is Composable function, Use @Composable Annotation to show any UI elements
@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
    )
}

// This is Preview function, use @Preview annotation to show preview of your UI elements
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Greeting("Ayush Gemini")
}
