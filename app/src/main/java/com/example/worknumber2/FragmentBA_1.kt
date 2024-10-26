package com.example.worknumber2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class FragmentBA_1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view= inflater.inflate(R.layout.fragment_b_a_1, container, false)
        parentFragmentManager.setFragmentResultListener("colorKey", this) { colorKey, bundle ->
            val color = bundle.getInt("color")
            view.setBackgroundColor(color)
        }

        return view
    }


}