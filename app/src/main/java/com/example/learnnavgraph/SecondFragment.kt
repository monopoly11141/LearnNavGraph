package com.example.learnnavgraph

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.learnnavgraph.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding : FragmentSecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false)

        val tvText = binding.tvText

        val userInput = requireArguments().getString("userInput")
        if(userInput.isNullOrBlank()) {
            Toast.makeText(activity, "Enter input", Toast.LENGTH_SHORT).show()
        }
        tvText.text = userInput
        // Inflate the layout for this fragment
        return binding.root
    }


}