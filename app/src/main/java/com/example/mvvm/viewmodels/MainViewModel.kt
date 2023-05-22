package com.example.mvvm.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm.data.User
import com.example.mvvm.repository.RepoCachingDatabase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repoCachingDatabase: RepoCachingDatabase) :
    ViewModel() {

    // in order to make the ViewModel aware about the activity cycle we will implement LiveData
    private val usersMutableLiveData = MutableLiveData<List<User>>()
    val userLiveData: LiveData<List<User>> = usersMutableLiveData

    init {
        usersMutableLiveData.value = repoCachingDatabase.getAllUsers()
    }

}