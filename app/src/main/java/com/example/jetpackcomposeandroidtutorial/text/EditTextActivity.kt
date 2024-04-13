package com.example.jetpackcomposeandroidtutorial.text

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class EditTextActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            // This Column composable arranges three input fields vertically: EditTextName, EditTextAge, and EditTextPassword.
            // It is similar to LinearLayout with vertical orientation.
            Column {
                EditTextName()
                EditTextAge()
                EditTextPassword()
            }
        }
    }
}

@Composable
fun EditTextName() {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    TextField(value = text,
        textStyle = TextStyle(fontSize = 20.sp, color = Color.Red),
        modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth(),
        placeholder = { Text(text = "Enter Your Name") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        onValueChange = { text = it }
    )

}

@Composable
fun EditTextAge() {
    var age by remember {
        mutableStateOf(TextFieldValue(""))
    }

    TextField(
        value = age,
        modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth(),
        textStyle = TextStyle(color = Color.Red, fontSize = 20.sp),
        placeholder = { Text(text = "Enter Your Age") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        onValueChange = { age = it },
    )

}

@Composable
fun EditTextPassword() {
    var password by remember {
        mutableStateOf(TextFieldValue(""))
    }

    TextField(value = password,
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth(),
        placeholder = { Text(text = "Enter Your Password") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        onValueChange = { password = it })
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewEditTextActivity() {
    Column {
        EditTextName()
        EditTextAge()
        EditTextPassword()
    }

}