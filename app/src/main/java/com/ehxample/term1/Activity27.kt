package com.ehxample.term1

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_2_7.*

class Activity27 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2_7)

        activity27CorrectButton.setOnClickListener {
            startActivity(Intent(this, Activity28::class.java))
        }
        activity27IncorrectButton.setOnClickListener {
            activity27IncorrectButton.setBackgroundColor(Color.RED)
            activity27IncorrectButton2.startAnimation(AnimationUtils.loadAnimation(this, R.anim.shake))
        }
        activity27IncorrectButton2.setOnClickListener {
            activity27IncorrectButton2.setBackgroundColor(Color.RED)
            activity27IncorrectButton2.startAnimation(AnimationUtils.loadAnimation(this, R.anim.shake))
        }

    }

}