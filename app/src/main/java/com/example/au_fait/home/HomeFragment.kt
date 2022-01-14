package com.example.au_fait.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.au_fait.R
import com.example.au_fait.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters

    private val viewModel:HomeViewModel by lazy {

        ViewModelProvider(this).get(HomeViewModel::class.java)

    }




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        val binding= FragmentHomeBinding.inflate(inflater)

        binding.lifecycleOwner= this

        binding.viewModel=viewModel



        return binding.root
    }


}