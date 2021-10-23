package com.example.agefinder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var userDob = edt_dob.text.toString()



        buttonGetAge.setOnClickListener{

            if(edt_dob.text.length > 0){
                ageCounter()
            }else{
                Toast.makeText(this,"Please enter a year",Toast.LENGTH_SHORT).show()
            }




//            Toast.makeText(this, currentYear, Toast.LENGTH_SHORT).show()
//            Toast.makeText(this,currentYear,Toast.LENGTH_SHORT)
//            tv_dob.setText(date)
//            if (date.length >0){
//                tv_dob.setText(currentYear)
//            }else{
//                Toast.makeText(this,"Please Enter a date", Toast.LENGTH_SHORT).show()
//            }


//            ++times
//            if(date.length == 0){
//                textView.setText("Plese enter the date first")
//            }
            //textView.setText("Hey, you just clicked $times times $date")
        }

    }

    fun ageCounter(){
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val age = currentYear - Integer.parseInt(edt_dob.text.toString())
        tv_dob.text = "Your age now $age years."
    }




}