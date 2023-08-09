package com.example.mad_practical_4_22012022014

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mad_practical_4_22012022014.R.id.button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
       var button1 = findViewById(R.id.button) as Button

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    button1.setOnClickListener(){
        intent = Intent(this,Login_Activityy::class.java);
        startActivity(this.intent);
    }

    }
}