package com.example.mylistapp.database

data class TaskModel(
    val userId: String,
    val categoryId: String,
    val taskId: String,
    val taskTitle: String,
    val taskDescription: String,
    val taskDueDateTime: String,
    val taskCurrentStatus: String
)