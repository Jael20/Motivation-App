package com.Motivationapp.jaelapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity2welcome)
//Code to navigate the usre to the different pages as clicked by them
        val green = findViewById<Button>(R.id.green)
        green.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java);
            startActivity(intent)
        }
        val red = findViewById<Button>(R.id.red)
        red.setOnClickListener{
            val intent = Intent(this, MainActivity2userdetails::class.java);
            startActivity(intent)
        }
        val textView = findViewById<TextView>(R.id.textView)
        textView.setOnClickListener{
            val intent = Intent(this, MainActivity2loginadmin::class.java);
            startActivity(intent)
        }
    }
}