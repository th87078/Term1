package com.ehxample.term1

import android.app.AppComponentFactory
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_4_7.*

class Activity47 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4_7)

        activity47Button.setOnClickListener {
            startActivity(Intent(this, Activity48::class.java))
        }
    }

}