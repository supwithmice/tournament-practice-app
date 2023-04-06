package com.supwithmice.practiceapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.supwithmice.practiceapplication1.databinding.ActivitySignInAltBinding
import com.supwithmice.practiceapplication1.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.finishRegButton.setOnClickListener {
            Snackbar.make(binding.finishRegButton, "Not yet implemented (never will be)", Snackbar.LENGTH_SHORT).show()
        }

        binding.closeRegButton.setOnClickListener {
            startActivity(Intent(this, SignIn::class.java))
        }

    }
}