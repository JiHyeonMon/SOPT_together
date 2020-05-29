package com.example.sopt_together.fragment.store.keyword

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt_together.R

class KeywordViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val img_keyword = itemView.findViewById<ImageView>(R.id.img_keyword)

    fun bind(keywordData: KeywordData){
        img_keyword.setImageResource(keywordData.img_src)

    }
}