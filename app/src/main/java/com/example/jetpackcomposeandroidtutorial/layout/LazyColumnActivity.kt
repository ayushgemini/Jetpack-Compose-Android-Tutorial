package com.example.jetpackcomposeandroidtutorial.layout

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeandroidtutorial.data.Person
import com.example.jetpackcomposeandroidtutorial.data.getPersonList
import com.example.jetpackcomposeandroidtutorial.util.PersonProviderForPreview

class LazyColumnActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoadPersonData(personList = getPersonList())
        }
    }
}

@Composable
fun LoadPersonData(personList: List<Person>) {
    // The LazyColumn composable is used to create a vertically scrolling list of items efficiently.
    // It iterates over the list of Person objects and displays each item as a Card containing the person's name.
    // Each Card is clickable, and when clicked, it displays a toast message showing the person's first and last name.
    // The Card is styled with rounded corners and padding using modifiers.
    // The Text composable inside the Card displays the person's first and last name, centered and styled with a font size of 16sp.
    // The showToast function is used to display a toast message with the person's name when the Card is clicked.

    LazyColumn {
        items(personList, itemContent = { person: Person ->
            val context = LocalContext.current
            Card(shape = RoundedCornerShape(5.dp),
                modifier = Modifier
                    .fillParentMaxWidth()
                    .padding(10.dp)
                    .clickable {
                        showToast("${person.firstName} : ${person.lastName}", context)
                    }
            ) {
                Text(
                    text = "${person.firstName} : ${person.lastName}",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontStyle = FontStyle.Normal,
                        textAlign = TextAlign.Center
                    ),
                    modifier = Modifier.padding(10.dp)
                )
            }

        })
    }
}

fun showToast(message: String, context: Context) {
    Toast.makeText(context, message, Toast.LENGTH_LONG).show()
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewLazyColumnActivity(@PreviewParameter(PersonProviderForPreview::class) person: Person) {
    Text(text = ("${person.firstName} : ${person.lastName}"))
}

