package com.iyilmaz.fragmenttutorial3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.iyilmaz.fragmenttutorial3.UniversalVariables.city
import com.iyilmaz.fragmenttutorial3.UniversalVariables.email
import com.iyilmaz.fragmenttutorial3.databinding.FragmentEditInfoBinding
import com.iyilmaz.fragmenttutorial3.UniversalVariables.name
import com.iyilmaz.fragmenttutorial3.UniversalVariables.phone

class EditInfoFragment : Fragment() {

    private var _binding: FragmentEditInfoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentEditInfoBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.button.setOnClickListener {
            name = binding.etName.text.toString()
            phone = binding.etPhoneNumber.text.toString()
            email = binding.etEmail.text.toString()
            city = binding.etCity.text.toString()
            findNavController().navigate(R.id.action_editInfoFragment_to_showInfoFragment)
        }
        return view
    }

}