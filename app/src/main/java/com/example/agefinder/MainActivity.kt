package com.example.agefinder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

import java.util.*

val currentYear = Calendar.getInstance().get(Calendar.YEAR)
var sc:Boolean = false


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonGetAge.setOnClickListener{

            if(edt_dob.text.length > 0){
                ageCounter()
            }else{
                Toast.makeText(this,"Please enter a year",Toast.LENGTH_SHORT).show()
            }


        }

    }

    fun dobValidate(age:Int):Boolean{
        if(age >0 && age <= currentYear && age >= currentYear-150){
            if (age < currentYear-100){
                sc = true
            }else{
                sc = false
            }
            return true
        }
        else{
            return false
        }
    }

    fun ageCounter(){
        var dob = Integer.parseInt(edt_dob.text.toString())
        if(dobValidate(dob)){
            val age = currentYear - dob
            if (sc){
                tv_dob.text = "Congratulation you are now $age years. You're most senior."
                Toast.makeText(this,"Respect for seniors",Toast.LENGTH_LONG).show()
            }else{
                tv_dob.text = "Your age now $age years ."
            }

        }else{
            Toast.makeText(this,"Year of Birth is not corret.",Toast.LENGTH_SHORT).show()
        }

    }




}