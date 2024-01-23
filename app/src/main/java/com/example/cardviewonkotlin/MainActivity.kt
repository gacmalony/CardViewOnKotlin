package com.example.cardviewonkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val datas = ArrayList<Sports>()
    val adapter = MyAdapter(this,datas)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycle = findViewById<RecyclerView>(R.id.recyclerView)

        recycle.adapter = adapter
        recycle.layoutManager = LinearLayoutManager(this)
        recycle.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))

        createListData()
    }


    private fun createListData(){


        var sport1= Sports("Fussball", R.drawable.fussball)
        datas.add(sport1)

        var sport2= Sports("Basketball", R.drawable.basketball)
        datas.add(sport2)
        var sport3= Sports("Badminton", R.drawable.badminton)
        datas.add(sport3)
        var sport4= Sports("Tischtennis", R.drawable.tabletennis)
        datas.add(sport4)
        var sport5= Sports("Tennis", R.drawable.tennis)
        datas.add(sport5)

        adapter.notifyDataSetChanged()
    }
}