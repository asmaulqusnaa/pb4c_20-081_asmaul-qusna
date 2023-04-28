package com.example.tprv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter=adapter
    }

    private fun init() {
        recyclerView = findViewById(R.id.recycler_view)

        var data = ArrayList<tprv>()
        data.add(tprv(R.drawable.ucul, "Mauliddya Putri", "udah mengerjakan?"))
        data.add(tprv(R.drawable.superhero, "Mauliddya Putri", "Ayo Makan!!"))
        data.add(tprv(R.drawable.kmlucu, "Mauliddya Putri", "Bismillah bisa!!"))
        data.add(tprv(R.drawable.hulk, "Mauliddya Putri", "buka puasa dimana?"))
        data.add(tprv(R.drawable.ucul, "Mauliddya Putri", "Mau makan apa?"))
        data.add(tprv(R.drawable.superhero, "Mauliddya Putri", "Jangan Lupa Sholat!!"))
        data.add(tprv(R.drawable.kmlucu, "Mauliddya Putri", "Ayo belajar modul3"))
        data.add(tprv(R.drawable.hulk, "Mauliddya Putri", "Assalamualaikum Qusna"))
        data.add(tprv(R.drawable.ucul, "Mauliddya Putri", "Aku didepan!!"))
        data.add(tprv(R.drawable.superhero, "Mauliddya Putri", "haloo"))
        data.add(tprv(R.drawable.kmlucu, "Mauliddya Putri", "Ojok nakal!!"))
        data.add(tprv(R.drawable.hulk, "Mauliddya Putri", "Qusna Cantik"))
        data.add(tprv(R.drawable.ucul, "Mauliddya Putri", "kamu dimana?"))
        data.add(tprv(R.drawable.superhero, "Mauliddya Putri", "kamu ngga papa?"))
        data.add(tprv(R.drawable.kmlucu, "Mauliddya Putri", "Putri kangen Qusna"))
        data.add(tprv(R.drawable.ucul, "Mauliddya Putri", "udah mengerjakan?"))
        data.add(tprv(R.drawable.superhero, "Mauliddya Putri", "Ayo Makan!!"))
        data.add(tprv(R.drawable.kmlucu, "Mauliddya Putri", "Bismillah bisa!!"))
        data.add(tprv(R.drawable.hulk, "Mauliddya Putri", "buka puasa dimana?"))
        data.add(tprv(R.drawable.ucul, "Mauliddya Putri", "Mau makan apa?"))
        data.add(tprv(R.drawable.superhero, "Mauliddya Putri", "Jangan Lupa Sholat!!"))
        data.add(tprv(R.drawable.kmlucu, "Mauliddya Putri", "Ayo belajar modul3"))
        data.add(tprv(R.drawable.hulk, "Mauliddya Putri", "Assalamualaikum Qusna"))
        data.add(tprv(R.drawable.ucul, "Mauliddya Putri", "Aku didepan!!"))
        data.add(tprv(R.drawable.superhero, "Mauliddya Putri", "haloo"))
        data.add(tprv(R.drawable.kmlucu, "Mauliddya Putri", "Ojok nakal!!"))
        data.add(tprv(R.drawable.hulk, "Mauliddya Putri", "Qusna Cantik"))
        data.add(tprv(R.drawable.ucul, "Mauliddya Putri", "kamu dimana?"))
        data.add(tprv(R.drawable.superhero, "Mauliddya Putri", "kamu ngga papa?"))
        data.add(tprv(R.drawable.kmlucu, "Mauliddya Putri", "Putri kangen Qusna"))

        adapter=MyAdapter(data)
    }
}