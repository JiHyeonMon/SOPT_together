package com.example.sopt_together.ui.fragment.store.banner

import android.annotation.SuppressLint
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sopt_together.R

class BannerViewHolder (itemView: View) :RecyclerView.ViewHolder(itemView){

    val img_banner = itemView.findViewById<ImageView>(R.id.img_banner)
    val txt_banner_main = itemView.findViewById<TextView>(R.id.txt_banner_main)
    val txt_banner_tag = itemView.findViewById<TextView>(R.id.txt_banner_tag)

    @SuppressLint("ResourceType")
    fun bind(bannerData: BannerData) {
        Glide.with(itemView).load(bannerData.img_banner).into(img_banner)
        txt_banner_main.text = bannerData.txt_banner_main
        txt_banner_tag.text = bannerData.txt_banner_tag
    }
}