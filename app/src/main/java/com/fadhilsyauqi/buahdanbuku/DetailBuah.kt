package com.fadhilsyauqi.buahdanbuku

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailBuah : AppCompatActivity() {
    private lateinit var txtdetailbuah : TextView
    private lateinit var txtdetailokasi : TextView
    private lateinit var txtdetaildeskripsi : TextView
    private lateinit var imgdetailbuah : ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_buah)

        txtdetailbuah = findViewById(R.id.txtDetailBuah)
        imgdetailbuah = findViewById(R.id.imgDetailBuah)
        txtdetailokasi = findViewById(R.id.txtDetailLokasi)
        txtdetaildeskripsi = findViewById(R.id.txtDetailDeskripsi)


        //get data dari intent
        val detailTeks = intent.getStringExtra("nama")
        val detaillokasi = intent.getStringExtra("lokasi")
        val detaildesk = intent.getStringExtra("deskripsi")
        val detailImg = intent.getIntExtra("image",0)

        //set data ke widget
        txtdetailbuah.setText(detailTeks)
        txtdetailokasi.setText(detaillokasi)
        txtdetaildeskripsi.setText(detaildesk)
        imgdetailbuah.setImageResource(detailImg)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}