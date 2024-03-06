package com.example.labb1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.constraintlayout.widget.ConstraintSet.Layout
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

        val currentEra = binding.currentEra
        val switchEras = binding.switchEras

        switchEras.setOnClickListener {
            currentEra.text = switchEras.isChecked.toString()
        }

        val folklore = "Current Era: folklore"
        val reputation = "Current Era: Reputation"

        currentEra.text = reputation

        val background = findViewById<View>(R.id.about)
        val header = findViewById<TextView>(R.id.about_header)
        val text = findViewById<TextView>(R.id.about_text)


        //this could obvs be done with the themes, but oh well
        switchEras.setOnClickListener {
            if (switchEras.isChecked) {
                currentEra.text = folklore
                switchEras.setTextColor(resources.getColor(R.color.black))
                currentEra.setTextColor(resources.getColor(R.color.black))
                background.setBackgroundColor(resources.getColor(R.color.white))
                header.setTextColor(resources.getColor(R.color.black))
                text.setTextColor(resources.getColor(R.color.black))
            } else {
                currentEra.text = reputation
                currentEra.setTextColor(resources.getColor(R.color.reputationText))
                switchEras.setTextColor(resources.getColor(R.color.reputationText))
                background.setBackgroundColor(resources.getColor(R.color.reputationColor))
                header.setTextColor(resources.getColor(R.color.reputationText))
                text.setTextColor(resources.getColor(R.color.reputationText))
            }
        }

        val buttonToLogin: Button = findViewById(R.id.btn_to_login)

        buttonToLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }
}