package com.example.sopt_together

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

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