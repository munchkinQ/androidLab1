package com.example.labb1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.labb1.databinding.ActivityAboutBinding
import com.example.labb1.databinding.ActivityMainBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val currentEra = binding.currentEra //den tillämpar värderna o gör om dem till den formatteringen den vill ha istället för ID
        val switchEras = binding.switchEras

        switchEras.setOnClickListener {
            currentEra.text = switchEras.isChecked.toString()
        }

        val folklore = "Current Era: folklore"
        val reputation = "Current Era: Reputation"

        currentEra.text = reputation

        switchEras.setOnClickListener {
            if (switchEras.isChecked) {
                currentEra.text = folklore
            } else {
                currentEra.text = reputation
            }
        }

        val buttonToLogin: Button = findViewById(R.id.btn_to_login)

        buttonToLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }
}