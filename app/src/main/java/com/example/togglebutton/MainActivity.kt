package com.example.togglebutton

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toggleBtn.setOnClickListener{
            if (toggleBtn.isChecked){
                relativeL.setBackgroundResource(R.drawable.lampon)
                toggleBtn.setTextColor(Color.GREEN)
            }
            else{
                relativeL.setBackgroundResource(R.drawable.lampoff)
                toggleBtn.setTextColor(Color.RED)
            }
        }
    }
}