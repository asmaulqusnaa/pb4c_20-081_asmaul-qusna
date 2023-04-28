package com.example.bisadong

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var recyclerView : RecyclerView? = null
    private var heroAdapter : HeroAdapter? = null
    private var heroList = mutableListOf<Hero>()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        heroList = ArrayList()

        recyclerView = findViewById<View>(R.id.recyclerView) as RecyclerView
        heroAdapter = HeroAdapter(this@MainActivity, heroList)
        val layoutManager = GridLayoutManager(this,2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = heroAdapter


        siapkanData()


    }

    private fun siapkanData() {

        heroList.addAll(
            listOf(
                Hero("SuperKids Superman Kids", R.drawable.ucul),
                Hero("Batman Udah Gede", R.drawable.kmlucu),
                Hero("BatGirl bukan Batman", R.drawable.lucu),
                Hero("Captain Amerika Mini", R.drawable.captainamerika),
                Hero("Hulk Si Buto Ijo", R.drawable.hulk),
                Hero("Batman Anak Kelelawar", R.drawable.qusna),
                Hero("Spiderkids Anak Laba-laba", R.drawable.spiderman),
            )
        )


        heroAdapter!!.notifyDataSetChanged()
    }
}