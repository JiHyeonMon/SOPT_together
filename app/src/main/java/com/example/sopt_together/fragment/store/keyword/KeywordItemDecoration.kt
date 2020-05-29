package com.example.sopt_together.fragment.store.keyword

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class KeywordItemDecoration(private val spaceHeight: Int): RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        with(outRect) {
            if (parent.getChildAdapterPosition(view) == 0 || parent.getChildAdapterPosition(view) == 1) {
                top = 0
            }
            left =  spaceHeight
            right = spaceHeight
            bottom = spaceHeight*2
        }
    }
}
