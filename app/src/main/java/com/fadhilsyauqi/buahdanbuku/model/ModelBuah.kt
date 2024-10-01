package com.fadhilsyauqi.buahdanbuku.model


import android.content.Context
import com.fadhilsyauqi.buahdanbuku.R

data class ModelBuah(
    val image: Int,
    val nama: String,
    val lokasi: String,
    val deskripsi: String
)

object MockList {
    fun getModel(contect: Context): List<ModelBuah> {
        val itemModel1 = ModelBuah(
            R.drawable.apple,
            nama = "apple",
            "indonesia",
            contect.getString(R.string.st_apel)
        )

        val itemModel2 = ModelBuah(
            R.drawable.grapes,
            nama = "anggur",
            "malaysia",
            contect.getString(R.string.st_pear)
        )

        val itemModel3 = ModelBuah(
            R.drawable.orange,
            nama = "jeruk",
            "Australia",
            contect.getString(R.string.st_jeruk)
        )

        val itemModel4 = ModelBuah(
            R.drawable.pear,
            nama = "pear",
            "Bali",
            contect.getString(R.string.st_apel)
        )

        val itemModel5 = ModelBuah(
            R.drawable.strawberry,
            nama = "strawbery",
            "malaysia",
            contect.getString(R.string.st_apel)
        )


        val itemList: ArrayList<ModelBuah> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)

        return itemList

    }
}
