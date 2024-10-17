package com.example.worknumber2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        val btnOpenActivityC= findViewById<Button>(R.id.btnOpenActivityC)
        btnOpenActivityC.setOnClickListener {
            val intent = Intent(this, ActivityC::class.java)
            // Запускаем ActivityC в том же стеке, где расположена ActivityB
            startActivity(intent)
        }


    }
}