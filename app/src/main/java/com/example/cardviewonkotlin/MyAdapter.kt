package com.example.cardviewonkotlin

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val context: Context, private var item_list:List<Sports>):
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.card_list, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return item_list.size
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val sports = item_list.get(position)
        holder.setDatas(sports)
    }


    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val text: TextView
        private val img: ImageView

        init {
            text = itemView.findViewById<TextView>(R.id.textView)
            img = itemView.findViewById(R.id.imageView2)

            itemView.setOnClickListener() {
                Toast.makeText(
                    itemView.context,
                    "You clicked ${item_list[adapterPosition].text}, page will be ready soon!",
                    Toast.LENGTH_SHORT
                ).show()

                val i = Intent(context, DetailsActivity::class.java)
                i.putExtra("name", "${item_list[adapterPosition].text}")
                context.startActivity(i)

            }




        }
        fun setDatas(sports: Sports) {
            text.setText(sports.text)
            img.setImageResource(sports.img)


        }


    }
}