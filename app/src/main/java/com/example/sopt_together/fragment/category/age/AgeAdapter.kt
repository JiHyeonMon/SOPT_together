package com.example.sopt_together.fragment.category.age

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt_together.R


class AgeAdapter(private val context : Context) : RecyclerView.Adapter<AgeViewHolder>() {

    var datas = mutableListOf<AgeData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AgeViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_age, parent, false)
        return AgeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: AgeViewHolder, position: Int) {
        holder.bind(datas[position])
    }

}