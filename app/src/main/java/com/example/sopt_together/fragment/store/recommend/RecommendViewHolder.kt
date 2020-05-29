package com.example.sopt_together.ui.fragment.store.recommend

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sopt_together.R

class RecommendViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){

    val img_recommend = itemView.findViewById<ImageView>(R.id.img_recommend)
    val txt_recommand = itemView.findViewById<TextView>(R.id.txt_recommand)
    val txt_rating = itemView.findViewById<TextView>(R.id.txt_rating)
    var star = itemView.findViewById<Button>(R.id.btn_star)

    fun bind(recommendData: RecommendData) {
        if(recommendData.img_recommend.isBlank()){
            img_recommend.setImageResource(R.drawable.recommendation)
        }else {
            Glide.with(itemView).load(recommendData.img_recommend).into(img_recommend)
        }
        txt_recommand.text = recommendData.txt_recommand
        txt_rating.text = recommendData.txt_rating

        if(recommendData.star){
            star.setBackgroundResource(R.drawable.ic_star_red)
        }else
            star.setBackgroundResource(R.drawable.ic_star_white)

        star.setOnClickListener {
            if(recommendData.star){
                star.setBackgroundResource(R.drawable.ic_star_white)
                recommendData.star = false
            }else {
                star.setBackgroundResource(R.drawable.ic_star_red)
                recommendData.star = true
            }
        }
    }
}