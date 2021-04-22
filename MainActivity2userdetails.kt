package com.Motivationapp.jaelapps

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.io.FileOutputStream
import java.io.OutputStreamWriter

class MainActivity2userdetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity2userdetails)
        // Variables for button and array for the username and email
        var button = findViewById<Button>(R.id.button)
        var editTextTextPersonName = findViewById<EditText>(R.id.editTextTextPersonName)
        var editTextTextPersonName2 = findViewById<EditText>(R.id.editTextTextPersonName2)
        val context = this

/* The following action is taken when the button is clicked */
        button.setOnClickListener {
            if (editTextTextPersonName.text.toString().length > 0 &&
                    editTextTextPersonName2.text.toString().length > 0) {
                var user = Userdetails(editTextTextPersonName.text.toString(), editTextTextPersonName2.text.toString())
                var db = Database(context)
                db.insertData(user)
            } else {
                Toast.makeText(context, "Please Fill All Fields", Toast.LENGTH_SHORT).show()
            }
        }
        }
    }


