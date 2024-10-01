package com.fadhilsyauqi.buahdanbuku.model

import com.fadhilsyauqi.buahdanbuku.R

data class ModelMovie(
    val image : Int,
    val nama : String
)

//mock data

object Mocklist1{

    fun getmodel() : List<ModelMovie>{
        val  itemModel1 = ModelMovie(
            R.drawable.avatar,
            "avatar"
        )

        val  itemModel2 = ModelMovie(
            R.drawable.batman,
            "batman"
        )

        val  itemModel3 = ModelMovie(
            R.drawable.hulk,
            "hulk"
        )

        val  itemModel4 = ModelMovie(
            R.drawable.inception,
            "inception"
        )

        val  itemModel5 = ModelMovie(
            R.drawable.jurassic_world,
            "jurassic word"
        )

        val  itemModel6 = ModelMovie(
            R.drawable.spider_man,
            "spiderman"
        )

        val  itemModel7 = ModelMovie(
            R.drawable.venom,
            "venom"
        )

        val  itemModel8 = ModelMovie(
            R.drawable.lucy,
            "lucy"
        )

        val itemList:ArrayList<ModelMovie> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)
        itemList.add(itemModel7)
        itemList.add(itemModel8)

        return itemList

    }
}
