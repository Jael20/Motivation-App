package com.Motivationapp.jaelapps

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.io.File

class MainActivity2adminpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity2adminpage)
        var button3 = findViewById<Button>(R.id.button3)
        var textView = findViewById<TextView>(R.id.textView)
        val context = this
        var db = Database(context)
        button3.setOnClickListener {
           var data = db.readData()
            textView.text = ""
            for (i in 0..(data.size -1)){
                textView.append(data.get(i).id.toString() + " " + data.get(i).name + data.get(i).email + "n")
            }
        }
    }
}