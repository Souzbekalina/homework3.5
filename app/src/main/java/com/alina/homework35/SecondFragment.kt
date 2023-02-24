package com.alina.homework35

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alina.homework35.databinding.FragmentFirstBinding
import com.alina.homework35.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

   private lateinit var binding: FragmentSecondBinding
   private var anotherResult=""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val aa=arguments
        if (aa !=null){
            binding.tvTwo.text=aa.getString("KEY")


        }
    }



}