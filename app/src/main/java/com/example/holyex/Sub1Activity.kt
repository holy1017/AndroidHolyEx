package com.example.holyex

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sub1.*

class Sub1Activity : AppCompatActivity(), View.OnTouchListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub1)

        Toast.makeText(applicationContext,"sub02Activity", Toast.LENGTH_LONG).show()

        //터치 리스너
        //findViewById<Button>(R.id.btCenter).setOnTouchListener(this)
        btCenter02.setOnTouchListener(this)
    }

//    private var offsetX = 0f
//    private var offsetY = 0f
    private var locX = 0f
    private var locY = 0f
//    private var moveX = 0f
//    private var moveY = 0f

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouch(v: View?, e: MotionEvent?): Boolean {

        if (v != null || e != null) {

            // 타입
/*            if (v is Button){
                //val b: Button = v as Button
                //val buttonText: String = v.getText().toString()
                // 토스트 메세지
                Toast.makeText(applicationContext, v.text.toString(), Toast.LENGTH_LONG).show()
            }*/

            // id
            when (v?.id) {
                R.id.btCenter02 -> {
                    //Toast.makeText(applicationContext,"btCenter run" ,Toast.LENGTH_LONG).show()

                    when(e?.action) {
                        MotionEvent.ACTION_DOWN -> {
                            //moveX = v.x - e.rawX
                            //moveY = v.y - e.rawY
                            //btCenter.text= "x:$moveX ,\n y:$moveY ,"
                            // rawX 는 화면 전체 절대 좌표
                            // x 선택한 오브젝트의 상대 좌표
                            //Log.v("holy","rawX:${e.rawX} , rawY:${e.rawY} , x:${e.x} , y:${e.y}")
                            //offsetX=e.x+sub2.x
                            //offsetY=e.y+sub2.y
                            locX = e.rawX
                            locY =  e.rawY
//                            moveX = 0f
//                            moveY = 0f
//                            locX = e.rawX-btCenter.x
//                            locY =  e.rawY-btCenter.y
                        }
                        MotionEvent.ACTION_MOVE -> {
                        //    v.animate() .x(event.rawX + moveX) .y(event.rawY + moveY) .setDuration(0) .start()
                            //btCenter.text= "x:${e.rawX} ,\n y:${e.rawY} ,"
//                            moveX = e.rawX - locX
//                            moveY = e.rawY - locY
//                            locX = e.rawX
//                            locY =  e.rawY
//                            btCenter.x+=moveX
//                            btCenter.y+=moveY
                            btCenter02.x+=e.rawX - locX
                            btCenter02.y+=e.rawY - locY
                            locX = e.rawX
                            locY =  e.rawY

                            // pivotX 중심점
                            Log.v("holy","e / rawX:${e.rawX} , rawY:${e.rawY} , x:${e.x} , y:${e.y} " )
                            Log.v("holy","bt / x:${btCenter02.x} , y:${btCenter02.y}  , px:${btCenter02.pivotX} , py:${btCenter02.pivotY}" )
                            Log.v("holy","sub2 / x:${sub2.x} , y:${sub2.y}  , px:${sub2.pivotX} , py:${sub2.pivotY}" )
//
//                            val cl = findViewById<ConstraintLayout>(R.id.sub2)
//                            val cs = ConstraintSet()
//                           cs.clone(cl)
//                           cs.setVerticalBias(R.id.btCenter, (btCenter.x+btCenter.pivotX)/sub2.width)
//                           cs.setHorizontalBias(R.id.btCenter, (btCenter.y+btCenter.pivotY)/sub2.height)
//                           cs.applyTo(cl)
//
                            //btCenter.set
//                            btCenter.bias=(btCenter.x+btCenter.pivotX)/sub2.width
//                            (btCenter.y+btCenter.pivotY)/sub2.height




                        }
                    }

                    //출처: https://kimch3617.tistory.com/entry/안드로이드-간단히-View-움직이게-하기-Drag-and-Drop [코드 저장소]

                }
            }
        }

        return true
    }
}
