package com.bardaval.recipesapp

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bardaval.recipesapp.databinding.CatagoryRecyclerViewBinding
import com.bumptech.glide.Glide

class CategoryAdapter (var dataList:ArrayList<Recipe>,var context: Context):RecyclerView.Adapter<CategoryAdapter.ViewHolder>(){

    inner class ViewHolder(var binding:CatagoryRecyclerViewBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
     var binding=CatagoryRecyclerViewBinding.inflate(LayoutInflater.from(context),parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
       return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
Glide.with(context).load(dataList.get(position).img).into(holder.binding.img)
        holder.binding.title.text=dataList.get(position).tittle
        /*var temp=dataList.get(position).img.split("\n").dropLastWhile { it.isEmpty() }.toTypedArray()
        holder.binding.time.text=temp[0]*/
    }
}