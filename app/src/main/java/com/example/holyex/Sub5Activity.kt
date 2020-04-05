package com.example.holyex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Sub5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub5)

        Toast.makeText(applicationContext,this.toString(), Toast.LENGTH_SHORT).show()
    }
}
