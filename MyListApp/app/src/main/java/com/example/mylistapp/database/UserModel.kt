package com.example.mylistapp.database

data class UserModel(
    val userId: String,
    val firstName: String,
    val lastName: String,
    val phoneNo: String,
    val star_categories: List<String>
)