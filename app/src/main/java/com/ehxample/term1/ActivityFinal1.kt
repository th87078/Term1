package com.ehxample.term1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_final_1.*

class ActivityFinal1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_1)

        activityFinal1Button.setOnClickListener {
            startActivity(Intent(this, ActivityFinal2::class.java))
        }
    }
}