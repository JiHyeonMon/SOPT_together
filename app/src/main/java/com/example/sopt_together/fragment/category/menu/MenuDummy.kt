package com.example.sopt_together.fragment.category.menu

import com.example.sopt_together.R

internal class MenuDummy {
    fun menuList(): List<MenuData>{
        return listOf(
            MenuData(
                icStar = false,
                img_menu = R.drawable.cookie,
                txt_menu = "베이커리"
            ),
            MenuData(
                icStar = false,
                img_menu = R.drawable.hotdog,
                txt_menu = "식품"
            ),
            MenuData(
                icStar = false,
                img_menu = R.drawable.smoothie,
                txt_menu = "음료"
            ),
            MenuData(
                icStar = false,
                img_menu = R.drawable.pet,
                txt_menu = "반려동물"
            ),
            MenuData(
                icStar = false,
                img_menu = R.drawable.clothes,
                txt_menu = "의류"
            ),
            MenuData(
                icStar = false,
                img_menu = R.drawable.scarf,
                txt_menu = "패션잡화"
            ),
            MenuData(
                icStar = false,
                img_menu = R.drawable.perfume,
                txt_menu = "향수/화장품"
            )

        )
    }
}