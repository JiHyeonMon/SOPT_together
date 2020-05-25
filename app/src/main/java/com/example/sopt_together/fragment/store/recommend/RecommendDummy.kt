package com.example.sopt_together.ui.fragment.store.recommend

internal class RecommendDummy {
    fun recommendList() : List<RecommendData>{
        return listOf(
            RecommendData(
                img_recommend = "",
                txt_recommand = "[한정세트] 오직 널 위해 담은 뚱카롱",
                star = true,
                txt_rating = "4.6"
            ),
            RecommendData(
                img_recommend = "",
                txt_recommand = "[두번째] 맛있는 음식",
                star = false,
                txt_rating = "3.3"
            ),
            RecommendData(
                img_recommend = "",
                txt_recommand = "[333] ㅁㄴㅇㄻㄴㅇㄹ",
                star = false,
                txt_rating = "1.2"
            )
        )
    }

}