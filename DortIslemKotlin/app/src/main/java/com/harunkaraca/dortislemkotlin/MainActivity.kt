package com.harunkaraca.dortislemkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    // Addition function
    fun topla(view : View){
        var ilkSayi = ilkSayi.text.toString().toFloatOrNull()
        var ikinciSayi = ikinciSayi.text.toString().toFloatOrNull()

        if (ilkSayi == null || ikinciSayi == null){
            sonucText.text = "Please do not forget to enter the number!!"
        } else {
            var toplamaSonuc = ilkSayi + ikinciSayi
            sonucText.text = "Result: ${toplamaSonuc}"
        }
    }
    // Subtraction function
    fun cikar(view: View){
        var ilkSayi = ilkSayi.text.toString().toFloatOrNull()
        var ikinciSayi = ikinciSayi.text.toString().toFloatOrNull()
        if (ilkSayi == null || ikinciSayi == null){
            sonucText.text = "Please do not forget to enter the number!!"
        } else {
            var cikarmaSonuc = ilkSayi - ikinciSayi
            sonucText.text = "Result: ${cikarmaSonuc}"
        }
    }
    // Divide function
    fun bol(view: View){
        var ilkSayi = ilkSayi.text.toString().toFloatOrNull()
        var ikinciSayi = ikinciSayi.text.toString().toFloatOrNull()
        if (ilkSayi == null || ikinciSayi == null){
            sonucText.text = "Please do not forget to enter the number!!"
        } else {
            var bolmeSonuc = ilkSayi / ikinciSayi
            sonucText.text = "Result: ${bolmeSonuc}"
        }
    }
    // Multiplication function
    fun carp(view: View){
        var ilkSayi = ilkSayi.text.toString().toFloatOrNull()
        var ikinciSayi = ikinciSayi.text.toString().toFloatOrNull()
        if (ilkSayi == null || ikinciSayi == null){
            sonucText.text = "Please do not forget to enter the number!!"
        } else {
            var carpmaSonuc = ilkSayi * ikinciSayi
            sonucText.text = "Result: ${carpmaSonuc}"
        }
    }
}