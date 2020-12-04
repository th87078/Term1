package com.ehxample.term1

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_4_8.*

class Activity48 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4_8)

        activity48CorrectButton.setOnClickListener {
            startActivity(Intent(this, Activity49::class.java))
        }
        activity48IncorrectButton.setOnClickListener {
            activity48IncorrectButton.setBackgroundColor(Color.RED)
            activity48IncorrectButton.startAnimation(AnimationUtils.loadAnimation(this, R.anim.shake))
        }
    }
}