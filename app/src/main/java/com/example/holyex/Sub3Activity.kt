package com.example.holyex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sub3.*

class Sub3Activity : AppCompatActivity() , View.OnTouchListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub3)

        Toast.makeText(applicationContext,"sub03Activity", Toast.LENGTH_SHORT).show()
        button.setOnTouchListener(this)
        button2.setOnTouchListener(this)
    }

    override fun onTouch(v: View?, event: MotionEvent?): Boolean {

        when (v?.id) {
            R.id.button -> {
                Toast.makeText(applicationContext,"setColumnStretchable true", Toast.LENGTH_SHORT).show()
                table.setColumnStretchable(0,true)
                //table.isStretchAllColumns = false
            }
            R.id.button2 -> {
                Toast.makeText(applicationContext,"setColumnStretchable false", Toast.LENGTH_SHORT).show()
                table.setColumnStretchable(0,false)
                //table.isStretchAllColumns = true
            }
        }
        return true
    }
}
