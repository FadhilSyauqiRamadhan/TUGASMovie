package com.fadhilsyauqi.buahdanbuku.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fadhilsyauqi.buahdanbuku.R
import com.fadhilsyauqi.buahdanbuku.model.ModelBuku

class BukuAdapter (private val buku : List<ModelBuku>) :
    RecyclerView.Adapter<BukuAdapter.BukuAdapterHolder>() {

    class BukuAdapterHolder(view: View) : RecyclerView.ViewHolder(view){
        val txtJudul : TextView = view.findViewById(R.id.txtJudul)
        val txtPenulis : TextView = view.findViewById(R.id.txtPenerbit)
    }
    //untuk membuat layout list item sebagai
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BukuAdapter.BukuAdapterHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_recycle, parent, false)
        return BukuAdapterHolder(view)
    }

    //pengaturan data item pada setiap list recycle view
    override fun onBindViewHolder(holder: BukuAdapter.BukuAdapterHolder, position: Int) {
        holder.txtJudul.text = buku[position].judul
        holder.txtPenulis.text = buku[position].penerbit
    }

    override fun getItemCount(): Int {
        return buku.size
    }
}
