package com.example.mylistapp.database

data class CategoryModel(
    val userId: String,
    val categoryId: String,
    val categoryName: String,
    val categoryDescription: String,
    val totalTasks: Int,
    val totalCompletedTasks: Int,
    val totalDueTasks: Int
)