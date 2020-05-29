package com.example.sopt_together.fragment.category.menu

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt_together.R

class MenuAdapter(private val context : Context): RecyclerView.Adapter<RecyclerView.ViewHolder>()  {
    private val TYPE_ADD = 0
    private val TYPE_MENU = 1
    var datas = mutableListOf<MenuData>()

    override fun getItemViewType(position: Int): Int {

        return if(position%8 == 7) TYPE_ADD else TYPE_MENU
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if(viewType == TYPE_ADD){
            val view = LayoutInflater.from(context).inflate(R.layout.category_rv_menu_more, parent, false)
            return MoreViewHolder(view)
        } else{
            val view = LayoutInflater.from(context).inflate(R.layout.category_rv_menu_data, parent,false)
            return MenuViewHolder(view)
        }
    }

    override fun getItemCount(): Int {
        return datas.size + 1
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is MenuViewHolder){
            val menuViewHolder:MenuViewHolder = holder
            menuViewHolder.bind(datas[position])
        }else if(holder is MoreViewHolder){
            val moreViewHolder:MoreViewHolder = holder
        }
    }
}