package com.example.sopt_together.ui.fragment.store

import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt_together.R
import com.example.sopt_together.ui.fragment.store.banner.BannerAdapter
import com.example.sopt_together.ui.fragment.store.banner.BannerData
import com.example.sopt_together.ui.fragment.store.banner.BannerDummy
import com.example.sopt_together.ui.fragment.store.banner.BannerViewHolder
import com.example.sopt_together.ui.fragment.store.recommend.RecommendAdapter
import com.example.sopt_together.ui.fragment.store.recommend.RecommendData
import com.example.sopt_together.ui.fragment.store.recommend.RecommendDummy
import kotlinx.android.synthetic.main.fragment_store.*
import kotlinx.android.synthetic.main.fragment_store.view.*


class StoreFragment : Fragment() {

    lateinit var bannerAdapter: BannerAdapter
    lateinit var recommandAdapter: RecommendAdapter

    val handler = Handler()

    var i = 3

    val runnableCode =
        Runnable {
            if(i>0) {
//                var page = txt_page.text.toString().toInt()

                rv_banner.scrollToPosition(bannerAdapter.itemCount - i)
//                rv_banner.scrollToPosition(page)

                Log.d("page", (bannerAdapter.itemCount - i).toString())
                txt_page.text = (bannerAdapter.itemCount - i + 1).toString()

                i--
            }else{
                i=3
            }
            onResume()
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_store, container, false)
    }

    @RequiresApi(Build.VERSION_CODES.P)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //상단 배너 띄우기
        bannerAdapter = BannerAdapter(view.context)

        bannerAdapter.datas = BannerDummy().bannerList() as MutableList<BannerData>
        rv_banner.adapter = bannerAdapter
        rv_banner.layoutManager = LinearLayoutManager(
            context, LinearLayoutManager.HORIZONTAL, false
        )
        //사진 하나가 온전히 다 뜨기 고정
        val snapHelper_banner = PagerSnapHelper()
        snapHelper_banner.attachToRecyclerView(rv_banner)


        txt_page.text = "1"
        //banner scroll시 page 수 변화
        rv_banner.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)

                txt_page.text = ((rv_banner.layoutManager as LinearLayoutManager).findFirstVisibleItemPosition()+1).toString()

            }
        })

        handler.postDelayed(runnableCode, 1000)

        //추천
        recommandAdapter = RecommendAdapter(view.context)
        recommandAdapter.datas = RecommendDummy().recommendList() as MutableList<RecommendData>
        rv_recommendation.adapter = recommandAdapter
        //사진 하나가 온전히 다 뜨기 고정
        val snapHelper_reco = PagerSnapHelper()
        snapHelper_reco.attachToRecyclerView(rv_recommendation)

    }

    override fun onResume() {
        super.onResume()
        handler.postDelayed(runnableCode,4000)
    }
}

