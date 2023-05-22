package com.example.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvvm.data.User
import com.example.mvvm.databinding.ActivityMainBinding
import com.example.mvvm.repository.RepoCachingDatabase

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val repo: RepoCachingDatabase = RepoCachingDatabase()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        repo.insertUser(User("Mostafaa", "12345"))
        repo.printALlUsers()
        repo.removeUser()
        repo.printALlUsers()
    }
}