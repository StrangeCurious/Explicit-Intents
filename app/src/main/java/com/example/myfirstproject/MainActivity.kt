package com.example.myfirstproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLetsGo = findViewById<Button>(R.id.btnLetsGo)
        btnLetsGo.setOnClickListener {

            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}