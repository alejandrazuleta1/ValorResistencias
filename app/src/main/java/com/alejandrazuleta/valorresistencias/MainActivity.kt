package com.alejandrazuleta.valorresistencias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alejandrazuleta.valorresistencias.R.*
import com.alejandrazuleta.valorresistencias.R.color.*
import kotlinx.android.synthetic.main.activity_main.*
import java.security.AccessController.getContext
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import java.util.*



@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        var valor = ""
        var lector1 = ""
        var lector2 = ""
        var lector3 = ""
        var lector4 = ""

        b12.setOnClickListener {
            iv_i_3.setBackgroundColor(getResources().getColor(saddlebrown))
            iv_i_3.contentDescription = "1"

            valor = "1"
            lector2 = iv_i_1.contentDescription.toString()
            lector3 = iv_d_1.contentDescription.toString()
            lector4 = iv_d_3.contentDescription.toString()

            when (lector2) {
                "0" -> valor += "0"
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            when (lector3) {
                "0" -> {
                }
                "1" -> valor += "E+1"
                "2" -> valor += "E+2"
                "3" -> valor += "E+3"
                "4" -> valor += "E+4"
                "5" -> valor += "E+5"
                "6" -> valor += "E+6"
                "7" -> valor += "E+7"
                "8" -> valor += "E+8"
                else -> valor += "E+9"
            }
            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b13.setOnClickListener {
            iv_i_3.setBackgroundColor(getResources().getColor(red))
            iv_i_3.contentDescription = "2"

            valor = "2"
            lector2 = iv_i_1.contentDescription.toString()
            lector3 = iv_d_1.contentDescription.toString()
            lector4 = iv_d_3.contentDescription.toString()

            when (lector2) {
                "0" -> valor += "0"
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            when (lector3) {
                "0" -> {
                }
                "1" -> valor += "E+1"
                "2" -> valor += "E+2"
                "3" -> valor += "E+3"
                "4" -> valor += "E+4"
                "5" -> valor += "E+5"
                "6" -> valor += "E+6"
                "7" -> valor += "E+7"
                "8" -> valor += "E+8"
                else -> valor += "E+9"
            }
            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b14.setOnClickListener {
            iv_i_3.setBackgroundColor(getResources().getColor(orange));
            iv_i_3.contentDescription = "3"

            valor = "3"
            lector2 = iv_i_1.contentDescription.toString()
            lector3 = iv_d_1.contentDescription.toString()
            lector4 = iv_d_3.contentDescription.toString()

            when (lector2) {
                "0" -> valor += "0"
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            when (lector3) {
                "0" -> {
                }
                "1" -> valor += "E+1"
                "2" -> valor += "E+2"
                "3" -> valor += "E+3"
                "4" -> valor += "E+4"
                "5" -> valor += "E+5"
                "6" -> valor += "E+6"
                "7" -> valor += "E+7"
                "8" -> valor += "E+8"
                else -> valor += "E+9"
            }
            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b15.setOnClickListener {
            iv_i_3.setBackgroundColor(getResources().getColor(yellow));
            iv_i_3.contentDescription = "4"

            valor = "4"
            lector2 = iv_i_1.contentDescription.toString()
            lector3 = iv_d_1.contentDescription.toString()
            lector4 = iv_d_3.contentDescription.toString()

            when (lector2) {
                "0" -> valor += "0"
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            when (lector3) {
                "0" -> {
                }
                "1" -> valor += "E+1"
                "2" -> valor += "E+2"
                "3" -> valor += "E+3"
                "4" -> valor += "E+4"
                "5" -> valor += "E+5"
                "6" -> valor += "E+6"
                "7" -> valor += "E+7"
                "8" -> valor += "E+8"
                else -> valor += "E+9"
            }
            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b16.setOnClickListener {
            iv_i_3.setBackgroundColor(getResources().getColor(green))
            iv_i_3.contentDescription = "5"

            valor = "5"
            lector2 = iv_i_1.contentDescription.toString()
            lector3 = iv_d_1.contentDescription.toString()
            lector4 = iv_d_3.contentDescription.toString()

            when (lector2) {
                "0" -> valor += "0"
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            when (lector3) {
                "0" -> {
                }
                "1" -> valor += "E+1"
                "2" -> valor += "E+2"
                "3" -> valor += "E+3"
                "4" -> valor += "E+4"
                "5" -> valor += "E+5"
                "6" -> valor += "E+6"
                "7" -> valor += "E+7"
                "8" -> valor += "E+8"
                else -> valor += "E+9"
            }
            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b17.setOnClickListener {
            iv_i_3.setBackgroundColor(getResources().getColor(blue))
            iv_i_3.contentDescription = "6"

            valor = "6"
            lector2 = iv_i_1.contentDescription.toString()
            lector3 = iv_d_1.contentDescription.toString()
            lector4 = iv_d_3.contentDescription.toString()

            when (lector2) {
                "0" -> valor += "0"
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            when (lector3) {
                "0" -> {
                }
                "1" -> valor += "E+1"
                "2" -> valor += "E+2"
                "3" -> valor += "E+3"
                "4" -> valor += "E+4"
                "5" -> valor += "E+5"
                "6" -> valor += "E+6"
                "7" -> valor += "E+7"
                "8" -> valor += "E+8"
                else -> valor += "E+9"
            }
            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b18.setOnClickListener {
            iv_i_3.setBackgroundColor(getResources().getColor(purple));
            iv_i_3.contentDescription = "7"

            valor = "7"
            lector2 = iv_i_1.contentDescription.toString()
            lector3 = iv_d_1.contentDescription.toString()
            lector4 = iv_d_3.contentDescription.toString()

            when (lector2) {
                "0" -> valor += "0"
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            when (lector3) {
                "0" -> {
                }
                "1" -> valor += "E+1"
                "2" -> valor += "E+2"
                "3" -> valor += "E+3"
                "4" -> valor += "E+4"
                "5" -> valor += "E+5"
                "6" -> valor += "E+6"
                "7" -> valor += "E+7"
                "8" -> valor += "E+8"
                else -> valor += "E+9"
            }
            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b19.setOnClickListener {
            iv_i_3.setBackgroundColor(getResources().getColor(gray));
            iv_i_3.contentDescription = "8"

            valor = "8"
            lector2 = iv_i_1.contentDescription.toString()
            lector3 = iv_d_1.contentDescription.toString()
            lector4 = iv_d_3.contentDescription.toString()

            when (lector2) {
                "0" -> valor += "0"
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            when (lector3) {
                "0" -> {
                }
                "1" -> valor += "E+1"
                "2" -> valor += "E+2"
                "3" -> valor += "E+3"
                "4" -> valor += "E+4"
                "5" -> valor += "E+5"
                "6" -> valor += "E+6"
                "7" -> valor += "E+7"
                "8" -> valor += "E+8"
                else -> valor += "E+9"
            }
            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b110.setOnClickListener {
            iv_i_3.setBackgroundColor(getResources().getColor(white));
            iv_i_3.contentDescription = "9"

            valor = "9"
            lector2 = iv_i_1.contentDescription.toString()
            lector3 = iv_d_1.contentDescription.toString()
            lector4 = iv_d_3.contentDescription.toString()

            when (lector2) {
                "0" -> valor += "0"
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            when (lector3) {
                "0" -> {
                }
                "1" -> valor += "E+1"
                "2" -> valor += "E+2"
                "3" -> valor += "E+3"
                "4" -> valor += "E+4"
                "5" -> valor += "E+5"
                "6" -> valor += "E+6"
                "7" -> valor += "E+7"
                "8" -> valor += "E+8"
                else -> valor += "E+9"
            }
            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b21.setOnClickListener {
            iv_i_1.setBackgroundColor(getResources().getColor(black))
            iv_i_1.contentDescription = "0"

            valor = ""
            lector1 = iv_i_3.contentDescription.toString()
            lector2 = "0"
            lector3 = iv_d_1.contentDescription.toString()
            lector4 = iv_d_3.contentDescription.toString()

            when (lector1) {
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            valor += lector2
            when (lector3) {
                "0" -> {
                }
                "1" -> valor += "E+1"
                "2" -> valor += "E+2"
                "3" -> valor += "E+3"
                "4" -> valor += "E+4"
                "5" -> valor += "E+5"
                "6" -> valor += "E+6"
                "7" -> valor += "E+7"
                "8" -> valor += "E+8"
                else -> valor += "E+9"
            }
            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b22.setOnClickListener {
            iv_i_1.setBackgroundColor(getResources().getColor(saddlebrown))
            iv_i_1.contentDescription = "1"

            valor = ""
            lector1 = iv_i_3.contentDescription.toString()
            lector2 = "1"
            lector3 = iv_d_1.contentDescription.toString()
            lector4 = iv_d_3.contentDescription.toString()

            when (lector1) {
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            valor += lector2
            when (lector3) {
                "0" -> {
                }
                "1" -> valor += "E+1"
                "2" -> valor += "E+2"
                "3" -> valor += "E+3"
                "4" -> valor += "E+4"
                "5" -> valor += "E+5"
                "6" -> valor += "E+6"
                "7" -> valor += "E+7"
                "8" -> valor += "E+8"
                else -> valor += "E+9"
            }
            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b23.setOnClickListener {
            iv_i_1.setBackgroundColor(getResources().getColor(red))
            iv_i_1.contentDescription = "2"

            valor = ""
            lector1 = iv_i_3.contentDescription.toString()
            lector2 = "2"
            lector3 = iv_d_1.contentDescription.toString()
            lector4 = iv_d_3.contentDescription.toString()

            when (lector1) {
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            valor += lector2
            when (lector3) {
                "0" -> {
                }
                "1" -> valor += "E+1"
                "2" -> valor += "E+2"
                "3" -> valor += "E+3"
                "4" -> valor += "E+4"
                "5" -> valor += "E+5"
                "6" -> valor += "E+6"
                "7" -> valor += "E+7"
                "8" -> valor += "E+8"
                else -> valor += "E+9"
            }
            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b24.setOnClickListener {
            iv_i_1.setBackgroundColor(getResources().getColor(orange));
            iv_i_1.contentDescription = "3"

            valor = ""
            lector1 = iv_i_3.contentDescription.toString()
            lector2 = "3"
            lector3 = iv_d_1.contentDescription.toString()
            lector4 = iv_d_3.contentDescription.toString()

            when (lector1) {
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            valor += lector2
            when (lector3) {
                "0" -> {
                }
                "1" -> valor += "E+1"
                "2" -> valor += "E+2"
                "3" -> valor += "E+3"
                "4" -> valor += "E+4"
                "5" -> valor += "E+5"
                "6" -> valor += "E+6"
                "7" -> valor += "E+7"
                "8" -> valor += "E+8"
                else -> valor += "E+9"
            }
            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b25.setOnClickListener {
            iv_i_1.setBackgroundColor(getResources().getColor(yellow));
            iv_i_1.contentDescription = "4"

            valor = ""
            lector1 = iv_i_3.contentDescription.toString()
            lector2 = "4"
            lector3 = iv_d_1.contentDescription.toString()
            lector4 = iv_d_3.contentDescription.toString()

            when (lector1) {
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            valor += lector2
            when (lector3) {
                "0" -> {
                }
                "1" -> valor += "E+1"
                "2" -> valor += "E+2"
                "3" -> valor += "E+3"
                "4" -> valor += "E+4"
                "5" -> valor += "E+5"
                "6" -> valor += "E+6"
                "7" -> valor += "E+7"
                "8" -> valor += "E+8"
                else -> valor += "E+9"
            }
            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b26.setOnClickListener {
            iv_i_1.setBackgroundColor(getResources().getColor(green))
            iv_i_1.contentDescription = "5"

            valor = ""
            lector1 = iv_i_3.contentDescription.toString()
            lector2 = "5"
            lector3 = iv_d_1.contentDescription.toString()
            lector4 = iv_d_3.contentDescription.toString()

            when (lector1) {
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            valor += lector2
            when (lector3) {
                "0" -> {
                }
                "1" -> valor += "E+1"
                "2" -> valor += "E+2"
                "3" -> valor += "E+3"
                "4" -> valor += "E+4"
                "5" -> valor += "E+5"
                "6" -> valor += "E+6"
                "7" -> valor += "E+7"
                "8" -> valor += "E+8"
                else -> valor += "E+9"
            }
            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b27.setOnClickListener {
            iv_i_1.setBackgroundColor(getResources().getColor(blue))
            iv_i_1.contentDescription = "6"

            valor = ""
            lector1 = iv_i_3.contentDescription.toString()
            lector2 = "6"
            lector3 = iv_d_1.contentDescription.toString()
            lector4 = iv_d_3.contentDescription.toString()

            when (lector1) {
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            valor += lector2
            when (lector3) {
                "0" -> {
                }
                "1" -> valor += "E+1"
                "2" -> valor += "E+2"
                "3" -> valor += "E+3"
                "4" -> valor += "E+4"
                "5" -> valor += "E+5"
                "6" -> valor += "E+6"
                "7" -> valor += "E+7"
                "8" -> valor += "E+8"
                else -> valor += "E+9"
            }
            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b28.setOnClickListener {
            iv_i_1.setBackgroundColor(getResources().getColor(purple));
            iv_i_1.contentDescription = "7"

            valor = ""
            lector1 = iv_i_3.contentDescription.toString()
            lector2 = "7"
            lector3 = iv_d_1.contentDescription.toString()
            lector4 = iv_d_3.contentDescription.toString()

            when (lector1) {
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            valor += lector2
            when (lector3) {
                "0" -> {
                }
                "1" -> valor += "E+1"
                "2" -> valor += "E+2"
                "3" -> valor += "E+3"
                "4" -> valor += "E+4"
                "5" -> valor += "E+5"
                "6" -> valor += "E+6"
                "7" -> valor += "E+7"
                "8" -> valor += "E+8"
                else -> valor += "E+9"
            }
            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b29.setOnClickListener {
            iv_i_1.setBackgroundColor(getResources().getColor(gray));
            iv_i_1.contentDescription = "8"

            valor = ""
            lector1 = iv_i_3.contentDescription.toString()
            lector2 = "8"
            lector3 = iv_d_1.contentDescription.toString()
            lector4 = iv_d_3.contentDescription.toString()

            when (lector1) {
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            valor += lector2
            when (lector3) {
                "0" -> {
                }
                "1" -> valor += "E+1"
                "2" -> valor += "E+2"
                "3" -> valor += "E+3"
                "4" -> valor += "E+4"
                "5" -> valor += "E+5"
                "6" -> valor += "E+6"
                "7" -> valor += "E+7"
                "8" -> valor += "E+8"
                else -> valor += "E+9"
            }
            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b210.setOnClickListener {
            iv_i_1.setBackgroundColor(getResources().getColor(white));
            iv_i_1.contentDescription = "9"

            valor = ""
            lector1 = iv_i_3.contentDescription.toString()
            lector2 = "9"
            lector3 = iv_d_1.contentDescription.toString()
            lector4 = iv_d_3.contentDescription.toString()

            when (lector1) {
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            valor += lector2
            when (lector3) {
                "0" -> {
                }
                "1" -> valor += "E+1"
                "2" -> valor += "E+2"
                "3" -> valor += "E+3"
                "4" -> valor += "E+4"
                "5" -> valor += "E+5"
                "6" -> valor += "E+6"
                "7" -> valor += "E+7"
                "8" -> valor += "E+8"
                else -> valor += "E+9"
            }
            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b31.setOnClickListener {
            iv_d_1.setBackgroundColor(getResources().getColor(black))
            iv_d_1.contentDescription = "0"

            valor = ""
            lector1 = iv_i_3.contentDescription.toString()
            lector2 = iv_i_1.contentDescription.toString()
            lector3 = ""
            lector4 = iv_d_3.contentDescription.toString()

            when (lector1) {
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }

            when (lector2) {
                "0" -> valor += "0"
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            valor += lector3

            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b32.setOnClickListener {
            iv_d_1.setBackgroundColor(getResources().getColor(saddlebrown))
            iv_d_1.contentDescription = "1"

            valor = ""
            lector1 = iv_i_3.contentDescription.toString()
            lector2 = iv_i_1.contentDescription.toString()
            lector3 = "E+1"
            lector4 = iv_d_3.contentDescription.toString()

            when (lector1) {
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }

            when (lector2) {
                "0" -> valor += "0"
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            valor += lector3

            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b33.setOnClickListener {
            iv_d_1.setBackgroundColor(getResources().getColor(red))
            iv_d_1.contentDescription = "2"

            valor = ""
            lector1 = iv_i_3.contentDescription.toString()
            lector2 = iv_i_1.contentDescription.toString()
            lector3 = "E+2"
            lector4 = iv_d_3.contentDescription.toString()

            when (lector1) {
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }

            when (lector2) {
                "0" -> valor += "0"
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            valor += lector3

            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b34.setOnClickListener {
            iv_d_1.setBackgroundColor(getResources().getColor(orange));
            iv_d_1.contentDescription = "3"

            valor = ""
            lector1 = iv_i_3.contentDescription.toString()
            lector2 = iv_i_1.contentDescription.toString()
            lector3 = "E+3"
            lector4 = iv_d_3.contentDescription.toString()

            when (lector1) {
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }

            when (lector2) {
                "0" -> valor += "0"
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            valor += lector3

            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b35.setOnClickListener {
            iv_d_1.setBackgroundColor(getResources().getColor(yellow));
            iv_d_1.contentDescription = "4"

            valor = ""
            lector1 = iv_i_3.contentDescription.toString()
            lector2 = iv_i_1.contentDescription.toString()
            lector3 = "E+4"
            lector4 = iv_d_3.contentDescription.toString()

            when (lector1) {
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }

            when (lector2) {
                "0" -> valor += "0"
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            valor += lector3

            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b36.setOnClickListener {
            iv_d_1.setBackgroundColor(getResources().getColor(green))
            iv_d_1.contentDescription = "5"

            valor = ""
            lector1 = iv_i_3.contentDescription.toString()
            lector2 = iv_i_1.contentDescription.toString()
            lector3 = "E+5"
            lector4 = iv_d_3.contentDescription.toString()

            when (lector1) {
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }

            when (lector2) {
                "0" -> valor += "0"
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            valor += lector3

            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b37.setOnClickListener {
            iv_d_1.setBackgroundColor(getResources().getColor(blue))
            iv_d_1.contentDescription = "6"

            valor = ""
            lector1 = iv_i_3.contentDescription.toString()
            lector2 = iv_i_1.contentDescription.toString()
            lector3 = "E+6"
            lector4 = iv_d_3.contentDescription.toString()

            when (lector1) {
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }

            when (lector2) {
                "0" -> valor += "0"
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            valor += lector3

            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b38.setOnClickListener {
            iv_d_1.setBackgroundColor(getResources().getColor(purple));
            iv_d_1.contentDescription = "7"

            valor = ""
            lector1 = iv_i_3.contentDescription.toString()
            lector2 = iv_i_1.contentDescription.toString()
            lector3 = "E+7"
            lector4 = iv_d_3.contentDescription.toString()

            when (lector1) {
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }

            when (lector2) {
                "0" -> valor += "0"
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            valor += lector3

            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b39.setOnClickListener {
            iv_d_1.setBackgroundColor(getResources().getColor(gray));
            iv_d_1.contentDescription = "8"

            valor = ""
            lector1 = iv_i_3.contentDescription.toString()
            lector2 = iv_i_1.contentDescription.toString()
            lector3 = "E+8"
            lector4 = iv_d_3.contentDescription.toString()

            when (lector1) {
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }

            when (lector2) {
                "0" -> valor += "0"
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            valor += lector3

            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b310.setOnClickListener {
            iv_d_1.setBackgroundColor(getResources().getColor(white));
            iv_d_1.contentDescription = "9"

            valor = ""
            lector1 = iv_i_3.contentDescription.toString()
            lector2 = iv_i_1.contentDescription.toString()
            lector3 = "E+9"
            lector4 = iv_d_3.contentDescription.toString()

            when (lector1) {
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }

            when (lector2) {
                "0" -> valor += "0"
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }
            valor += lector3

            valor = valor.toBigDecimal().toEngineeringString()

            when (lector4) {
                "0" -> valor += " Ω ±1%"
                "1" -> valor += " Ω ±2%"
                "2" -> valor += " Ω ±5%"
                else -> valor += " Ω ±10%"
            }

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b41.setOnClickListener {
            iv_d_3.setBackgroundColor(getResources().getColor(saddlebrown))
            iv_d_3.contentDescription = "0"

            valor = ""
            lector1 = iv_i_3.contentDescription.toString()
            lector2 = iv_i_1.contentDescription.toString()
            lector3 = iv_d_1.contentDescription.toString()
            lector4 = " Ω ±1%"

            when (lector1) {
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }

            when (lector2) {
                "0" -> valor += "0"
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }

            when (lector3) {
                "0" -> {
                }
                "1" -> valor += "E+1"
                "2" -> valor += "E+2"
                "3" -> valor += "E+3"
                "4" -> valor += "E+4"
                "5" -> valor += "E+5"
                "6" -> valor += "E+6"
                "7" -> valor += "E+7"
                "8" -> valor += "E+8"
                else -> valor += "E+9"
            }
            valor = valor.toBigDecimal().toEngineeringString().toString()

            valor += lector4

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b42.setOnClickListener {
            iv_d_3.setBackgroundColor(getResources().getColor(red));
            iv_d_3.contentDescription = "1"

            valor = ""
            lector1 = iv_i_3.contentDescription.toString()
            lector2 = iv_i_1.contentDescription.toString()
            lector3 = iv_d_1.contentDescription.toString()
            lector4 = " Ω ±2%"

            when (lector1) {
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }

            when (lector2) {
                "0" -> valor += "0"
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }

            when (lector3) {
                "0" -> {
                }
                "1" -> valor += "E+1"
                "2" -> valor += "E+2"
                "3" -> valor += "E+3"
                "4" -> valor += "E+4"
                "5" -> valor += "E+5"
                "6" -> valor += "E+6"
                "7" -> valor += "E+7"
                "8" -> valor += "E+8"
                else -> valor += "E+9"
            }
            valor = valor.toBigDecimal().toEngineeringString().toString()

            valor += lector4

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor

        }
        b43.setOnClickListener {
            iv_d_3.setBackgroundColor(getResources().getColor(gold));
            iv_d_3.contentDescription = "2"

            valor = ""
            lector1 = iv_i_3.contentDescription.toString()
            lector2 = iv_i_1.contentDescription.toString()
            lector3 = iv_d_1.contentDescription.toString()
            lector4 = " Ω ±5%"

            when (lector1) {
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }

            when (lector2) {
                "0" -> valor += "0"
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }

            when (lector3) {
                "0" -> {
                }
                "1" -> valor += "E+1"
                "2" -> valor += "E+2"
                "3" -> valor += "E+3"
                "4" -> valor += "E+4"
                "5" -> valor += "E+5"
                "6" -> valor += "E+6"
                "7" -> valor += "E+7"
                "8" -> valor += "E+8"
                else -> valor += "E+9"
            }
            valor = valor.toBigDecimal().toEngineeringString().toString()

            valor += lector4

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
        b44.setOnClickListener {
            iv_d_3.setBackgroundColor(getResources().getColor(silver));
            iv_d_3.contentDescription = "3"

            valor = ""
            lector1 = iv_i_3.contentDescription.toString()
            lector2 = iv_i_1.contentDescription.toString()
            lector3 = iv_d_1.contentDescription.toString()
            lector4 = " Ω ±10%"

            when (lector1) {
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }

            when (lector2) {
                "0" -> valor += "0"
                "1" -> valor += "1"
                "2" -> valor += "2"
                "3" -> valor += "3"
                "4" -> valor += "4"
                "5" -> valor += "5"
                "6" -> valor += "6"
                "7" -> valor += "7"
                "8" -> valor += "8"
                else -> valor += "9"
            }

            when (lector3) {
                "0" -> {
                }
                "1" -> valor += "E+1"
                "2" -> valor += "E+2"
                "3" -> valor += "E+3"
                "4" -> valor += "E+4"
                "5" -> valor += "E+5"
                "6" -> valor += "E+6"
                "7" -> valor += "E+7"
                "8" -> valor += "E+8"
                else -> valor += "E+9"
            }
            valor = valor.toBigDecimal().toEngineeringString().toString()

            valor += lector4

            valor=valor.replace("E+3 "," K",false)
            valor=valor.replace("E+6 "," M",false)
            valor=valor.replace("E+9 "," G",false)
            tv_valor.text = valor
        }
    }
}
