package com.ehxample.term1

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_3_4.*

class Activity34 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3_4)

        activity34CorrectButton.setOnClickListener {
            startActivity(Intent(this, Activity35::class.java))
        }
        activity34IncorrectButton.setOnClickListener {
            activity34IncorrectButton.setBackgroundColor(Color.RED)
            activity34IncorrectButton2.startAnimation(AnimationUtils.loadAnimation(this, R.anim.shake))
        }
    }
}