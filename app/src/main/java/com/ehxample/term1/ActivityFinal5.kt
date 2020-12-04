package com.ehxample.term1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_final_5.*

class ActivityFinal5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_5)

        activityFinal5Button.setOnClickListener {
            startActivity(Intent(this, ActivityFinal6::class.java))
        }
    }

}