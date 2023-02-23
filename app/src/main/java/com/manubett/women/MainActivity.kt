package com.manubett.women

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.manubett.women.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //declare the binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        //removing the action bar
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}