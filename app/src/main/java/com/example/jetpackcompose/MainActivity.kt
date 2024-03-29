package com.example.jetpackcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.material.withOpacity
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            textWithColor()
        }
    }
}

//composable function
@Composable
fun ComposableFunction(name: String) {
    Text(text = "$name!")
}

//text with style color
@Composable
fun textWithColor()
{
    Text("Text with color", style = TextStyle(color = Color.Red))

}

@Composable
fun addButton() {
    Container(width = 300.dp, height = 100.dp) {
        Button(
            text = "I'm a Compose Button"
        )

    }
}

@Composable
fun styleOnText()
{
    MaterialTheme() {
        val typography = +MaterialTheme.typography()
        Text(
            "Hello Text with style",
            style = typography.h6
                .withOpacity(0.87f)
        )
    }

}


@Preview
@Composable
fun Preview() {
    textWithColor()
}
