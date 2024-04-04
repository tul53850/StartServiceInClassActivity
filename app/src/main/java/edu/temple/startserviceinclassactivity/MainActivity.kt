package edu.temple.startserviceinclassactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countdownValue = findViewById<EditText>(R.id.countdownEditText)

        val countdownStartButton = findViewById<Button>(R.id.countdownButton)

    }
}