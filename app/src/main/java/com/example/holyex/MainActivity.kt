package com.example.holyex

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() , View.OnClickListener {

    //


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //R.id.textView.set
        //val t = findViewById<TextView>(R.id.textView)
        //t.text = "글자여 바뀌어라!"
        findViewById<TextView>(R.id.textView).text = "글자여 바뀌어라!"

        // 리스너 설정
        findViewById<Button>(R.id.btEx01).setOnClickListener(this)
        findViewById<Button>(R.id.btEx02).setOnClickListener(this)
    }

    val    i01=Intent(this,sub01Activity::class.java)

    // 리스너 구현
    override fun onClick(v: View?) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        if (v != null) {

            // 타입
            if (v is  Button){
                //val b: Button = v as Button
                //val buttonText: String = v.getText().toString()
                // 토스트 메세지
                Toast.makeText(getApplicationContext(), v.getText().toString(), Toast.LENGTH_LONG).show()
            }

            // id
            when (v.id) {
                R.id.btEx01 -> {
                    Toast.makeText(getApplicationContext(),"btEx01 run" ,Toast.LENGTH_LONG).show()
                    startActivity(i01)
                }
            }
        }
    }
}
