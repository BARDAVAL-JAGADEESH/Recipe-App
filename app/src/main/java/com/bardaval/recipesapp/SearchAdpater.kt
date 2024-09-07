package com.bardaval.recipesapp

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bardaval.recipesapp.databinding.SearchRecylerViewBinding
import com.bumptech.glide.Glide

class SearchAdpater (var dataList: ArrayList<Recipe>,var context: Context):RecyclerView.Adapter<SearchAdpater.ViewHolder>() {
    inner class  ViewHolder(var binding:SearchRecylerViewBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       var view=SearchRecylerViewBinding.inflate(LayoutInflater.from(context),parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
     return dataList.size
    }
    @SuppressLint("NotifyDataSetChanged")
    fun filterList(filterList: ArrayList<Recipe>){
        dataList=filterList
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       Glide.with(context).load(dataList.get(position).img).into(holder.binding.searchImg)
        holder.binding.searchTxt.text=dataList.get(position).tittle
    }

}






