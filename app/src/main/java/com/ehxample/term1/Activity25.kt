package com.ehxample.term1

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_2_5.*

class Activity25 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2_5)

        activity25CorrectButton.setOnClickListener {
            startActivity(Intent(this, Activity26::class.java))
        }
        activity25IncorrectButton.setOnClickListener {
            activity25IncorrectButton.setBackgroundColor(Color.RED)
            activity25IncorrectButton.startAnimation(AnimationUtils.loadAnimation(this, R.anim.shake))
        }

    }
}