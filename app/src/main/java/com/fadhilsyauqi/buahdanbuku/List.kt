package com.fadhilsyauqi.buahdanbuku

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class List : AppCompatActivity() {
    private lateinit var lv_data: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list)
        lv_data = findViewById(R.id.lv_data)


        // ArrayAdapter
        val listHewan = arrayOf(
            "Semut", // index 0
            "Kucing", // index 1
            "Gajah",
            "Kelinci",
            "Ular",
            "Ikan",
            "Paus",
            "Panda" // index 7
        )

        // tampilkan ke dalam list view
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listHewan)
        lv_data.adapter = arrayAdapter

        // untuk bisa klik item nya
        lv_data.setOnItemClickListener { parent, view, position, id ->
            // munculkan dalam toast
            Toast.makeText(this, "Anda klik: ${listHewan[position]}", Toast.LENGTH_SHORT).show()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}