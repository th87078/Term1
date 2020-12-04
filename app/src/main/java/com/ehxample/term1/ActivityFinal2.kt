package com.ehxample.term1

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_final_2.*

class ActivityFinal2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_2)

        activityFinal2IncorrectButton.setOnClickListener {
            activityFinal2IncorrectButton.setBackgroundColor(Color.RED)
            activityFinal2IncorrectButton.startAnimation(AnimationUtils.loadAnimation(this, R.anim.shake))

        }
        activityFinal2CorrectButton.setOnClickListener {
            startActivity(Intent(this, ActivityFinal3::class.java))
        }
    }

}