package com.example.sopt_together.fragment.category.menu

import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt_together.R

class MenuViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val img_menu= itemView.findViewById<ImageView>(R.id.img_menu)
    val tv_menu = itemView.findViewById<TextView>(R.id.tv_menu)
    val btn_star = itemView.findViewById<Button>(R.id.btn_star)
    var clicked:Boolean = false


    fun bind(menuData: MenuData){
        img_menu.setImageResource(menuData.img_menu)
        tv_menu.text = menuData.txt_menu
//        if(menuData.icStar){
////            btn_star.setBackgroundResource(R.drawable.star_red)
////        }else{
////            btn_star.setBackgroundResource(R.drawable.star_white)
////        }
        btn_star.setOnClickListener {
            val pos = adapterPosition;
            if(pos != RecyclerView.NO_POSITION){
                if(clicked == false){
                    btn_star.setBackgroundResource(R.drawable.star_red)
                    clicked = true
                }
                else{
                    btn_star.setBackgroundResource(R.drawable.star_white)
                    clicked = false
                }
            }


            //위랑 동일한 코드
//            if(menuData.icStar){    //색있는 별표를 클릭 시
//                btn_star.setBackgroundResource(R.drawable.star_white)
//                menuData.icStar = false
//            }else{
//                btn_star.setBackgroundResource(R.drawable.star_red)
//                menuData.icStar = true
//            }



        }
    }
}