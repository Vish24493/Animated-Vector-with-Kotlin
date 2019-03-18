package com.example.vishnudalbhatwala.animatedvector

import android.graphics.drawable.Animatable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var animatable: Animatable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animatable = ivImage.drawable as Animatable

        btnPress.setOnClickListener {
            animatable.start()
        }
    }
}
