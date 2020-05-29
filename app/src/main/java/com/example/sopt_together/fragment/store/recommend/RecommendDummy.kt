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
                img_recommend = "https://cdn.pixabay.com/photo/2016/12/06/15/26/christmas-cookies-1886760_1280.jpg",
                txt_recommand = "[쿠키세트] 쵹쵹한 별모양 쿠키",
                star = false,
                txt_rating = "3.3"
            ),
            RecommendData(
                img_recommend = "https://cdn.pixabay.com/photo/2013/02/21/19/06/beach-84533_1280.jpg",
                txt_recommand = "[여름] 여름여름",
                star = false,
                txt_rating = "1.2"
            )
        )
    }

}