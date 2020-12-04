package com.ehxample.term1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_1_2.*

class Activity12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1_2)

        activity12Button.setOnClickListener {
            startActivity(Intent(this, Activity13::class.java))
        }
    }
}