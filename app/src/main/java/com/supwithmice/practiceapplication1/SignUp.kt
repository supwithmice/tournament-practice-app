package com.supwithmice.practiceapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import com.supwithmice.practiceapplication1.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.finishRegButton.setOnClickListener {
            if (with(binding) {
                editTextRegEmail.text.toString().isNotEmpty() &&
                editTextRegFirstName.text.toString().isNotEmpty() &&
                editTextRegPassword.text.toString().isNotEmpty() &&
                editTextRegSecondName.text.toString().isNotEmpty() &&
                editTextRegPasswordRepeat.text.toString().isNotEmpty()
                }) {
                Snackbar.make(binding.finishRegButton, "Registered!", Snackbar.LENGTH_SHORT).show()
                startActivity(Intent(this, SignIn::class.java))
                finish()
            } else {
                AlertDialog.Builder(this)
                    .setTitle(R.string.enter_details)
                    .setPositiveButton("OK", null)
                    .create()
                    .show()
            }
        }

        binding.closeRegButton.setOnClickListener {
            startActivity(Intent(this, SignIn::class.java))
            finish()
        }

    }
}