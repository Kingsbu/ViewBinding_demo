package com.sibusiso.viewbinding_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button_submit)

        button.setOnClickListener{
            displayGreeting()
        }
    }

    private fun displayGreeting() {
        val messageView = findViewById<TextView>(R.id.textView_show_input)
        val nameText = findViewById<EditText>(R.id.editText_name)
        messageView.text = "Hello " + nameText.text
    }
}