package com.example.sopt_together.ui.fragment.store

import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt_together.R
import com.example.sopt_together.fragment.store.keyword.KeywordAdapter
import com.example.sopt_together.fragment.store.keyword.KeywordData
import com.example.sopt_together.fragment.store.keyword.KeywordDummy
import com.example.sopt_together.fragment.store.keyword.KeywordItemDecoration
import com.example.sopt_together.fragment.store.recommend.RecommendItemDecoration
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

    val handler = Handler()

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
        rv_recommendation.addItemDecoration(RecommendItemDecoration( 20))
        //사진 하나가 온전히 다 뜨기 고정
        val snapHelper_reco = PagerSnapHelper()
        snapHelper_reco.attachToRecyclerView(rv_recommendation)


        rv_keyword.layoutManager = GridLayoutManager(this.context, 2)
        rv_keyword.addItemDecoration(KeywordItemDecoration(14))
        keywordAdapater = KeywordAdapter(view.context)
        keywordAdapater.datas = KeywordDummy().keywordList() as MutableList<KeywordData>
        rv_keyword.adapter = keywordAdapater

//        이 recyclerView엔 필요없을 거 같아요!
//        val snapHelper_keyword = PagerSnapHelper()
//        snapHelper_keyword.attachToRecyclerView(rv_keyword)

    }

    var i = 8

    //계속 돌아가는 코드, 자동으로 recyclerview 넘기기.
    val runnableCode =
        Runnable {
            if(i>0) {
                rv_banner.smoothScrollToPosition(bannerAdapter.itemCount - i)
                txt_page.text = (bannerAdapter.itemCount - i + 1).toString()
                i--
                }else{
                i=8
                rv_banner.smoothScrollToPosition(bannerAdapter.itemCount - i)
                txt_page.text = (bannerAdapter.itemCount - i + 1).toString()
            }
            onResume()
        }

    //onResume을 통해 runnableCode반복 수행
    override fun onResume() {
        super.onResume()
        handler.removeCallbacks(runnableCode)
        handler.postDelayed(runnableCode,4000)
    }
}
