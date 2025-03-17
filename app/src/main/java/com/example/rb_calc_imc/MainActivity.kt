package com.example.rb_calc_imc

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    lateinit var weightEditText: EditText
    lateinit var heightEditText: EditText
    lateinit var calculateButton: Button
    lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        weightEditText = findViewById(R.id.editTextPeso)
        heightEditText = findViewById(R.id.editTextAltura)
        calculateButton = findViewById(R.id.calculateButton)
        resultTextView = findViewById(R.id.resultTextView)

        calculateButton.setOnClickListener {

            val weight = weightEditText.text.toString().toFloat()
            val height = heightEditText.text.toString().toFloat()

            val result= weight / (height / 100).pow(n=2)
            resultTextView.text = String.format("%.2f", result)

//            Log.i(Tag:"IMC")

            println("Peso:  $weight" )
            println("Altura: $height")
            println("El IMC es: $result")


        }
    }
}