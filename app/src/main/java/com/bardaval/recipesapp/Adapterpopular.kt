package com.bardaval.recipesapp

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bardaval.recipesapp.databinding.PopuarItemsListBinding
import com.bumptech.glide.Glide

class Adapterpopular(var dataList:ArrayList<Recipe>,var context: Context):RecyclerView.Adapter<Adapterpopular.ViewHolder>() {


    inner  class  ViewHolder(var binding: PopuarItemsListBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        var binding=PopuarItemsListBinding.inflate(LayoutInflater.from(context),parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
      return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.popularImage
        Glide.with(context).load(dataList.get(position).img).into(holder.binding.popularImage)
        holder.binding.popularText.text=dataList.get(position).tittle
        var time=dataList.get(position).ing.split("\n".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        holder.binding.popularTime.text=time.get(0)
    }
}