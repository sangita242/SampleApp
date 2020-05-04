package com.example.sampleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login_btn.setOnClickListener {
            val intent = Intent(this,NextActivity::class.java)
            startActivity(intent)

            var status =
                if (username_et.text.toString().equals("abcd") && password_et.text.toString().equals(
                        "1234"
                    )
                ) "Login Successfully" else "Login fail"
            Toast.makeText(this, status, Toast.LENGTH_SHORT).show()
        }

    }
}




