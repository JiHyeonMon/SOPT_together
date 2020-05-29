package com.example.sopt_together.fragment.store.recommend

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class RecommendItemDecoration(private val spaceRight: Int): RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        with(outRect) {
            right = spaceRight
        }
    }
}
