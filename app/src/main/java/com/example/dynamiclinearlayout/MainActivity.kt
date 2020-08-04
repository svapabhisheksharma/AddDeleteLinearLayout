package com.example.dynamiclinearlayout

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter  = 0


//        var v :TextView= TextView(this)
//        v.text = "Hello"
        val b = findViewById<Button>(R.id.button)
        var rootlayout = findViewById<LinearLayout>(R.id.root)

        b.setOnClickListener{
            val v :View= LayoutInflater.from(this).inflate(R.layout.tobeadded_layout,null,false)
            val t = v.findViewById<TextView>(R.id.textView)

            counter++
            v.id =counter
            val bd = v.findViewById<Button>(R.id.delete)
            bd.setOnClickListener {
                rootlayout.removeView(v)
            }
            t.text = "added for $counter row "
            rootlayout.addView(v)
        }

    }
}
