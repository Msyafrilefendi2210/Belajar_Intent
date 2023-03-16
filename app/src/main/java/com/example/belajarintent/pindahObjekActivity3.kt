package com.example.belajarintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class pindahObjekActivity3 : AppCompatActivity() {
    private lateinit var tvpenerimaobjek : TextView
    companion object{
        const val EXTRA_CARS = "extra_cars"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_objek3)

        tvpenerimaobjek = findViewById(R.id.tv_penerima_objek)

        val cars: cars? = intent.getParcelableExtra<cars>(EXTRA_CARS) as cars
        val text = "Merek : ${cars?.merek.toString()} \nTahun: ${cars?.tahun.toString()} \nPlat: ${cars?.plat.toString()}"
        tvpenerimaobjek.text = text
    }
}