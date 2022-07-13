package com.hendro.rv_dasar_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.hendro.rv_dasar_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val sepedaList = ArrayList<ModelSepeda>()
    private lateinit var sepedaAdapter: SepedaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setRV()
    }

    public fun setRV(){
        sepedaAdapter = SepedaAdapter(sepedaList)
        val layoutManager = LinearLayoutManager(applicationContext)
        binding.rv.layoutManager = layoutManager
        binding.rv.itemAnimator = DefaultItemAnimator()
        binding.rv.adapter = sepedaAdapter

        prepareDataSepeda()
    }

    private fun prepareDataSepeda() {
        var sepeda = ModelSepeda("Sepeda AA", "BMX", "2012")
        sepedaList.add(sepeda)
        sepeda = ModelSepeda("Sepeda BB", "BMX", "2013")
        sepedaList.add(sepeda)
        sepeda = ModelSepeda("Sepeda CC", "BMX", "2014")
        sepedaList.add(sepeda)
        sepeda = ModelSepeda("Sepeda DD", "BMX", "2015")
        sepedaList.add(sepeda)
        sepeda = ModelSepeda("Sepeda EE", "BMX", "2016")
        sepedaList.add(sepeda)
        sepeda = ModelSepeda("Sepeda FF", "BMX", "2017")
        sepedaList.add(sepeda)
        sepeda = ModelSepeda("Sepeda GG", "BMX", "2018")
        sepedaList.add(sepeda)
        sepeda = ModelSepeda("Sepeda HH", "BMX", "2019")
        sepedaList.add(sepeda)

        sepedaAdapter.notifyDataSetChanged()
    }

}