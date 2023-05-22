package com.example.mvvm.database

import com.example.mvvm.data.User

object CachingDatabase {
    fun database(): MutableList<User> {
        return mutableListOf(
            User("Abdulrahman", "12345"),
            User("Ali", "12345"),
            User("Ahmad", "12345"),
            User("7sry", "12345")
        )
    }
}