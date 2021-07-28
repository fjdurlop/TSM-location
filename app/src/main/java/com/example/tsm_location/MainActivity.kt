package com.example.tsm_location

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun pressButtonSaveLocation(view:View){

        val label_longitude: TextView = findViewById(R.id.label_longitude)
        val label_latitude: TextView = findViewById(R.id.label_latitude)

        label_longitude.text = "Hola!!!" // To change longitude label
        label_latitude.text = "Hola!!!" // To change longitude label

    }

    fun pressButtonOK(view: View){

        val km_edit :EditText = findViewById(R.id.editKM)

        val kms = km_edit.text

    }
}