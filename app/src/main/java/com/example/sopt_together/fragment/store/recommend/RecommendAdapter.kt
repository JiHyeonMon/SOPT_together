package com.example.sopt_together.ui.fragment.store.recommend

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt_together.R

class RecommendAdapter(private val context : Context) : RecyclerView.Adapter<RecommendViewHolder>() {

    var datas = mutableListOf<RecommendData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecommendViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.store_rv_recommend_data, parent, false)
        return RecommendViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: RecommendViewHolder, position: Int) {
        holder.bind(datas[position])
    }

}