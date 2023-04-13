package com.supwithmice.practiceapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.supwithmice.practiceapplication1.databinding.ActivityEndScreenBinding

class EndScreen : AppCompatActivity() {
    lateinit var binding: ActivityEndScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEndScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            startActivity(Intent(this, SignIn::class.java))
            finish()
        }



    }
}