package com.example.sopt_together.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.sopt_together.fragment.category.CategoryFragment
import com.example.sopt_together.ui.fragment.store.StoreFragment

class MainPagerAdapter (fm:FragmentManager) :
        FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> StoreFragment()
            3 -> CategoryFragment()
            else -> StoreFragment()

        }
    }

    override fun getCount() = 5

}