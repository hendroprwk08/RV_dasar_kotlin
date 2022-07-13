package com.hendro.rv_dasar_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hendro.rv_dasar_kotlin.SepedaAdapter.MyViewHolder
import com.hendro.rv_dasar_kotlin.databinding.ItemRowLayoutBinding

class SepedaAdapter (private var sepedaList: List<ModelSepeda>) :
    RecyclerView.Adapter<MyViewHolder>() {

    //binding layout: 1. ganti "binding: ItemRowLayoutBinding" dan "binding.root"
    class MyViewHolder(val binding: ItemRowLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        //binding layout: 2. tarik layout
        val binding = ItemRowLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //binding layout: 3. letakkan nilai pada layout
        with(holder){
            with(sepedaList[position]){
                binding.nama.text = this.getNama()
                binding.tahun.text = this.getTahun()
                binding.jenis.text = this.getJenis()
            }
        }
    }

    override fun getItemCount(): Int {
        return sepedaList.size
    }
}