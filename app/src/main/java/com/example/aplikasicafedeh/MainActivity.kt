package com.example.aplikasicafedeh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Punya bang zaen
//    lateinit var listFoodChecked : Map<CheckBox, Int>
//    lateinit var listDrinkChecked : Map<CheckBox, Int>
//
//    var totalFood : Int = 0
//    var totalDrink : Int = 0
//    var total :Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Punya pak zulka
    fun hitungTotal(view: View) {
        var totalMakanan = 0
        var totalMinuman = 0

        if (cb_food_one.isChecked && et_food_one.text.toString() != ""){
            totalMakanan += (et_food_one.text.toString().toInt() * 15000)
        }

        if (cb_food_two.isChecked && et_food_two.text.toString() != "") {
            totalMakanan += (et_food_two.text.toString().toInt() * 12000)
        }

        if (cb_food_three.isChecked && et_food_three.text.toString() != ""){
            totalMakanan += (et_food_three.text.toString().toInt() * 16000)
        }

        if (cb_food_four.isChecked && et_food_four.text.toString() != ""){
            totalMakanan += (et_food_four.text.toString().toInt() * 15000)
        }

        if (cb_drink_one.isChecked && et_drink_one.text.toString() != ""){
            totalMinuman += (et_drink_one.text.toString().toInt() * 5000)
        }

        if (cb_drink_two.isChecked && et_drink_two.text.toString() != ""){
            totalMinuman += (et_drink_two.text.toString().toInt() * 1000)
        }

        if (cb_drink_three.isChecked && et_drink_three.text.toString() != "") {
            totalMinuman += (et_drink_three.text.toString().toInt() * 3000)
        }

        if (cb_drink_four.isChecked && et_drink_four.text.toString() != "") {
            totalMinuman += (et_drink_four.text.toString().toInt() * 6000)
        }

        tv_food_total.text = totalMakanan.toString()
        tv_drink_total.text = totalMinuman.toString()
        tv_total.text = (totalMinuman + totalMakanan).toString()
    }

    fun hitungKembali(view: View) {
        var grandTotal = tv_total.text.toString().toInt()
        var uangBayar = et_total_pay.text.toString()
        var uangBayar2 = 0

        if(uangBayar != "") {
            uangBayar2 = uangBayar.toInt()
        }

        if (uangBayar2 < grandTotal) {
            val myToast = Toast.makeText(this, "Maaf Uang bayarnya Kurang", Toast.LENGTH_SHORT)
            myToast.setGravity(Gravity.TOP, 0, 0)
            myToast.show()
        } else if (uangBayar2 == grandTotal) {
            val myToast =
                    Toast.makeText(this, "Terimakasih atas kedatangan Anda", Toast.LENGTH_SHORT)
            myToast.setGravity(Gravity.TOP, 0, 0)
            myToast.show()
        } else {
            var kembali = uangBayar2 - grandTotal
            val myToast =
                    Toast.makeText(this, "Terimakasih atas kedatangan anda \n" +
                    "Uang Kembalian sebesar Rp." + kembali, Toast.LENGTH_SHORT)
            myToast.setGravity(Gravity.TOP, 0, 0)
            myToast.show()
        }
    }

    // Punya Bang Zaen
//    fun calculateNow(view: View) {
//        total = 0
//
//        getSelectedFood()
//        getSelectedDrink()
//
//        tv_food_total.text = totalFood.toString()
//        tv_drink_total.text = totalDrink.toString()
//        tv_total.text  = total.toString()
//    }

//    private fun getSelectedFood() {
//        listFoodChecked = mapOf(
//                cb_food_one to 15000,
//                cb_drink_two to 12000,
//                cb_food_three to 16000,
//                cb_food_four to 15000
//        )
//
//        totalFood = 0
//
//        for ((checkedItem, price) in listFoodChecked) {
//            if (checkedItem.isChecked) {
//                var subTotalFood : Int
//                when(checkedItem) {
//                    cb_food_one -> {
//                        if (et_food_one.text.toString() != ""){
//                            subTotalFood = et_food_one.text.toString().toInt() * price
//                            totalFood += subTotalFood
//                        }
//                    }
//
//                    cb_food_two -> {
//                        if (et_food_two.text.toString() != ""){
//                            subTotalFood = et_food_two.text.toString().toInt() * price
//                            totalFood += subTotalFood
//                        }
//                    }
//
//                    cb_food_three -> {
//                        if (et_food_three.text.toString() != ""){
//                            subTotalFood = et_food_three.text.toString().toInt() * price
//                            totalFood += subTotalFood
//                        }
//                    }
//
//                    cb_food_four -> {
//                        if (et_food_four.text.toString() != ""){
//                            subTotalFood = et_food_four.text.toString().toInt() * price
//                            totalFood += subTotalFood
//                        }
//                    }
//                }
//            }
//        }
//
//        total += totalFood
//    }

//    private fun getSelectedDrink() {
//        listDrinkChecked = mapOf(
//                cb_drink_one to 5000,
//                cb_drink_two to 1000,
//                cb_drink_three to 3000,
//                cb_drink_four to 6000
//        )
//
//        totalDrink = 0
//
//        for ((checkedItem, price) in listDrinkChecked) {
//            if (checkedItem.isChecked) {
//                var subTotalDrink : Int
//                when(checkedItem) {
//                    cb_drink_one -> {
//                        if (et_drink_one.text.toString() != ""){
//                            subTotalDrink = et_drink_one.text.toString().toInt() * price
//                            totalDrink += subTotalDrink
//                        }
//                    }
//
//                    cb_drink_two -> {
//                        if (et_drink_two.text.toString() != ""){
//                            subTotalDrink = et_drink_two.text.toString().toInt() * price
//                            totalDrink += subTotalDrink
//                        }
//                    }
//
//                    cb_drink_three -> {
//                        if (et_drink_three.text.toString() != ""){
//                            subTotalDrink = et_drink_three.text.toString().toInt() * price
//                            totalDrink += subTotalDrink
//                        }
//                    }
//
//                    cb_drink_four -> {
//                        if (et_drink_four.text.toString() != ""){
//                            subTotalDrink = et_drink_four.text.toString().toInt() * price
//                            totalDrink += subTotalDrink
//                        }
//                    }
//                }
//            }
//        }
//
//        total += totalDrink
//    }

//    fun payNow(view: View) {
//        if (et_total_pay.text.toString() != "") {
//            var total_pay = et_total_pay.text.toString().toInt()
//            if(total_pay > total){
//                total_pay -= total
//                Toast.makeText(this, "Kembalian anda $total_pay", Toast.LENGTH_SHORT).show()
//            } else {
//                Toast.makeText(this, "Maaf Uang Anda Tidak Cukup.", Toast.LENGTH_SHORT).show()
//            }
//        } else {
//            Toast.makeText(this, "Anda belum Memasukkan Nominal", Toast.LENGTH_SHORT).show()
//        }
//    }
}