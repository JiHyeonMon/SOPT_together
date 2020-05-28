package com.example.sopt_together.ui.fragment.store.banner

internal class BannerDummy {
    fun bannerList() : List<BannerData>{
        return listOf(
            BannerData(
                txt_page = "1",
                img_banner = "https://cdn.pixabay.com/photo/2017/07/28/14/28/macarons-2548818_1280.jpg",
                txt_banner_main = "NEW!\n놓치기 아까운\n입점할인",
                txt_banner_tag = "#할인은_타이밍 #클릭클릭"
            ),
            BannerData(
                txt_page = "2",
                img_banner = "https://cdn.pixabay.com/photo/2016/11/22/18/52/cake-1850011__340.jpg",
                txt_banner_main = "Wow!\n두번째 예시\n: )",
                txt_banner_tag = "#두번째_해시태그 #hashtag"
            ),
            BannerData(
                txt_page ="3",
                img_banner = "https://cdn.pixabay.com/photo/2015/03/26/23/09/cake-pops-693645__340.jpg",
                txt_banner_main = "333\n세번째 글",
                txt_banner_tag = "#####"
            )
        )
    }

}