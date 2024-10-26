package com.example.worknumber2

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("activityA",taskId.toString())

        setContentView(R.layout.activity_main)

        val btnOpenB=findViewById<Button>(R.id.btnOpenActivityB)
        btnOpenB.setOnClickListener{
            val intent = Intent(this, ActivityB::class.java)
            // Запускаем ActivityB в отдельном стеке

            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)

        }
        val btnOpenFragmentB=findViewById<Button>(R.id.btnOpenFragmentB)
        btnOpenFragmentB.setOnClickListener{
            val transaction=supportFragmentManager.beginTransaction()
            if (resources.configuration.orientation== Configuration.ORIENTATION_PORTRAIT){
                transaction.replace(R.id.fragment_container,FragmentBA()).commit()

            }else{
                transaction.replace(R.id.fragment_containerA,FragmentBA_1())
                transaction.replace(R.id.fragment_containerB,FragmentBB())
                transaction.commit()
            }


        }
    }

}