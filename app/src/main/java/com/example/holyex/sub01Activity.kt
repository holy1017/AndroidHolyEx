package com.example.holyex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class sub01Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub01)

        Toast.makeText(getApplicationContext(),"sub01Activity", Toast.LENGTH_LONG)
    }
}
