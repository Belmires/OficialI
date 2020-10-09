package com.example.oficiali

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cal_conver_temperatura.*
import java.text.DecimalFormat
import java.text.NumberFormat

var formato: NumberFormat = DecimalFormat(".##")


class CalConverTemperatura : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cal_conver_temperatura)
        BtnCalcular.setOnClickListener {
            if(editTextTextCelsius.text.isNotEmpty()){
                val cel = editTextTextCelsius.text.toString().toDouble()
                val f = (1.8 * cel) + 32
                val k = cel + 273

                editTextTextFahrenheit.setText(formato.format(f))
                editTextKelvin.setText(formato.format(k))

            } else if(editTextTextFahrenheit.text.isNotEmpty()){
                val fah = editTextTextFahrenheit.text.toString().toDouble()
                val c = (fah - 32) /1.8
                val k = (fah + 459.67)/1.8

                editTextTextCelsius.setText(formato.format(c))
                editTextKelvin.setText(formato.format(k))

            } else if(editTextKelvin.text.isNotEmpty()){
                val kel = editTextKelvin.text.toString().toDouble()
                val c = kel - 273.15
                val fah = 1.8 * (kel - 273) + 32

                editTextTextFahrenheit.setText(formato.format(fah))
                editTextTextCelsius.setText(formato.format(c))
            }
        }
        BtnLimpar.setOnClickListener {
            editTextTextCelsius.text.clear()
            editTextTextFahrenheit.text.clear()
            editTextKelvin.text.clear()
        }
    }
}



