package com.example.oficiali

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_caldesconto.*

class Caldesconto : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_caldesconto)
        BtnCalcular.setOnClickListener {
            val valorOrigi = valorOriginal.text.toString().toDouble()
            val qtdDesconto = qtdDesconto.text.toString().toDouble()
            if (valorOrigi != null && qtdDesconto != null) {
                val valorDoDesconto = (valorOrigi * qtdDesconto) / 100
                val valorCoDesconto = valorOrigi - valorDoDesconto
                val valorEcono = valorOrigi - valorCoDesconto

                textView5.text = "R$ $valorCoDesconto"
                textView7.text = "R$ $valorEcono"
            }
        }
        BtnClear.setOnClickListener {
            valorOriginal.text.clear()
            qtdDesconto.text.clear()
            textView5.text = ""
            textView7.text = ""


        }
    }
}