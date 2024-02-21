package com.example.espinozacampos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
class ActivitySecundario : AppCompatActivity() {
    private lateinit var lastbutton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secundario)

        lastbutton = findViewById(R.id.btn_volver)

        lastbutton.setOnClickListener {
            finish()
        }
    }
}