package com.example.hindsprofile

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val emailButton: Button = findViewById(R.id.email_button)
        val phoneButton: Button = findViewById(R.id.phone_button)





        phoneButton.setOnClickListener {
            val intent = Intent().apply {
                action = Intent.ACTION_DIAL
                data = Uri.parse("tel:0552162110")
            }
            startActivity(intent)
        }

        emailButton.setOnClickListener {
            val intent = Intent().apply {
                action = Intent.ACTION_SENDTO
                data = Uri.parse("hindalzarah@gmail.com")
            }
            try {
                startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                Toast.makeText(this, "No Activity found", Toast.LENGTH_LONG).show()
            }
        }

    }
}