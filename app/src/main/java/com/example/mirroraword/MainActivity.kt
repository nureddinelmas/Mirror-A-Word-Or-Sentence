package com.example.mirroraword

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var editText : EditText
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.editTextTextPersonName)
        textView = findViewById(R.id.textView)

    }

    fun mirrorWord(view : View){
        var text = editText.text.toString()
        var text2 : String = ""
        var lastPos : Int = text.length-1
        if(text == ""){
            editText.setError("Fylla i text box")
        }

        for(i in lastPos downTo 0){
            text2 += text[i]
        }
        text2 = text2.toString()
        textView.setText(text2)

    }
}