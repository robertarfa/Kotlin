package com.example.calculadora

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = button_calcular
        val resultado = tv_resultado

        btCalcular.setOnClickListener {
            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val media = (nota1+nota2)/2

            val faltas = Integer.parseInt(faltas.text.toString())

          if(media >= 6 && faltas <=10) {

              resultado.setText("Aluno foi aprovado, nota final $media e faltas $faltas")
              resultado.setTextColor(Color.GREEN)
          } else {
                    resultado.setText("Aluno foi reprovado, nota final $media e faltas $faltas")
                resultado.setTextColor(Color.RED)
            }
        }
    }
}