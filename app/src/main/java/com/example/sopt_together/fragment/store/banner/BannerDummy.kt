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
                txt_banner_main = "Wow!\n이것은 초코케이크\n: )",
                txt_banner_tag = "#초코초코 #케이크케이크"
            ),
            BannerData(
                txt_page ="3",
                img_banner = "https://cdn.pixabay.com/photo/2015/03/26/23/09/cake-pops-693645__340.jpg",
                txt_banner_main = "이것은\n초코 사탕???",
                txt_banner_tag = "#####"
            ),
            BannerData(
                txt_page ="4",
                img_banner = "https://cdn.pixabay.com/photo/2018/11/01/06/33/leather-craft-3787281_1280.jpg",
                txt_banner_main = "가죽 공방\n그것이 궁금하다",
                txt_banner_tag = "#아이디어스"
            ),
            BannerData(
                txt_page ="5",
                img_banner = "https://cdn.pixabay.com/photo/2017/12/28/18/37/tee-3045922_1280.jpg",
                txt_banner_main = "여유로운\n티타임",
                txt_banner_tag = "#다함께 #차차차"
            ),
            BannerData(
                txt_page ="6",
                img_banner = "https://cdn.pixabay.com/photo/2016/11/29/01/36/bag-1866582_1280.jpg",
                txt_banner_main = "가방\n그리고 맥북",
                txt_banner_tag = "#아무사진"
            ),
            BannerData(
                txt_page ="7",
                img_banner = "https://cdn.pixabay.com/photo/2015/04/21/12/16/mac-733178_1280.jpg",
                txt_banner_main = "아이맥\n갖고싶다",
                txt_banner_tag = "#애플"
            ),
            BannerData(
                txt_page ="8",
                img_banner = "https://cdn.pixabay.com/photo/2017/06/02/18/24/fruit-2367029_1280.jpg",
                txt_banner_main = "여름이니까\n수박수박",
                txt_banner_tag = "#과일 #수박"
            )
        )
    }

}