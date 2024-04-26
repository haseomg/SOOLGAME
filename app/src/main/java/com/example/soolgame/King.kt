package com.example.soolgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class King : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_king)

        val backBtn: Button = findViewById(R.id.kingBackBtn)
        backBtn.setOnClickListener(View.OnClickListener {
            finish()
        })
    }
}