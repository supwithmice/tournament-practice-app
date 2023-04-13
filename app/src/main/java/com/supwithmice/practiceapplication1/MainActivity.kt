package com.supwithmice.practiceapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.supwithmice.practiceapplication1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.var1Button.setOnClickListener {
//            startActivity(Intent(this, SignIn::class.java))
//        finish()
//        }
//
//        binding.var2Button.setOnClickListener {
//            startActivity(Intent(this, SignInAlt::class.java))
//        finish()
//        }

        object: CountDownTimer(2000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
            }
            override fun onFinish() {
                startActivity(Intent(this@MainActivity, SignIn::class.java))
                finish()
            }
        }.start()
    }
}