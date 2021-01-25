package com.example.playmarket

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.playmarket.databinding.ItemPlayBinding
import com.example.playmarket.models.GeneralData
import com.example.playmarket.models.InPlayMarketAdapter

class PlayMarketAdapter(var listApp :ArrayList<GeneralData>) :RecyclerView.Adapter<PlayMarketAdapter.Vh>(){
    inner class Vh(itemView: View):RecyclerView.ViewHolder(itemView){
        fun onBind(generalData: GeneralData){
            ItemPlayBinding.bind(itemView).toolName.text = generalData.title
            val inPlayMarketAdapter = InPlayMarketAdapter(generalData.programm)
            ItemPlayBinding.bind(itemView).rvInto.adapter = inPlayMarketAdapter
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.item_play,parent,false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(listApp[position])
    }

    override fun getItemCount(): Int {
        return listApp.size
    }
}