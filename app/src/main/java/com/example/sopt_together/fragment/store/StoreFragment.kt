package com.example.sopt_together.ui.fragment.store

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import com.example.sopt_together.R
import com.example.sopt_together.fragment.store.keyword.KeywordAdapter
import com.example.sopt_together.fragment.store.keyword.KeywordData
import com.example.sopt_together.fragment.store.keyword.KeywordDummy
import com.example.sopt_together.fragment.store.keyword.KeywordItemDecoration
import com.example.sopt_together.ui.fragment.store.banner.BannerAdapter
import com.example.sopt_together.ui.fragment.store.banner.BannerData
import com.example.sopt_together.ui.fragment.store.banner.BannerDummy
import com.example.sopt_together.ui.fragment.store.recommend.RecommendAdapter
import com.example.sopt_together.ui.fragment.store.recommend.RecommendData
import com.example.sopt_together.ui.fragment.store.recommend.RecommendDummy
import kotlinx.android.synthetic.main.fragment_store.*


class StoreFragment : Fragment() {

    lateinit var bannerAdapter: BannerAdapter
    lateinit var recommandAdapter: RecommendAdapter
    lateinit var keywordAdapater : KeywordAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_store, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //상단 배너 띄우기
        bannerAdapter = BannerAdapter(view.context)
        bannerAdapter.datas = BannerDummy().bannerList() as MutableList<BannerData>
        rv_banner.adapter = bannerAdapter
        //사진 하나가 온전히 다 뜨기 고정
        val snapHelper_banner = PagerSnapHelper()
        snapHelper_banner.attachToRecyclerView(rv_banner)

        //추천
        recommandAdapter = RecommendAdapter(view.context)
        recommandAdapter.datas = RecommendDummy().recommendList() as MutableList<RecommendData>
        rv_recommendation.adapter = recommandAdapter
        //사진 하나가 온전히 다 뜨기 고정
        val snapHelper_reco = PagerSnapHelper()
        snapHelper_reco.attachToRecyclerView(rv_recommendation)

        rv_keyword.layoutManager = GridLayoutManager(this.context, 2)
        rv_keyword.addItemDecoration(KeywordItemDecoration(14))
        keywordAdapater = KeywordAdapter(view.context)
        keywordAdapater.datas = KeywordDummy().keywordList() as MutableList<KeywordData>
        rv_keyword.adapter = keywordAdapater
        val snapHelper_keyword = PagerSnapHelper()
        snapHelper_keyword.attachToRecyclerView(rv_keyword)

    }


}
