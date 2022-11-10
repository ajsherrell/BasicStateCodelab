package com.ajsherrell.basicstatecodelab

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

class WellnessViewModel: ViewModel() {

    private val _tasks = getWellnessTasks().toMutableStateList()
    val tasks: List<WellnessTask>
        get() = _tasks

    fun remove(item: WellnessTask) {
        _tasks.remove(item)
    }

    fun changeTaskChecked(item: WellnessTask, checked: Boolean) =
        tasks.find { it.id == item.id }?.let { task ->
            task.checked = checked
        }

}

// Note that in a real app, you get your data from your data layer.
private fun getWellnessTasks() = List(30) { i ->
    WellnessTask(i, "Task # $i")
}