package com.ehxample.term1

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_4_2.*

class Activity42 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4_2)

        activity42CorrectButton.setOnClickListener {
            startActivity(Intent(this, Activity43::class.java))
        }
        activity42IncorrectButton.setOnClickListener {
            activity42IncorrectButton.setBackgroundColor(Color.RED)
            activity42IncorrectButton.startAnimation(AnimationUtils.loadAnimation(this, R.anim.shake))
        }
    }
}