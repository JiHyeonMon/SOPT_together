package com.example.sopt_together.ui.fragment.store.banner

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt_together.R

class BannerAdapter(private val context : Context) : RecyclerView.Adapter<BannerViewHolder>() {

    var datas = mutableListOf<BannerData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.store_rv_banner_data, parent, false)
        return BannerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: BannerViewHolder, position: Int) {
        holder.bind(datas[position])
    }

}