package com.example.holyex

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import kotlinx.android.synthetic.main.activity_sub2.*


class Sub3Activity : AppCompatActivity(), View.OnTouchListener  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub2)

        Toast.makeText(applicationContext,"sub03Activity", Toast.LENGTH_LONG).show()

        //터치 리스너
        btCenter02.setOnTouchListener(this)
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouch(v: View?, e: MotionEvent?): Boolean {

        if (v != null || e != null) {

            // id
            when (v?.id) {
                R.id.btCenter02 -> {
                    //Toast.makeText(applicationContext,"btCenter run" ,Toast.LENGTH_LONG).show()

                    when(e?.action) {
                        MotionEvent.ACTION_DOWN -> {

                        }
                        MotionEvent.ACTION_MOVE -> {

                            // 부모 좌표
                            val location = IntArray(2)
                            (v.parent as ViewGroup).getLocationOnScreen(location)

                            // pivotX 중심점
                            Log.v("holy","p / x:${location[0]} , y:${location[1]} " )
                            Log.v("holy","p / x:${(v.parent as ViewGroup).x} , y:${(v.parent as ViewGroup).y} " )
                            Log.v("holy","v / x:${v.x} , y:${v.y} " )
                            Log.v("holy","e / rawX:${e.rawX} , rawY:${e.rawY} , x:${e.x} , y:${e.y} " )
                            Log.v("holy","bt / x:${btCenter02.x} , y:${btCenter02.y}  , px:${btCenter02.pivotX} , py:${btCenter02.pivotY}" )
                            Log.v("holy","sub2 / x:${sub2.x} , y:${sub2.y}  , px:${sub2.pivotX} , py:${sub2.pivotY}" )

                            // 실제 배치 비율 속성 반영
                            val cl = findViewById<ConstraintLayout>(R.id.sub2)
                            val cs = ConstraintSet()
                            cs.clone(cl)
                            cs.setHorizontalBias(R.id.btCenter02, (e.rawX- location[0])/sub2.width)
                            cs.setVerticalBias(R.id.btCenter02, (e.rawY- location[1])/sub2.height)
                            cs.applyTo(cl)

                        }
                    }

                    //출처: https://kimch3617.tistory.com/entry/안드로이드-간단히-View-움직이게-하기-Drag-and-Drop [코드 저장소]

                }
            }
        }

        return true
    }
}
