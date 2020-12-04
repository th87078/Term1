package com.ehxample.term1

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_final_4.*

class ActivityFinal4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_4)

        activityFinal4CorrectButton.setOnClickListener {
            startActivity(Intent(this, ActivityFinal5::class.java))
        }
        activityFinal4IncorrectButton.setOnClickListener {
            activityFinal4IncorrectButton.setBackgroundColor(Color.RED)
            activityFinal4IncorrectButton.startAnimation(AnimationUtils.loadAnimation(this, R.anim.shake))
        }
    }

}