package com.example.jetpackcomposeandroidtutorial.layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.jetpackcomposeandroidtutorial.data.Person
import com.example.jetpackcomposeandroidtutorial.data.getPersonList

class LazyRowActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoadPersonRowData(personList = getPersonList())
        }
    }
}

@Composable
fun LoadPersonRowData(personList: List<Person>) {
    // The LazyRow composable is used to create a horizontally scrolling list of items efficiently.
    // It iterates over the list of Person objects and displays each item as a Card containing the person's name.
    // Each Card is clickable, and when clicked, it displays a toast message showing the person's first and last name.
    // The Card is styled with rounded corners and padding using modifiers.
    // The Text composable inside the Card displays the person's first and last name, centered and styled with a font size of 10sp.
    // The showToast function is used to display a toast message with the person's name when the Card is clicked.
    // Similar to horizontal RecyclerView
    LazyRow(modifier = Modifier.padding(0.dp, 50.dp, 0.dp,0.dp)) {
        items(personList, itemContent = { item: Person ->
            val context = LocalContext.current
            Card(shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillParentMaxWidth()
                    .padding(10.dp)
                    .clickable { showToast("${item.firstName} : ${item.lastName}", context) }
            ) {
                Text(
                    text = "${item.firstName} : ${item.lastName}",
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontStyle = FontStyle.Normal,
                        textAlign = TextAlign.Center
                    ),
                    modifier = Modifier.padding(10.dp)
                )

            }

        })
    }
}

