package com.supwithmice.practiceapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.supwithmice.practiceapplication1.databinding.ActivitySignInAltBinding
import com.supwithmice.practiceapplication1.databinding.ActivitySignInBinding

class SignInAlt : AppCompatActivity() {
    lateinit var binding: ActivitySignInAltBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInAltBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            Snackbar.make(binding.loginButton, "Not yet implemented (never will be)", Snackbar.LENGTH_SHORT).show()
        }

        binding.startRegButton.setOnClickListener {
            startActivity(Intent(this, SignUpAlt::class.java))
        }
    }
}