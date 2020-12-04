package com.ehxample.term1

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_3_2.*

class Activity32 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3_2)

        activity32CorrectButton.setOnClickListener {
            startActivity(Intent(this, Activity33::class.java))
        }
        activity32IncorrectButton.setOnClickListener {
            activity32IncorrectButton.setBackgroundColor(Color.RED)
            activity32IncorrectButton.startAnimation(AnimationUtils.loadAnimation(this, R.anim.shake))
        }
        activity32IncorrectButton2.setOnClickListener {
            activity32IncorrectButton2.setBackgroundColor(Color.RED)
            activity32IncorrectButton2.startAnimation(AnimationUtils.loadAnimation(this, R.anim.shake))
        }
    }
}