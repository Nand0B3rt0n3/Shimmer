package com.example.shimmer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.btnGoDetail)
        button.setOnClickListener {
             val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }
    }
}