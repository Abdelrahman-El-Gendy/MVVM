package com.example.mvvm.validation

import com.example.mvvm.data.User
import com.example.mvvm.database.CachingDatabase


class ValidateCaching {


    private val database = CachingDatabase.database()
    fun validateCaching(): MutableList<User> {
        // return if (database.isNotEmpty()) database
        //        else throw IllegalArgumentException("There is no Data!")
        return database.ifEmpty { throw IllegalArgumentException("There is no Data!") }

    }
}