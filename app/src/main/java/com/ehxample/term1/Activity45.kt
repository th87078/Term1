package com.ehxample.term1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_4_5.*

class Activity45 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4_5)

        activity45Button.setOnClickListener {
            startActivity(Intent(this, Activity46::class.java))
        }
    }

}