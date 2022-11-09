package com.ajsherrell.basicstatecodelab

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.runtime.remember

private fun getWellnessTasks() = List(30) { i ->
    WellnessTask(i, "Task # $i")
}
// Note that in a real app, you get your data from your data layer.

@Composable
fun WellnessTasksList(
    modifier: Modifier = Modifier,
    list: List<WellnessTask> = remember {
        getWellnessTasks()
    }
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(list) { task ->
            WellnessTaskItem(taskName = task.label)
        }
    }
}