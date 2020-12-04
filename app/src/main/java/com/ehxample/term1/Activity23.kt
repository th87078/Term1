package com.ehxample.term1

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_2_3.*

class Activity23 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2_3)

        activity23CorrectButton.setOnClickListener {
            startActivity(Intent(this, Activity24::class.java))
        }
        activity23IncorrectButton.setOnClickListener {
            activity23IncorrectButton.setBackgroundColor(Color.RED)
            activity23IncorrectButton.startAnimation(AnimationUtils.loadAnimation(this, R.anim.shake))
        }

    }
}