package com.ehxample.term1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_final_10.*

class ActivityFinal10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_10)

        activityFinal10Button.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}