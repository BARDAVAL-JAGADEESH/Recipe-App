package com.bardaval.recipesapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import androidx.room.RoomDatabase
import com.bardaval.recipesapp.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private lateinit var recyclerViewAdapter: Adapterpopular
    private lateinit var dataList: ArrayList<Recipe>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpRecyclerView()
        binding.search.setOnClickListener{
            startActivity(Intent(this,SearchActivity::class.java))
        }


        binding.salad.setOnClickListener{
            var myintent=Intent(this@HomeActivity,CategoryActivity::class.java)
            myintent.putExtra("TITLE","Salad")
            myintent.putExtra("CATEGORY","Salad")
           startActivity(myintent)
        }
        binding.maindish.setOnClickListener{
            var myintent=Intent(this@HomeActivity,CategoryActivity::class.java)
            myintent.putExtra("TITLE","Main Dish")
            myintent.putExtra("CATEGORY","Dish")
            startActivity(myintent)
        }
        binding.drinks.setOnClickListener {
            var myintent=Intent(this@HomeActivity,CategoryActivity::class.java)
            myintent.putExtra("TITLE","Drinks")
            myintent.putExtra("CATEGORY","Drinks")
            startActivity(myintent)
        }
        binding.desserts.setOnClickListener {
            var myintent=Intent(this@HomeActivity,CategoryActivity::class.java)
            myintent.putExtra("TITLE","Desserts")
            myintent.putExtra("CATEGORY","Desserts")
            startActivity(myintent)
        }

    }

    private fun setUpRecyclerView() {
        dataList = ArrayList()
        binding.recyclerViewPopular.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        var db = Room.databaseBuilder(this@HomeActivity, AppDatabase::class.java, "db_name")
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .createFromAsset("recipedata.db")
            .build()

        var daoObject = db.getDao()
        var recipes = daoObject.getAll()
        for (i in recipes!!.indices) {
            if (recipes[i]!!.category.contains("Popular")){
                dataList.add(recipes[i]!!)

            }
            recyclerViewAdapter=Adapterpopular(dataList,this)
            binding.recyclerViewPopular.adapter=recyclerViewAdapter
        }
    }
}