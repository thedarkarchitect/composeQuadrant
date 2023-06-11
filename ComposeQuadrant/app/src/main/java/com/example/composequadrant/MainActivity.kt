package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantApp()
                }
            }
        }
    }
}

@Composable
fun QuadrantApp(modifier: Modifier = Modifier) {
    Column (
        modifier = modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .weight(1f)
        ) {
            Quadrant(title = "Text composable", description = "Display text and follows the recommended Material Design guidelines.", color = 0xFFEADDFF, modifier = Modifier.weight(1f))
            Quadrant(title = "Image" , description = "Create a composable that lays out an draws a given Painter class object.", color = 0xFFD0BCFF, modifier = Modifier.weight(1f) )
        }
        Row(
            modifier = Modifier
                .weight(1f)
        ) {
            Quadrant(title = "Row composable", description = "A layout composable that places its children in a horizontal sequence." , color = 0xFFB69DF8, modifier = Modifier.weight(1f))
            Quadrant(title = "Column composable", description = "A layout composable that places its children in a vertical sequence.", color = 0xFFF6EDFF, modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun Quadrant(title: String, description: String, color: Long, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(color))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Text(
            title,
            fontWeight = FontWeight.Bold
        )
        Text(
            description,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(bottom = 8.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        QuadrantApp()
    }
}