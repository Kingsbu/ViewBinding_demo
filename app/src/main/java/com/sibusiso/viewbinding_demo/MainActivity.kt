package com.sibusiso.viewbinding_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.sibusiso.viewbinding_demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val button = findViewById<Button>(R.id.button_submit)
        //button.setOnClickListener{
        //    displayGreeting()
        //}
        
        binding.buttonSubmit.setOnClickListener{
            displayGreeting()
        }
    }

    private fun displayGreeting() {
        //val messageView = findViewById<TextView>(R.id.textView_show_input)
        //val nameText = findViewById<EditText>(R.id.editText_name)
        //messageView.text = "Hello " + nameText.text
        binding.textViewShowInput.text = binding.editTextName.text
    }
}