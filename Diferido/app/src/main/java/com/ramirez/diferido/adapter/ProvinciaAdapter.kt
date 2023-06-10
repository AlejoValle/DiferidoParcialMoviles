package com.ramirez.diferido.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ramirez.diferido.data.provincia

class ProvinciaAdapter (
    private val Click:(provincia)-> Unit
): RecyclerView.Adapter<ProvinciaAdapter.ViewholderProvincia>(){

    private val provincia:List<provincia> ?=null

 class ViewholderProvincia(private val binding: ItemProvinciaBinding) : RecyclerView.ViewHolder(binding.root){

     fun bind(provincias:provincia, Click:(provincia) -> Unit){

     }

 }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewholderProvincia {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewholderProvincia, position: Int) {
        TODO("Not yet implemented")
    }
}