package com.ehxample.term1

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_final_6.*

class ActivityFinal6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_6)

        activityFinal6IncorrectButton.setOnClickListener {
            activityFinal6IncorrectButton.setBackgroundColor(Color.RED)
            activityFinal6IncorrectButton.startAnimation(AnimationUtils.loadAnimation(this, R.anim.shake))
        }
        activityFinal6CorrectButton.setOnClickListener {
            startActivity(Intent(this, ActivityFinal7::class.java))
        }
    }

}