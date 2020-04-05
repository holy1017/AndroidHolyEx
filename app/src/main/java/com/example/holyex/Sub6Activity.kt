package com.example.holyex



import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sub6.*


class Sub6Activity : AppCompatActivity() , View.OnClickListener {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub6)

        // 이거 편하게 하는 방법 없나
        //button7.setOnClickListener(this)
        //button8.setOnClickListener(this)
        //button9.setOnClickListener(this)


        // 더 편한거 없나
        val buttons = arrayOf(
            button7
            ,button8
            ,button9
        )
        for (i in buttons){
            i.setOnClickListener(this)
        }
    }

    override fun onClick(v: View?) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        if (v != null) {
            when (v.id) {
                R.id.button7 -> {
                    button7.setBackgroundColor(Color.GREEN)
                }
                R.id.button8 -> {
                    if (lay.orientation==LinearLayout.HORIZONTAL) {
                        lay.orientation= LinearLayout.VERTICAL
                    }else
                    if (lay.orientation==LinearLayout.VERTICAL) {
                        lay.orientation= LinearLayout.HORIZONTAL
                    }
                }
                R.id.button9->{
                    if (button9.gravity == Gravity.RIGHT or Gravity.BOTTOM){
                        button9.gravity = Gravity.LEFT or  Gravity.TOP
                    }else{
                        button9.gravity = Gravity.RIGHT or Gravity.BOTTOM
                    }
                }
            }
        }
    }
}
