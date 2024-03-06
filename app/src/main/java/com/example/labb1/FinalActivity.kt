package com.example.labb1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FinalActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val showUsername = intent.getStringExtra("toast")

        val text = ""
        val duration = Toast.LENGTH_LONG
        val toast = Toast.makeText(applicationContext, showUsername, duration)
        toast.show()

        val buttonToMain: Button = findViewById(R.id.btn_to_main)

        buttonToMain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}