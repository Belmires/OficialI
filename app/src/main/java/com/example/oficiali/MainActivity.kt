package com.example.oficiali

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nomeCalcu = intent.getStringExtra("nomeCalcu")
        textView2.text = nomeCalcu

        BtnCalBolso.setOnClickListener {
            val intent = Intent(this@MainActivity, CalBolso::class.java).apply {

            }
            startActivity(intent)

        }

        BtnCalDesconto.setOnClickListener {
            val intent = Intent(this@MainActivity, Caldesconto::class.java).apply {

            }
            startActivity(intent)
        }

        BtnCalConverTemperatura.setOnClickListener {
            val intent = Intent(this@MainActivity, CalConverTemperatura::class.java).apply {

            }
            startActivity(intent)
        }

        BtnNomeCal.setOnClickListener {
            val intent = Intent(this@MainActivity, NomeCal::class.java).apply {

            }
            startActivity(intent)
        }

    }
}