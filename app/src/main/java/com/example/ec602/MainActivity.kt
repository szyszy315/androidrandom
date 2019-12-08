package com.example.ec602

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton = findViewById<Button>(R.id.rollbutton)
        val resultstextview = findViewById<TextView>(R.id.resultstextview)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        rollbutton.setOnClickListener{
            val rand = Random().nextInt(seekBar.progress + 1)
            resultstextview.text = rand.toString()
        }
    }
}
