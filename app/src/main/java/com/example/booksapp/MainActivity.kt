package com.example.booksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.booksapp.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.loginBtn.setOnClickListener{
            startActivity(Intent(this,LoginActivity::class.java))
        }
        binding.skipButton.setOnClickListener {
            startActivity(Intent(this,DashborsUserActivity::class.java))
        }

    }
}