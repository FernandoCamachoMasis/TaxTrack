package com.example.taxtrack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class passwordChange : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_change)

        val buttonBack = findViewById<Button>(R.id.buttonBack) // Cambia el tipo a Button

        buttonBack.setOnClickListener {
            // Cuando se hace clic en el botón de retroceso, inicia LoginActivity
            val intent = Intent(this, login::class.java)
            startActivity(intent)
            finish() // Esto finalizará la actividad actual (ChangePasswordActivity)
        }
    }
}