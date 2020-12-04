package com.ehxample.term1

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_final_8.*

class ActivityFinal8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_8)

        activityFinal8CorrectButton.setOnClickListener {
            startActivity(Intent(this, ActivityFinal9::class.java))
        }
        activityFinal8IncorrectButton.setOnClickListener {
            activityFinal8IncorrectButton.setBackgroundColor(Color.RED)
            activityFinal8IncorrectButton.startAnimation(AnimationUtils.loadAnimation(this, R.anim.shake))
        }
    }
}