package com.example.assignment.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.assignment.R
import com.example.assignment.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.button.setOnClickListener {
            val intent= Intent(this,MovieActivity::class.java)
            startActivity(intent)
        }
    }
}