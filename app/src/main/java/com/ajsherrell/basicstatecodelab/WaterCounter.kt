package com.ajsherrell.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    // Water counter counts the number of glasses of water you consume during the day.
    Column(modifier = modifier.padding(16.dp)) {
        var count by remember { mutableStateOf(0) }
        Text(
            text = "You've had $count glasses.",
            modifier = modifier.padding(16.dp)
        )
        Button(onClick = { count++ }, Modifier.padding(8.dp)) {
            Text(text = "Add one")
        }
    }
}