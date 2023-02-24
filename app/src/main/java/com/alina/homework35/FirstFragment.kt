package com.alina.homework35

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import com.alina.homework35.databinding.ActivityMainBinding
import com.alina.homework35.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    private var count = 0
    private lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnButton.setOnClickListener {
            if (count<10 && binding.btnButton.text.equals("+1")) {
                count++
                binding.tvOne.text = count.toString()
            } else if (count > 0 && binding.btnButton.text.equals("-1")) {
                binding.btnButton.text = "-1"
                count--

                binding.tvOne.text =count.toString()
            } else if ( count==0 && binding.btnButton.text.equals("-1")){
                val  bundle=Bundle()
                bundle.putString("KEY",count.toString())
                var  secondFragment= SecondFragment()
                secondFragment.arguments=bundle
                requireActivity().supportFragmentManager.beginTransaction().replace(R.id.container,secondFragment)
                    .addToBackStack(null).commit()
            }
            when(count){
                10-> binding.btnButton.text=("-1")
            }
        }
    }

}


