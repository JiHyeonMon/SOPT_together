
package com.example.sopt_together.fragment.store.keyword

import com.example.sopt_together.R

internal class KeywordDummy {
    fun keywordList() : List<KeywordData>{
        return listOf(
            KeywordData(
                img_src = R.drawable.keywords_1
            ),
            KeywordData(
                img_src = R.drawable.keywords_2
            ),
            KeywordData(
                img_src = R.drawable.keywords_3
            ),
            KeywordData(
                img_src =R.drawable.keywords_4
            )
        )
    }
}