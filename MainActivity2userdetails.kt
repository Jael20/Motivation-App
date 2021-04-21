package com.Motivationapp.jaelapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity2userdetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity2userdetails)
// Variables for button and array for the username and email
        var button = findViewById<Button>(R.id.button)
        var editTextTextPersonName = findViewById<EditText>(R.id.editTextTextPersonName)
        var editTextTextPersonName2 = findViewById<EditText>(R.id.editTextTextPersonName2)
        var listView = findViewById<ListView>(R.id.listview)
        var list: ArrayList<String> = ArrayList()
        var arrayAdapter: ArrayAdapter<String>
        arrayAdapter = ArrayAdapter(this, android.R.layout.activity_list_item, list)
// The following action is taken when the button is clicked
        button.setOnClickListener{
            if(editTextTextPersonName.text.trim().isNotEmpty()|| editTextTextPersonName2.text.trim().isNotEmpty()){
                Toast.makeText(this, "Input Provided", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, "Input Required", Toast.LENGTH_LONG).show()
            }
           list.add(editTextTextPersonName.text.toString())
            editTextTextPersonName.setText("")
            list.add(editTextTextPersonName2.text.toString())
            editTextTextPersonName2.setText("")
            arrayAdapter.notifyDataSetChanged()
            listView.adapter = arrayAdapter
        }
    }
}