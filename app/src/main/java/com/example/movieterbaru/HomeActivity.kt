package com.example.movieterbaru

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val iv_action : ImageView = findViewById(R.id.iv_action)
        val iv_animasi : ImageView = findViewById(R.id.iv_animasi)

        iv_action.setOnClickListener {
            startActivity(Intent(this, ListMovieActionActivity::class.java))
        }

        iv_animasi.setOnClickListener {
            startActivity(Intent(this, ListMovieAnimasiActivity::class.java))
        }


    }

    override fun onBackPressed() {
        super.onBackPressed()
        moveTaskToBack(true)
    }

}