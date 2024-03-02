package com.example.movieterbaru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.movieterbaru.HomeActivity
import com.example.movieterbaru.R

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val button : Button = findViewById(R.id.button)
        val textview : TextView = findViewById(R.id.textView3)

        button.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            overridePendingTransition(R.anim.slide_in, R.anim.slide_in_out)
        })

        textview.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
            overridePendingTransition(R.anim.slide_in, R.anim.slide_in_out)
        })
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

}