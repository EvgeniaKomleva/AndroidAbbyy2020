package com.example.abbyyandroidtasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent
import android.view.View
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun startSecondActivity(v: View?) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}