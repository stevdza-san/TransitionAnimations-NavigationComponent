package com.example.testdemo.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.testdemo.R
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_home, container, false)

        view.navToFirst_btn.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_firstFragment)
        }

        view.navToSecond_btn.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_secondFragment)
        }

        return view
    }

}