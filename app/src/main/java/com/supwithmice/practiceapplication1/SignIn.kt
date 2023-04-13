package com.supwithmice.practiceapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import com.supwithmice.practiceapplication1.databinding.ActivitySignInBinding
import java.util.regex.Pattern

class SignIn : AppCompatActivity() {
    lateinit var binding: ActivitySignInBinding
    val pattern = ("[a-z,0-9,.]{1,100}" + "@" + "[a-z]{1,100}" + "." + "[a-z]{1,6}")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {

            if (binding.editTextLoginEmail.text.toString().isNotEmpty() &&
                binding.editTextLoginPassword.text.toString().isNotEmpty()
            ) {
                if (binding.editTextLoginEmail.text.toString().isEmailValid()){
                    startActivity(Intent(this, EndScreen::class.java))
                    finish()
                } else Snackbar.make(binding.loginButton, R.string.wrong_email, Snackbar.LENGTH_SHORT).show()
            } else {
                AlertDialog.Builder(this)
                    .setTitle(R.string.enter_email_and_password)
                    .setPositiveButton("OK", null)
                    .create()
                    .show()
//                Snackbar.make(binding.loginButton, R.string.enter_email_and_password, Snackbar.LENGTH_SHORT).show()
            }

        }

        binding.startRegButton.setOnClickListener {
            startActivity(Intent(this, SignUp::class.java))
            finish()
        }

    }
    fun String.isEmailValid(): Boolean {
        return Pattern.compile(pattern).matcher(this).matches()
    }
}