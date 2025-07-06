package com.jcasianos.actividadclasificacion

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity :  AppCompatActivity() {

    private fun AveriguarEdad(i: Int) {
        TODO("Not yet implemented")
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val edtEdad = findViewById<EditText>(R.id.EdtEdad)
        val btnSelect = findViewById<Button>(R.id.BtnSelect)

        btnSelect.setOnClickListener {

            if (edtEdad.text.toString() != "") {
                val edad: Int = edtEdad.text.toString().toInt()
                val resultado = AveriguarEdad(edad)





            }


            }


        }

        }










