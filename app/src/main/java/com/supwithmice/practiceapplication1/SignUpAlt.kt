package com.supwithmice.practiceapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.supwithmice.practiceapplication1.databinding.ActivitySignUpAltBinding
import com.supwithmice.practiceapplication1.databinding.ActivitySignUpBinding

class SignUpAlt : AppCompatActivity() {
    lateinit var binding: ActivitySignUpAltBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpAltBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.finishRegButton.setOnClickListener {
            Snackbar.make(binding.finishRegButton, "Not yet implemented (never will be)", Snackbar.LENGTH_SHORT).show()
        }

        binding.closeRegButton.setOnClickListener {
            startActivity(Intent(this, SignInAlt::class.java))
        }

    }
}