package com.example.belajarintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var  btnpindah : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnpindah = findViewById(R.id.btn_pindah)
        val btnIntentData = findViewById<Button>(R.id.btn_pindah_data)
        btnpindah.setOnClickListener(this)
        btnIntentData.setOnClickListener(this)
        val btnIntenObjek = findViewById<Button>(R.id.btn_pindah_objek)
        btnIntenObjek.setOnClickListener(this)



    }

    override fun onClick(v:View){
        when(v.id){
            R.id.btn_pindah -> run {
                val pindahIntent = Intent(this@MainActivity,MainActivity2::class.java)
                startActivity(pindahIntent)

            }
            R.id.btn_pindah_data -> run {
                val IntentData = Intent (this@MainActivity,PindahDataActivity:: class.java)
                IntentData.putExtra(PindahDataActivity.EXTRA_TEXT, "Halo Ayo Belajar Kotlin")
                startActivity(IntentData)

            }
            R.id.btn_pindah_objek -> run{
                val cars = cars(
                    "Toyota Yaris",
                    2020,
                "BM 2020 SAR"
                )
                val IntentObjek = Intent(this@MainActivity, pindahObjekActivity3:: class.java)
                IntentObjek.putExtra(pindahObjekActivity3.EXTRA_CARS, cars)
                startActivity(IntentObjek)
            }
        }
    }
}