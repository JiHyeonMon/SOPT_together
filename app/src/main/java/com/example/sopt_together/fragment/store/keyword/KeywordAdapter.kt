package com.example.sopt_together.fragment.store.keyword

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt_together.R

class KeywordAdapter(private val context : Context): RecyclerView.Adapter<KeywordViewHolder>() {
    var datas = mutableListOf<KeywordData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KeywordViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.store_rv_keyword_data, parent, false)
        return KeywordViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: KeywordViewHolder, position: Int) {
        holder.bind(datas[position])
    }
}