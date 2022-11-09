package com.ajsherrell.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    // Function that represents the whole screen.
    Column(modifier = modifier) {
        StatefulCounter()
        WellnessTasksList()
    }
}