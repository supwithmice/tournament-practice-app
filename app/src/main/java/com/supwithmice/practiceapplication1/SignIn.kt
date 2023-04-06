package com.supwithmice.practiceapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.supwithmice.practiceapplication1.databinding.ActivityMainBinding
import com.supwithmice.practiceapplication1.databinding.ActivitySignInBinding

class SignIn : AppCompatActivity() {
    lateinit var binding: ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            Snackbar.make(binding.loginButton, "Not yet implemented (never will be)", Snackbar.LENGTH_SHORT).show()
        }

        binding.startRegButton.setOnClickListener {
            startActivity(Intent(this, SignUp::class.java))
        }
    }
}