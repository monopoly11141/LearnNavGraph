package com.example.learnnavgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.learnnavgraph.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        val etName = binding.etName
        val btnText = binding.btnText


        binding.btnText.setOnClickListener {
            val bundle = bundleOf("userInput" to etName.text.toString())
            it.findNavController().navigate(R.id.action_homeFragment_to_secondFragment, bundle)

        }
        // Inflate the layout for this fragment
        return binding.root
    }
}