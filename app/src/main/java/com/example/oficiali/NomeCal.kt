package com.example.oficiali

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_nome_cal.*

class NomeCal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nome_cal)
        BtnConfNome.setOnClickListener {

            val nomeCalcu = editTextTextPersonName.text.toString()
            val intent = Intent(this@NomeCal, MainActivity::class.java).apply {
                putExtra("nomeCalcu", nomeCalcu)

            }
            startActivity(intent)
        }
    }
}