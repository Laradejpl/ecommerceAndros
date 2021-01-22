package com.example.myannonces.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

import android.view.WindowManager
import com.example.myannonces.R


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

    // mettre en plein ecran
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);

       @Suppress("DEPRECATION")
        Handler().postDelayed(

                {

                    //lance le mainActivity
                    startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                    finish()

                },2500
        )

    }
}