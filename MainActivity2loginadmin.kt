package com.Motivationapp.jaelapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import android.widget.EditText


class MainActivity2loginadmin : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity2loginadmin)

// Declaring the varible for button and login details
        val button2 = findViewById<Button>(R.id.button2)
        val editTextTextPersonName3 = findViewById<EditText>(R.id.editTextTextPersonName3)
        val editTextTextPersonName4 = findViewById<EditText>(R.id.editTextTextPersonName4)
        button2.setOnClickListener {
            if (editTextTextPersonName3.text.toString()
                    .equals("admin") && editTextTextPersonName4.text.toString().equals("6789")
            ) "Login Success"
            val intent = Intent(this, MainActivity2adminpage::class.java);
            startActivity(intent)
            if(editTextTextPersonName3.text.trim().isNotEmpty() || editTextTextPersonName4.text.trim().isNotEmpty()){
                Toast.makeText(this, "Input Provided",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"Input Required",Toast.LENGTH_LONG).show()
            }
        }



        }
    }