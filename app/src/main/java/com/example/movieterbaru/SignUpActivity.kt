package com.example.movieterbaru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.movieterbaru.R

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val button : Button = findViewById(R.id.button)
        val textview : TextView = findViewById(R.id.textView3)

        button.setOnClickListener(View.OnClickListener {
            back()
        })

        textview.setOnClickListener(View.OnClickListener {
            back()
        })
    }

    override fun onBackPressed() {
        super.onBackPressed()
        back()
    }

    private fun back(){
        finish()
        overridePendingTransition(R.anim.no_animation, R.anim.slide_out)
    }
}