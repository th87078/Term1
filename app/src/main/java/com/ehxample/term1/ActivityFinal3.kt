package com.ehxample.term1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_final_3.*

class ActivityFinal3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_3)

        activityFinal3Button.setOnClickListener {
            startActivity(Intent(this, ActivityFinal4::class.java))
        }
    }
}