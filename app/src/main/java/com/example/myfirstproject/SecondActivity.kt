package com.example.myfirstproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnCall = findViewById<Button>(R.id.btnCall)
        val cvWeb = findViewById<CardView>(R.id.cvWeb)
        val cvIos = findViewById<CardView>(R.id.cvIos)
        val cvMachine = findViewById<CardView>(R.id.cvMachine)
        val cvCross = findViewById<CardView>(R.id.cvCross)
        val cvBlock = findViewById<CardView>(R.id.cvBlock)
        val cvAndroid = findViewById<CardView>(R.id.cvAnd)

        btnCall.setOnClickListener {
            val phone = "1111111111111111111"
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",phone,null))
            startActivity(intent)
        }

        cvAndroid.setOnClickListener {
            val intent = Intent(this,AndroidActivity::class.java)
            startActivity(intent)
        }
        cvWeb.setOnClickListener {
            val intent = Intent(this,WebActivity::class.java)
            startActivity(intent)
        }
        cvMachine.setOnClickListener {
            val intent = Intent(this,MachineActivity::class.java)
            startActivity(intent)
        }
        cvIos.setOnClickListener {
            val intent = Intent(this,AndroidActivity::class.java)
            startActivity(intent)
        }
        cvBlock.setOnClickListener {
            val intent = Intent(this,AndroidActivity::class.java)
            startActivity(intent)
        }
        cvCross.setOnClickListener {
            val intent = Intent(this,AndroidActivity::class.java)
            startActivity(intent)
        }
    }
}