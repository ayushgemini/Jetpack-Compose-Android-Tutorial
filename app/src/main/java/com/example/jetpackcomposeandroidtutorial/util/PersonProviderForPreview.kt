package com.example.jetpackcomposeandroidtutorial.util

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.example.jetpackcomposeandroidtutorial.data.Person

class PersonProviderForPreview : PreviewParameterProvider<Person> {
    override val values = sequenceOf(
        Person("Ayush", "Gemini"),
        Person("Aman", "Jain"),
        Person("Saurabh", "Bhardwaj"),
        Person("Riya", "Singh"),
        Person("Rahul", "Sharma"),
        Person("Sneha", "Verma"),
        Person("Vikram", "Yadav"),
        Person("Divya", "Gupta"),
        Person("Rohan", "Malhotra"),
        Person("Kritika", "Chopra"),
        Person("Aditya", "Kumar"),
        Person("Ananya", "Shah"),
        Person("Varun", "Patel"),
        Person("Priya", "Goyal"),
        Person("Rajesh", "Singhania"),
        Person("Neha", "Agarwal"),
        Person("Ankit", "Rastogi"),
        Person("Pooja", "Mishra"),
        Person("Siddharth", "Dutta"),
        Person("Anjali", "Sharma"),
        Person("Rohit", "Saxena"),
        Person("Harshita", "Gupta"),
        Person("Shivam", "Sharma"),
        Person("Kavita", "Rathore"),
        Person("Ravi", "Sharma"),
        Person("Anushka", "Jha"),
        Person("Amit", "Chauhan"),
        Person("Nidhi", "Verma"),
        Person("Vishal", "Sinha"),
        Person("Khushi", "Choudhary"),
        Person("Arjun", "Yadav"),
        Person("Swati", "Mishra"),
        Person("Gaurav", "Shukla"),
        Person("Preeti", "Srivastava"),
        Person("Deepak", "Chopra"),
        Person("Akanksha", "Singh"),
        Person("Manish", "Yadav"),
        Person("Juhi", "Gupta"),
        Person("Rakesh", "Saxena"),
        Person("Komal", "Sharma"),
        Person("Vivek", "Kumar"),
        Person("Riya", "Sinha"),
        Person("Abhishek", "Mishra"),
        Person("Muskan", "Sharma"),
        Person("Rishi", "Gupta"),
        Person("Pankaj", "Choudhary"),
        Person("Simran", "Verma"),
        Person("Arun", "Kumar"),
        Person("Nisha", "Singh")
    )
    override val count: Int = values.count()
}