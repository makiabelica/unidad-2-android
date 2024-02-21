package com.example.espinozacampos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnEjecutar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnEjecutar = findViewById(R.id.btn_dispardor)
        btnEjecutar.setOnClickListener {
            val init = Intent(this,ActivitySecundario:: class.java)
            startActivity(init)
        }
    }
}