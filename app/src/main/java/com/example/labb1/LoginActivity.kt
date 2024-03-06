package com.example.labb1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val albumLoginCredentials = arrayOf(
            "Debut", "Fearless", "Speak Now",
            "Red", "1989", "Reputation", "Lover",
            "folklore", "evermore", "Midnights"
        )

        var isUser = false
        val userPassword = "12345"
        val buttonToFinal: Button = findViewById(R.id.btn_to_final)
        val loginCredentials: EditText = findViewById(R.id.album_login_credentials)
        val passwordInput: EditText = findViewById(R.id.password_input)


        buttonToFinal.setOnClickListener {
            val userLoginCredentials: String = loginCredentials.text.toString()
            val inputPassword: String = passwordInput.text.toString()
            if (userLoginCredentials in albumLoginCredentials && inputPassword == userPassword) {
                //println(userLoginCredentials)
                isUser = true
                val intent = Intent(this, FinalActivity::class.java).apply {
                    putExtra("toast", userLoginCredentials.toString())
                }
                if (isUser) {
                    startActivity(intent)
                }
            }
        }
    }
}