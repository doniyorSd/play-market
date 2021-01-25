package com.example.playmarket.models

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.playmarket.R
import com.example.playmarket.databinding.ItemInplayBinding

class InPlayMarketAdapter(var inApp:ArrayList<Programm>) :RecyclerView.Adapter<InPlayMarketAdapter.Vh>(){

    inner class Vh(itemView: View):RecyclerView.ViewHolder(itemView){
        fun onBind(programm: Programm){
            ItemInplayBinding.bind(itemView).iv.setImageResource(programm.imgUri)
            ItemInplayBinding.bind(itemView).tv.text = programm.nameApp
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.item_inplay,parent,false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(inApp[position])
    }

    override fun getItemCount(): Int {
        return inApp.size
    }
}