package com.fadhilsyauqi.buahdanbuku.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fadhilsyauqi.buahdanbuku.DetailBuah
import com.fadhilsyauqi.buahdanbuku.R
import com.fadhilsyauqi.buahdanbuku.RecycleBuahActivity
import com.fadhilsyauqi.buahdanbuku.model.ModelBuah

class BuahAdapter (
    val itemList: ArrayList<ModelBuah>,
    val getActivity: RecycleBuahActivity
) :
    RecyclerView.Adapter<BuahAdapter.MyViewHolder>()
{

    class MyViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage : ImageView
        var itemNama : TextView

        init {
            itemImage = itemView.findViewById(R.id.gambar) as ImageView
            itemNama = itemView.findViewById(R.id.nama) as TextView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycle_images, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemImage.setImageResource(itemList[position].image)
        holder.itemNama.setText(itemList[position].nama)
        holder.itemView.setOnClickListener(){
            val intent = Intent(getActivity, DetailBuah::class.java)
            //kita put data untuk kita passed ke detail
            intent.putExtra("image", itemList[position].image)
            intent.putExtra("nama", itemList[position].nama)
            //tambahkan put extra untuk lokasi dan deskripsi
            intent.putExtra("lokasi", itemList[position].lokasi)
            intent.putExtra("deskripsi", itemList[position].deskripsi)

            getActivity.startActivity(intent)
        }
    }

}