package com.ehxample.term1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_final_7.*

class ActivityFinal7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_7)

        activityFinal7Button.setOnClickListener {
            startActivity(Intent(this, ActivityFinal8::class.java))
        }
    }

}