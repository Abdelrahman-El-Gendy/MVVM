package com.example.mvvm.repository

import android.util.Log
import com.example.mvvm.data.User
import com.example.mvvm.validation.ValidateCaching

class RepoCachingDatabase {
    private val validateDatabase: ValidateCaching = ValidateCaching()

    fun insertUser(user: User) {
        validateDatabase.validateCaching().add(user)
    }

    fun removeUser() {
        validateDatabase.validateCaching().removeLast()
    }

    fun getAllUsers(): MutableList<User> {
        return validateDatabase.validateCaching()
    }

    fun printALlUsers() {
        Log.d("AllUsers", validateDatabase.validateCaching().toString())
    }

}