package com.ehxample.term1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_3_5.*

class Activity35 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3_5)

        activity35Button.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}