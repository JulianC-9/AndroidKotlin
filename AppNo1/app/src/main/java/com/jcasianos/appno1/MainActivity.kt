package com.jcasianos.appno1

import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val numberInput = findViewById<EditText>(R.id.numberInput)
        val evaluateButton = findViewById<Button>(R.id.evaluateButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        evaluateButton.setOnClickListener {
            val inputText = numberInput.text.toString()

            //Verifica si el campo esta vacio
            if (inputText.isEmpty()) {
                resultTextView.text = "por favor ingresa el numero"
                return@setOnClickListener
            }
            val number = inputText.toInt()

            when {
                number > 0 -> {
                    resultTextView.text = "El número es Positivo"
                    resultTextView.setTextColor(Color.GREEN)

                }
                number < 0 -> {
                    resultTextView.text = "El número es Negativo"
                    resultTextView.setTextColor(Color.RED)
                }
                else -> {
                    resultTextView.text = "El número es Cero"
                    resultTextView.setTextColor(Color.BLUE)
                }
            }
        }


    }
}