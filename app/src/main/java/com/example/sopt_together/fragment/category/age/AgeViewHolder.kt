package com.example.sopt_together.fragment.category.age

import android.graphics.Color
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt_together.R

class AgeViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {

    val age = itemView.findViewById<Button>(R.id.btn_age)
    var clicked:Boolean = false


    fun bind(ageData: AgeData) {
        age.text = ageData.age
        age.setOnClickListener {
            if (clicked == false) {
                age.isSelected = true
                age.setBackgroundResource(R.drawable.btn_selected)
                age.setTextColor(Color.parseColor("#ffffffff"))
                clicked = true

            } else {
                age.isSelected = false
                age.setBackgroundResource(R.drawable.btn_custom)
                age.setTextColor(Color.parseColor("#707070"))
                clicked = false
            }
        }
    }
}