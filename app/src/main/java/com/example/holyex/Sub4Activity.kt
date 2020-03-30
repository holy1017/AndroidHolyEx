package com.example.holyex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Sub4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub4)

        Toast.makeText(applicationContext,"sub04Activity", Toast.LENGTH_LONG).show()
    }
}
