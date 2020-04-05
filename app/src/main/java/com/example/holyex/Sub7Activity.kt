package com.example.holyex

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Sub7Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_sub7p)

        if (resources.configuration.orientation ==
                Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.activity_sub7p);
            Toast.makeText(applicationContext, "activity_sub7p", Toast.LENGTH_SHORT).show()
        } else {
            setContentView(R.layout.activity_sub7l);
            Toast.makeText(applicationContext, "activity_sub7l", Toast.LENGTH_SHORT).show()
        }
    }
}
