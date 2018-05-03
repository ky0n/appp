package com.appp

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* kein findViewById erforderlich wie bei Android */

        push_me.setOnClickListener {
            Toast.makeText( this, "Hi", Toast.LENGTH_LONG).show()
            push_me.visibility = if( push_me.visibility == View.VISIBLE){
                View.GONE
            } else {
                View.VISIBLE
            }
        }
        push_me.setBackgroundColor(Color.GREEN)
        push_me.setTextColor(Color.rgb(129, 127, 255))

    }
}
