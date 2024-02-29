package com.example.labb1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.labb1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var name: String
    //binding reference, ensure that this is set to true in gradle scripts

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialize binding/assign value to binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       //define components
        //val btnTest: Button = findViewById(R.id.textView)
        //val btnTest2 = binding.textView

        val buttonToAbout: Button = findViewById(R.id.btn_to_about)

        buttonToAbout.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
    }
}