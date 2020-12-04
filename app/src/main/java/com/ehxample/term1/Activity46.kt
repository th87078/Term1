package com.ehxample.term1

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_4_6.*

class Activity46 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4_6)

        activity46CorrectButton.setOnClickListener {
            startActivity(Intent(this, Activity47::class.java))
        }
        activity46IncorrectButton.setOnClickListener {
            activity46IncorrectButton.setBackgroundColor(Color.RED)
            activity46IncorrectButton.startAnimation(AnimationUtils.loadAnimation(this, R.anim.shake))
        }
        activity46IncorrectButton2.setOnClickListener {
            activity46IncorrectButton2.setBackgroundColor(Color.RED)
            activity46IncorrectButton2.startAnimation(AnimationUtils.loadAnimation(this, R.anim.shake))
        }
    }

}