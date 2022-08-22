package com.iyilmaz.fragmenttutorial3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.iyilmaz.fragmenttutorial3.databinding.FragmentShowInfoBinding

class ShowInfoFragment : Fragment() {

    private var _binding: FragmentShowInfoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentShowInfoBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.tvShowInfo.text = "Name: ${UniversalVariables.name}" +
                "\nNumber: ${UniversalVariables.phone}" +
                "\nEmail: ${UniversalVariables.email}" +
                "\nCity: ${UniversalVariables.city}"

        binding.button3.setOnClickListener {
            findNavController().navigate(R.id.action_showInfoFragment_to_editInfoFragment)
        }
        return view
    }

}