package com.fadhilsyauqi.buahdanbuku.model

import android.content.Context
import com.fadhilsyauqi.buahdanbuku.R

data class ModelMovie(
    val gambar : Int,
    val nama : String,
    val sinopsis : String
)
object Movielist {
    fun getModel(): List<ModelMovie> {
        val itemModel1 = ModelMovie(
            R.drawable.avatar,
            "Avatar",
            "Film Avatar mengisahkan kehidupan manusia di masa depan yang mengalami krisis energi. Manusia harus mencari sumber energi baru dan berniat untuk mencari di planet lain bernama Pandora. Di sana, seorang mantan marinir yang lumpuh bernama Jake Sully ditugaskan untuk pergi ke bulan Pandora bersama dengan timnya. Pandora dihuni oleh suku Na'Vi yang termasuk spesies humanoid12."
        )
        val itemModel2 = ModelMovie(
            R.drawable.batman,
            "Batman",
            "Film The Batman mengisahkan perjuangan Bruce Wayne sebagai Batman untuk membawa keadilan, mengungkap misteri latar belakang keluarganya, dan menghadapi ancaman berbahaya di Gotham City. Dalam film ini, Batman mengejar Riddler, seorang pembunuh berantai yang menargetkan tokoh-tokoh politik dan warga elit. "
        )
        val itemModel3 = ModelMovie(
            R.drawable.end_game,
            "End Game",
            "Terdampar di luar angkasa tanpa persediaan makanan dan minuman, Tony Stark berusaha mengirim pesan untuk Pepper Potts dimana persediaan oksigen mulai menipis. Sementara itu para Avengers yang tersisa harus menemukan cara untuk mengembalikan 50% mahluk di seluruh dunia yang telah dilenyapkan oleh Thanos."
        )
        val itemModel4 = ModelMovie(
            R.drawable.hulk,
            "Hulk",
            "The Incredible Hulk adalah film yang menceritakan Bruce Banner, seorang ilmuwan yang terkena dampak radiasi sinar gamma yang menyebabkan dirinya berubah menjadi monster Hulk bertubuh besar saat detak jantungnya meningkat12."
        )
        val itemModel5 = ModelMovie(
            R.drawable.inception,
            "Inception",
            "Inception adalah sebuah film yang berkisah tentang perjalanan seorang pencuri ulung bernama Dom Cobb (diperankan oleh Leonardo DiCaprio) yang memiliki kemampuan khusus untuk mencuri rahasia dari dalam mimpi seseorang123."
        )
        val itemModel6 = ModelMovie(
            R.drawable.jumanji,
            "Jumanji",
            "Jumanji adalah sebuah permainan papan yang unik dan berbahaya123. Sinopsis film Jumanji yang paling terkenal adalah tentang empat remaja yang menemukan permainan konsol tua bernama Jumanji45. Mereka ditarik masuk ke dalam permainan tersebut dan menjadi avatar dewasa yang mereka pilih. Disana mereka harus bertahan hidup-hidup agar dapat kembali ke dunia nyata dengan selamat45."
        )
        val itemModel7 = ModelMovie(
            R.drawable.jurassic_world,
            "Jurassic World",
            "A new theme park, built on the original site of Jurassic Park, creates a genetically modified hybrid dinosaur, the Indominus Rex, which escapes containment and goes on a killing spree."
        )
        val itemModel8 = ModelMovie(
            R.drawable.lucy,
            "Lucy",
            "Lucy is a 2014 English-language French science fiction action film[5] written and directed by Luc Besson for his company EuropaCorp, and produced by his wife, Virginie Besson-Silla. It was shot in Taipei, Paris, and New York City. It stars Scarlett Johansson, Morgan Freeman, Choi Min-sik, and Amr Waked. Johansson portrays Lucy, a woman who gains psychokinetic abilities when a nootropic, psychedelic drug is absorbed into her bloodstream."
        )
        val itemModel9 = ModelMovie(
            R.drawable.spider_man,
            "Spider Man",
            "Film Spider-Man: Across The Spider-Verse mengisahkan tentang kehidupan dari Miles Morales (Shameik Moore). Dia dipertemukan lagi dengan Gwen Stacy (Hailee Steinfeld). Miles pergi multiverse lain dimana para Spiderman yang berasal dari berbagai semesta lain berada. Mereka sedang menghadapi ancaman dan musuh baru."
        )
        val itemModel10 = ModelMovie(
            R.drawable.venom,
            "Venom",
            "Venom is an action sci-fi movie that stars Tom Hardy as the titular Marvel anti-hero. Investigative journalist Eddie Brock investigates the Life Foundation, which is experimenting on alien lifeforms found on a comet1. After a faulty interview with the Life Foundation ruins his career, Eddie Brock's life takes a dark turn when he comes into contact with an alien symbiote and becomes Venom, a parasitic antihero234."
        )

        val itemList: ArrayList<ModelMovie> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)
        itemList.add(itemModel7)
        itemList.add(itemModel8)
        itemList.add(itemModel9)
        itemList.add(itemModel10)

        return itemList
    }
}