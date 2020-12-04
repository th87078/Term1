package com.ehxample.term1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageButton1.setOnClickListener {
            startActivity(Intent(this, Activity1::class.java))
        }
        imageButton2.setOnClickListener{
            startActivity(Intent(this, Activity21::class.java))
        }
        imageButton3.setOnClickListener {
            startActivity(Intent(this, Activity31::class.java))
        }
        imageButton4.setOnClickListener {
            startActivity(Intent(this, Activity41::class.java))
        }
        finalTestButton.setOnClickListener {
            startActivity(Intent(this, ActivityFinal1::class.java))
        }
    }
}