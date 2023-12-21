package com.example.lab3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.lab3.adapter.ProductAdapter
import com.example.lab3.databinding.ActivityMainBinding
import com.example.lab3.models.Product
import com.example.lab3.models.Staff
import com.example.lab3.models.StoreEntity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val array = arrayOf(Staff(0, "Ludmila", 500.0f),
            Staff(1, "Gennadiy", 1000f),
            Product(2, "GPU", 799.99f, 15),
            Product(3, "Monitor", 250.0f, 8),
            Staff(4, "Sergey", 800.0f))
        binding.myRecyclerList.layoutManager = LinearLayoutManager(this)
        binding.myRecyclerList.adapter = ProductAdapter(array)
    }
}