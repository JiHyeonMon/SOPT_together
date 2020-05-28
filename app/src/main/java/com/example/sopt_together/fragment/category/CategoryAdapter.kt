
package com.example.sopt_together.fragment.category

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class CategoryAdapter(fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        return when(position){
            0->WorksFragment()
            else ->ClassFragment()
        }
    }

    override fun getCount()=2

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position){
            0 -> "작품"
            else -> {return "클래스"}
        }
    }

}