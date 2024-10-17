package com.example.worknumber2

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FragmentBA : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_ba, container, false)
        val fragmentOpenBB = view.findViewById<Button>(R.id.fragmentBBbtn)
        fragmentOpenBB.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.fragment_container, FragmentBB()).addToBackStack(null)
                .commit()

        }
        parentFragmentManager.setFragmentResultListener("colorKey", this) { colorKey, bundle ->
            val color = bundle.getInt("color")
            view.setBackgroundColor(color)

        }
        return view
    }
}