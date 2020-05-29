package com.example.sopt_together.fragment.category

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager

import com.example.sopt_together.R
import com.example.sopt_together.fragment.category.age.AgeAdapter
import com.example.sopt_together.fragment.category.age.AgeData
import com.example.sopt_together.fragment.category.keyword.KeywordAdapter
import com.example.sopt_together.fragment.category.keyword.KeywordAdapter2
import com.example.sopt_together.fragment.category.keyword.KeywordData
import com.example.sopt_together.fragment.category.menu.MenuAdapter
import com.example.sopt_together.fragment.category.menu.MenuData
import com.example.sopt_together.fragment.category.menu.MenuDummy
import kotlinx.android.synthetic.main.fragment_works.*
import java.text.DecimalFormat


class WorksFragment : Fragment() {
    lateinit var keywordAdapter: KeywordAdapter
    lateinit var keywordAdapter2: KeywordAdapter2
    lateinit var ageAdapter: AgeAdapter
    lateinit var menuAdapter: MenuAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_works, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        keywordAdapter = KeywordAdapter(view.context)
        keywordAdapter.datas = mutableListOf<KeywordData>()
        rv_keyword.adapter = keywordAdapter
        loadDatas()

        keywordAdapter2 = KeywordAdapter2(view.context)
        keywordAdapter2.datas = mutableListOf<KeywordData>()
        rv_keyword2.adapter = keywordAdapter2
        loadDatas2()

        ageAdapter = AgeAdapter(view.context)
        ageAdapter.datas = mutableListOf<AgeData>()
        rv_age.adapter = ageAdapter
        loadDatas3()

        rv_menu.layoutManager = GridLayoutManager(this.context, 4)
        rv_menu.addItemDecoration(DividerItemDecoration(rv_menu.context, DividerItemDecoration.HORIZONTAL))
        rv_menu.addItemDecoration(DividerItemDecoration(rv_menu.context, DividerItemDecoration.VERTICAL))

        menuAdapter = MenuAdapter(view.context)
        menuAdapter.datas = MenuDummy().menuList() as MutableList<MenuData>
        menuAdapter.notifyDataSetChanged()
        rv_menu.adapter = menuAdapter
    }


    private fun loadDatas() {
        keywordAdapter.datas.apply {
            add(
                KeywordData(
                    keyword = "세련된"
                )
            )
            add(
                KeywordData(
                    keyword = "가벼운"
                )
            )
            add(
                KeywordData(
                    keyword = "유행하는"
                )
            )
            add(
                KeywordData(
                    keyword = "재미있는"
                )
            )
            add(
                KeywordData(
                    keyword = "오늘출발"
                )
            )
            add(
                KeywordData(
                    keyword = "특가상품"
                )
            )
            add(
                KeywordData(
                    keyword = "기타"
                )
            )
            add(
                KeywordData(
                    keyword = "기타"
                )
            )
            add(
                KeywordData(
                    keyword = "기타"
                )
            )
        }
        keywordAdapter.notifyDataSetChanged()
    }

    private fun loadDatas2() {
        keywordAdapter2.datas.apply {
            add(
                KeywordData(
                    keyword = "화려한"
                )
            )
            add(
                KeywordData(
                    keyword = "심플한"
                )
            )
            add(
                KeywordData(
                    keyword = "쓸데없는"
                )
            )
            add(
                KeywordData(
                    keyword = "실용적인"
                )
            )
            add(
                KeywordData(
                    keyword = "이벤트"
                )
            )
            add(
                KeywordData(
                    keyword = "기타"
                )
            )
            add(
                KeywordData(
                    keyword = "기타"
                )
            )
            add(
                KeywordData(
                    keyword = "기타"
                )
            )
            add(
                KeywordData(
                    keyword = "기타"
                )
            )
        }
        keywordAdapter2.notifyDataSetChanged()
    }

    private fun loadDatas3() {
        ageAdapter.datas.apply {
            add(
                AgeData(
                    age = "유아"
                )
            )
            add(
                AgeData(
                    age = "10대"
                )
            )
            add(
                AgeData(
                    age = "20대"
                )
            )
            add(
                AgeData(
                    age = "30대"
                )
            )
            add(
                AgeData(
                    age = "40대"
                )
            )
            add(
                AgeData(
                    age = "50대"
                )
            )
            add(
                AgeData(
                    age = "60대~"
                )
            )
        }
        ageAdapter.notifyDataSetChanged()
    }

    override fun onStart() {
        super.onStart()
        var  myFormatter = DecimalFormat("###,###")
        rangeSeekbar.setOnRangeSeekbarChangeListener { minValue, maxValue ->
            var max_formattedPrice = myFormatter.format(maxValue.toInt() * 1000)
            var min_formattedPrice = myFormatter.format(minValue.toInt() * 1000)

            minvalue.text= min_formattedPrice.toString()
            maxvalue.text = max_formattedPrice.toString()
        }
    }
}