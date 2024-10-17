package com.example.worknumber2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlin.random.Random


class FragmentBB : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_bb, container, false)
        val sendColorbtn=view.findViewById<Button>(R.id.sendColor)
        sendColorbtn.setOnClickListener {
            val randomColor= Random.nextInt(0xFFFFFF) or (0xFF shl 24)
            val bundle=Bundle()
            bundle.putInt("color",randomColor)
            parentFragmentManager.setFragmentResult("colorKey",bundle)
            parentFragmentManager.popBackStack()

        }
        return view
    }


}