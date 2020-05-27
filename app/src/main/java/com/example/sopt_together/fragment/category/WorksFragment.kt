package com.example.sopt_together.fragment.category

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.sopt_together.R
import kotlinx.android.synthetic.main.fragment_works.*
import java.text.DecimalFormat


class WorksFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_works, container, false)
    }

    override fun onStart() {
        super.onStart()
        var  myFormatter = DecimalFormat("###,###")
        rangeSeekbar.setOnRangeSeekbarChangeListener { minValue, maxValue ->
            var max_formattedPrice = myFormatter.format(maxValue.toInt() * 1000)
            var min_formattedPrice = myFormatter.format(minValue.toInt() * 1000)

            minvalue.text= min_formattedPrice.toString()
            maxvalue.text = max_formattedPrice.toString()
        }
    }
}
