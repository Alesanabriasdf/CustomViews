package com.example.customvieweit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupUI()
    }

    private fun setupUI() {

        val up = findViewById<Button>(R.id.btn_up)
        val down = findViewById<Button>(R.id.btn_down)
        val constraint = findViewById<ConstraintLayout>(R.id.constraint_principal)

        val agregar = findViewById<ImageButton>(R.id.imgAgregaraa)
        val textCantidad = findViewById<TextView>(R.id.txtNumeroaa)
        val restar = findViewById<ImageButton>(R.id.imgRemoveraa)
        agregar.setOnClickListener {
            if (textCantidad.text.toString().toInt()<6){
                textCantidad.setText((textCantidad.text.toString().toInt() + 1).toString())
            }
        }
        restar.setOnClickListener {
            if (textCantidad.text.toString().toInt()>0){
                textCantidad.setText((textCantidad.text.toString().toInt() - 1).toString())
            }
        }


        up.setOnClickListener {
            constraint.background = getDrawable(R.drawable.gradient2)

        }

        down.setOnClickListener {
            constraint.background = getDrawable(R.drawable.gradient)

        }


    }
}