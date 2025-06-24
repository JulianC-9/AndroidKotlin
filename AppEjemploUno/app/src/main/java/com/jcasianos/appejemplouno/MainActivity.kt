package com.jcasianos.appejemplouno

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

          }
        //--------------------------------------------------------------------------------
        val TxtSaludo = findViewById<TextView>(R.id.TxtSaludo)
        val btnHola = findViewById<Button>(R.id.btnHola)
        val btnadios = findViewById<Button>(R.id.btnadios)


        //llamado de la funcion
        CambiodeSaludo(TxtSaludo, btnHola, btnadios)


    }

    fun CambiodeSaludo(t: TextView, b1: Button, b2: Button){
        val SaludoHola = "seas bienvenido a la aplicacion"
        val SaludoAdios = "te vere la proxima vez"

        b1. setOnClickListener {
            t.text = SaludoHola
        }
        b2. setOnClickListener {
            t.text = SaludoAdios
        }
    }
}