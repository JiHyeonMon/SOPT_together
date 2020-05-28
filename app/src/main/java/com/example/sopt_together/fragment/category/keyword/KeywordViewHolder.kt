package com.example.sopt_together.fragment.category.keyword

import android.graphics.Color
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt_together.R

class KeywordViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {

    val keyword = itemView.findViewById<Button>(R.id.btn_keyword)
    var clicked:Boolean = false


    fun bind(keywordData: KeywordData) {

        keyword.text = keywordData.keyword
        keyword.setOnClickListener {
            if (clicked == false) {
                keyword.isSelected = true
                keyword.setBackgroundResource(R.drawable.btn_selected)
                keyword.setTextColor(Color.parseColor("#ffffffff"))
                clicked = true

            } else {
                keyword.isSelected = false
                keyword.setBackgroundResource(R.drawable.btn_custom)
                keyword.setTextColor(Color.parseColor("#707070"))
                clicked = false
            }
        }


    }
}