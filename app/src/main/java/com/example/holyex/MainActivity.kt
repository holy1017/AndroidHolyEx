package com.example.holyex

//import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

import java.util.ArrayList;
import java.util.List;

class MainActivity : AppCompatActivity() , View.OnClickListener {

    //


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //R.id.textView.set
        //val t = findViewById<TextView>(R.id.textView)
        //t.text = "글자여 바뀌어라!"
        //findViewById<TextView>(R.id.text01).text = "글자여 바뀌어라!"
        text01.text = "글자여 바뀌어라!"

        initListener()

    }



    private fun initListener() {
        // 리스너 설정
        //findViewById<Button>(R.id.btEx01).setOnClickListener(this)
        //findViewById<Button>(R.id.btEx02).setOnClickListener(this)
        btEx01.setOnClickListener(this)
        btEx02.setOnClickListener(this)
        btEx03.setOnClickListener(this)
        btEx04.setOnClickListener(this)
        btEx05.setOnClickListener(this)
        btEx06.setOnClickListener(this)

    }

    // 리스너 구현
    override fun onClick(v: View?) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        if (v != null) {

            // 타입
            if (v is  Button){
                //val b: Button = v as Button
                //val buttonText: String = v.getText().toString()
                // 토스트 메세지
                //Toast.makeText(applicationContext, v.text.toString(), Toast.LENGTH_SHORT).show()
            }

            // id
            when (v.id) {
                R.id.btEx01 -> {
                    //Toast.makeText(applicationContext,"btEx01 run" ,Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this,Sub1Activity::class.java))
                }
                R.id.btEx02 -> {
                    //Toast.makeText(applicationContext,"btEx02 run" ,Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this,Sub2Activity::class.java))
                }
                R.id.btEx03 -> {
                    //Toast.makeText(applicationContext,"btEx03 run" ,Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this,Sub3Activity::class.java))
                }
                R.id.btEx04 -> {
                    //Toast.makeText(applicationContext,"btEx04 run" ,Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this,Sub4Activity::class.java))
                }
                R.id.btEx05 -> {
                    //Toast.makeText(applicationContext,"btEx05 run" ,Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this,Sub5Activity::class.java))
                }
                R.id.btEx06 -> {
                    //Toast.makeText(applicationContext,"btEx06 run" ,Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this,Sub6Activity::class.java))
                }
            }
        }
    }
}
