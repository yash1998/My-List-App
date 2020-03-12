package com.example.mylistapp.model

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class FirebaseDataSource {

    var database: FirebaseDatabase? = null
    var databaseReference: DatabaseReference? = null

    init {
        database = Firebase.database
        databaseReference = database?.reference
    }

    fun getTasks() {

    }

    fun getLists() {

    }

    fun getCategories() {

    }

    fun addTask(taskTitle: String, taskDueDate: String, taskNotes: String) {

    }

    fun addList(listTitle: String) {

    }

    fun renameCategory(oldTitle: String, newTitle: String) {

    }

    fun deleteList() {

    }

    fun deleteTask() {

    }

}