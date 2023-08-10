package com.example.mad_practical_4_22012022014

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mad_practical_4_22012022014.R.id.button
import com.example.mad_practical_4_22012022014.R.id.button2

class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val bttn=findViewById<Button>(button);
    bttn.setOnClickListener{
        val Intent = Intent(this,Login_Activityy::class.java).also{startActivity(it)}

    }
            val bttn2=findViewById<Button>(button2);
            bttn2.setOnClickListener{
                val Intent = Intent(this,SignUp_activity::class.java).also{startActivity(it)}
            }
    }
}