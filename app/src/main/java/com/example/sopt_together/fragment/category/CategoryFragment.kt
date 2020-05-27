package com.example.sopt_together.fragment.category

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.sopt_together.R
import kotlinx.android.synthetic.main.fragment_category.*

class CategoryFragment : Fragment() {


    lateinit var categoryAdapter: CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category, container, false)


    }

    override fun onStart() {
        super.onStart()

        categoryAdapter = CategoryAdapter(childFragmentManager)
        viewpager_category.adapter = categoryAdapter
        tablayout_category.setupWithViewPager(viewpager_category)

    }
}
