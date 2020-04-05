package com.example.holyex

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.Paint
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class Sub8Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_sub8)
        val myCanvasView = CustomView(this)
    }
}

class CustomView(context: Context?) :
    View(context){

    public override fun onDraw(c : Canvas){
        super.onDraw(c)
        c.drawColor(Color.BLUE)
        val p=Paint()
        p.setColor(Color.RED)
        c.drawRect(50F, 100F, 150F, 200F,p)
    }
}