package com.example.oficiali

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cal_bolso.*
import net.objecthunter.exp4j.ExpressionBuilder
import javax.xml.xpath.XPathExpression

class CalBolso : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cal_bolso)

        var calculo =  textCalcu.text.toString()

        Btn9.setOnClickListener {alterar(string = "9", canClear = true) }
        Btn8.setOnClickListener {alterar(string = "8", canClear = true) }
        Btn7.setOnClickListener {alterar(string = "7", canClear = true) }
        Btn6.setOnClickListener {alterar(string = "6", canClear = true)  }
        Btn5.setOnClickListener {alterar(string = "5", canClear = true)  }
        Btn4.setOnClickListener {alterar(string = "4", canClear = true) }
        Btn3.setOnClickListener {alterar(string = "3", canClear = true)  }
        Btn2.setOnClickListener {alterar(string = "2", canClear = true) }
        Btn1.setOnClickListener {alterar(string = "1", canClear = true) }
        Btn0.setOnClickListener {alterar(string = "0", canClear = true) }


        BtnSoma.setOnClickListener {alterar(string = "+", canClear = false) }
        BtnSubtra.setOnClickListener {alterar(string = "-", canClear = false) }
        BtnDivisao.setOnClickListener {alterar(string = "/", canClear = false) }
        BtnMulti.setOnClickListener {alterar(string = "*", canClear = false) }



        BtnC.setOnClickListener {
            val operacao= textCalcu.text.toString()
            if (operacao.isNotEmpty()){
                textCalcu.text = operacao.substring(startIndex = 0, operacao.length - 1)
            }
            textResul.text = ""
        }

        BtnAC.setOnClickListener {
            textResul.text = "0"
            textCalcu.text = ""
        }

        BtnIgual.setOnClickListener {
            try {
                val opercao = ExpressionBuilder(textCalcu.text.toString()).build()
                val resul = opercao.evaluate()
                val longResul = resul.toLong()
                if(resul == longResul.toDouble()){
                    textResul.text = longResul.toString()
                } else{
                    textResul.text = resul.toString()
                }

            }catch (e:Exception){
                Log.d("Exception","mensagem : " + e.message)
            }
        }




    }

    fun alterar(string: String,canClear:Boolean){

        if(textResul.text.isNotEmpty()){
            textCalcu.text = ""
        }

        if(canClear){
            textResul.text = ""
            textCalcu.append(string)
        }else{
            textCalcu.append(textResul.text)
            textCalcu.append(string)
            textResul.text = ""
        }
    }
}