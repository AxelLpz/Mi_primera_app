package edu.itsco.miprimeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlin.contracts.Returns

class MainActivity : AppCompatActivity() {

    lateinit var Et1: EditText
    lateinit var Et2: EditText
    lateinit var Etm: EditText

    override fun onCreate(savedInstanceState:Bundle? ) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Et1=findViewById(R.id.Et1)
        Et2=findViewById(R.id.Et2)
        Etm=findViewById(R.id.EtM)

    }

    fun EncontrarMayor(a:Int,b:Int):Int{
        if (a>b){
            return (a)
        }else
        {
            return (b)
        }
    }

    fun calcularMayor(view:View){
        var a:Int=Et1.text.toString().toInt()
        var b:Int=Et2.text.toString().toInt()
        var tMayor:Int=EncontrarMayor(a,b)
        Etm.setText(tMayor.toString())
    }



}