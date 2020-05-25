package com.example.sopt_together.ui.fragment.store.banner

internal class BannerDummy {
    fun bannerList() : List<BannerData>{
        return listOf(
            BannerData(
                page = 1,
                img_banner = "",
                txt_banner_main = "NEW!\n놓치기 아까운\n입점할인",
                txt_banner_tag = "#할인은_타이밍 #클릭클릭"
            ),
            BannerData(
                page = 2,
                img_banner = "",
                txt_banner_main = "Wow!\n두번째 예시\n: )",
                txt_banner_tag = "#두번째_해시태그 #hashtag"
            ),
            BannerData(
                page = 3,
                img_banner = "",
                txt_banner_main = "333\n세번째 글",
                txt_banner_tag = "#####"
            )
        )
    }

}