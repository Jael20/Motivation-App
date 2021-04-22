package com.Motivationapp.jaelapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ImageSwitcher
import android.widget.ImageView

class MainActivity : AppCompatActivity()  {
    // Declaring the variable to handle the picture object
   private val images = intArrayOf( R.drawable.j001, R.drawable.j002, R.drawable.j003, R.drawable.j004, R.drawable.j005, R.drawable.j006, R.drawable.j007,R.drawable.j008,R.drawable.j009,
        R.drawable.j010,R.drawable.j011,R.drawable.j012,R.drawable.j013,R.drawable.j014,R.drawable.j015,R.drawable.j016,R.drawable.j017,R.drawable.j018,R.drawable.j019,R.drawable.j020,
        R.drawable.j021,R.drawable.j022,R.drawable.j023,R.drawable.j024,R.drawable.j025,R.drawable.j026,R.drawable.j027,R.drawable.j028,R.drawable.j029,R.drawable.j030)
    private var cmess = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        // access the ImageSwitcher
        var xx = findViewById<ImageSwitcher>(R.id.switchm)
        xx?.setFactory({
            val imgView = ImageView(applicationContext)
            imgView.scaleType = ImageView.ScaleType.FIT_CENTER
            imgView.setPadding(8, 8, 8, 8)
            imgView
        })
        //setting the method to pass array as a parameter
        xx?.setImageResource(images[cmess])

        val imgIn = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left)
        xx?.inAnimation = imgIn

        val imgOut = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right)
        xx?.outAnimation = imgOut

        // PREVIOUS MESSAGE BUTTON FUNCTIONALITY
        val prevb2n = findViewById<Button>(R.id.messb2n)
        prevb2n.setOnClickListener{
            cmess = if (cmess - 1 >= 0) cmess - 1 else 2
            xx?.setImageResource(images[cmess])
        }
        // NEXT MESSAGE BUTTON FUNCTIONALITY
        val nextb2n = findViewById<Button>(R.id.messb2n2)
        nextb2n.setOnClickListener{
            cmess = if (cmess + 1 < images.size) cmess +1 else 0
            xx.setImageResource(images[cmess])
        }

        }

    }
