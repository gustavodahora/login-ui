package com.example.loginui

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.annotation.RequiresApi
import com.example.loginui.databinding.ActivityInitialScreenBinding
import com.example.loginui.databinding.ActivityMainBinding

class InitialScreen : AppCompatActivity() {
    private lateinit var binding: ActivityInitialScreenBinding

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInitialScreenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
}