package com.example.gottips_2022

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.gottips_2022.databinding.FragmentInputPartnersBinding
import com.example.gottips_2022.model.SharedViewModel




class InputPartners : Fragment() {

    private val viewModel1: SharedViewModel by activityViewModels()
    private var binding1: FragmentInputPartnersBinding? = null
    private val binding get() = binding1!!

    // Variable & function necessary to dynamically update outputTotalHours[TextView]
    private fun calculateSumHours() {
        var currentSumHours = 0.00

        if (binding.hours1.text.isNotEmpty()) { currentSumHours += binding.hours1.text.toString().toDouble() }
        if (binding.hours2.text.isNotEmpty()) { currentSumHours += binding.hours2.text.toString().toDouble() }
        if (binding.hours3.text.isNotEmpty()) { currentSumHours += binding.hours3.text.toString().toDouble() }
        if (binding.hours4.text.isNotEmpty()) { currentSumHours += binding.hours4.text.toString().toDouble() }
        if (binding.hours5.text.isNotEmpty()) { currentSumHours += binding.hours5.text.toString().toDouble() }
        if (binding.hours6.text.isNotEmpty()) { currentSumHours += binding.hours6.text.toString().toDouble() }
        if (binding.hours7.text.isNotEmpty()) { currentSumHours += binding.hours7.text.toString().toDouble() }
        if (binding.hours8.text.isNotEmpty()) { currentSumHours += binding.hours8.text.toString().toDouble() }
        if (binding.hours9.text.isNotEmpty()) { currentSumHours += binding.hours9.text.toString().toDouble() }
        if (binding.hours10.text.isNotEmpty()) { currentSumHours += binding.hours10.text.toString().toDouble() }
        if (binding.hours11.text.isNotEmpty()) { currentSumHours += binding.hours11.text.toString().toDouble() }
        if (binding.hours12.text.isNotEmpty()) { currentSumHours += binding.hours12.text.toString().toDouble() }
        if (binding.hours13.text.isNotEmpty()) { currentSumHours += binding.hours13.text.toString().toDouble() }
        if (binding.hours14.text.isNotEmpty()) { currentSumHours += binding.hours14.text.toString().toDouble() }
        if (binding.hours15.text.isNotEmpty()) { currentSumHours += binding.hours15.text.toString().toDouble() }
        if (binding.hours16.text.isNotEmpty()) { currentSumHours += binding.hours16.text.toString().toDouble() }
        if (binding.hours17.text.isNotEmpty()) { currentSumHours += binding.hours17.text.toString().toDouble() }
        if (binding.hours18.text.isNotEmpty()) { currentSumHours += binding.hours18.text.toString().toDouble() }
        if (binding.hours19.text.isNotEmpty()) { currentSumHours += binding.hours19.text.toString().toDouble() }
        if (binding.hours20.text.isNotEmpty()) { currentSumHours += binding.hours20.text.toString().toDouble() }
        if (binding.hours21.text.isNotEmpty()) { currentSumHours += binding.hours21.text.toString().toDouble() }
        if (binding.hours22.text.isNotEmpty()) { currentSumHours += binding.hours22.text.toString().toDouble() }
        if (binding.hours23.text.isNotEmpty()) { currentSumHours += binding.hours23.text.toString().toDouble() }
        if (binding.hours24.text.isNotEmpty()) { currentSumHours += binding.hours24.text.toString().toDouble() }
        if (binding.hours25.text.isNotEmpty()) { currentSumHours += binding.hours25.text.toString().toDouble() }
        if (binding.hours26.text.isNotEmpty()) { currentSumHours += binding.hours26.text.toString().toDouble() }
        if (binding.hours27.text.isNotEmpty()) { currentSumHours += binding.hours27.text.toString().toDouble() }
        if (binding.hours28.text.isNotEmpty()) { currentSumHours += binding.hours28.text.toString().toDouble() }
        if (binding.hours29.text.isNotEmpty()) { currentSumHours += binding.hours29.text.toString().toDouble() }
        if (binding.hours30.text.isNotEmpty()) { currentSumHours += binding.hours30.text.toString().toDouble() }

        binding.outputTotalHours.text = currentSumHours.toString()
        viewModel1.setTotalHours(currentSumHours.toString())

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding1 = FragmentInputPartnersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Getting and displaying partnerNames & partnerHours from ShareViewModel
        binding.partner1.setText(viewModel1.getNames()?.get(0))
        binding.partner2.setText(viewModel1.getNames()?.get(1))
        binding.partner3.setText(viewModel1.getNames()?.get(2))
        binding.partner4.setText(viewModel1.getNames()?.get(3))
        binding.partner5.setText(viewModel1.getNames()?.get(4))
        binding.partner6.setText(viewModel1.getNames()?.get(5))
        binding.partner7.setText(viewModel1.getNames()?.get(6))
        binding.partner8.setText(viewModel1.getNames()?.get(7))
        binding.partner9.setText(viewModel1.getNames()?.get(8))
        binding.partner10.setText(viewModel1.getNames()?.get(9))
        binding.partner11.setText(viewModel1.getNames()?.get(10))
        binding.partner12.setText(viewModel1.getNames()?.get(11))
        binding.partner13.setText(viewModel1.getNames()?.get(12))
        binding.partner14.setText(viewModel1.getNames()?.get(13))
        binding.partner15.setText(viewModel1.getNames()?.get(14))
        binding.partner16.setText(viewModel1.getNames()?.get(15))
        binding.partner17.setText(viewModel1.getNames()?.get(16))
        binding.partner18.setText(viewModel1.getNames()?.get(17))
        binding.partner19.setText(viewModel1.getNames()?.get(18))
        binding.partner20.setText(viewModel1.getNames()?.get(19))
        binding.partner21.setText(viewModel1.getNames()?.get(20))
        binding.partner22.setText(viewModel1.getNames()?.get(21))
        binding.partner23.setText(viewModel1.getNames()?.get(22))
        binding.partner24.setText(viewModel1.getNames()?.get(23))
        binding.partner25.setText(viewModel1.getNames()?.get(24))
        binding.partner26.setText(viewModel1.getNames()?.get(25))
        binding.partner27.setText(viewModel1.getNames()?.get(26))
        binding.partner28.setText(viewModel1.getNames()?.get(27))
        binding.partner29.setText(viewModel1.getNames()?.get(28))
        binding.partner30.setText(viewModel1.getNames()?.get(29))

        binding.hours1.setText(viewModel1.getHours()?.get(0))
        binding.hours2.setText(viewModel1.getHours()?.get(1))
        binding.hours3.setText(viewModel1.getHours()?.get(2))
        binding.hours4.setText(viewModel1.getHours()?.get(3))
        binding.hours5.setText(viewModel1.getHours()?.get(4))
        binding.hours6.setText(viewModel1.getHours()?.get(5))
        binding.hours7.setText(viewModel1.getHours()?.get(6))
        binding.hours8.setText(viewModel1.getHours()?.get(7))
        binding.hours9.setText(viewModel1.getHours()?.get(8))
        binding.hours10.setText(viewModel1.getHours()?.get(9))
        binding.hours11.setText(viewModel1.getHours()?.get(10))
        binding.hours12.setText(viewModel1.getHours()?.get(11))
        binding.hours13.setText(viewModel1.getHours()?.get(12))
        binding.hours14.setText(viewModel1.getHours()?.get(13))
        binding.hours15.setText(viewModel1.getHours()?.get(14))
        binding.hours16.setText(viewModel1.getHours()?.get(15))
        binding.hours17.setText(viewModel1.getHours()?.get(16))
        binding.hours18.setText(viewModel1.getHours()?.get(17))
        binding.hours19.setText(viewModel1.getHours()?.get(18))
        binding.hours20.setText(viewModel1.getHours()?.get(19))
        binding.hours21.setText(viewModel1.getHours()?.get(20))
        binding.hours22.setText(viewModel1.getHours()?.get(21))
        binding.hours23.setText(viewModel1.getHours()?.get(22))
        binding.hours24.setText(viewModel1.getHours()?.get(23))
        binding.hours25.setText(viewModel1.getHours()?.get(24))
        binding.hours26.setText(viewModel1.getHours()?.get(25))
        binding.hours27.setText(viewModel1.getHours()?.get(26))
        binding.hours28.setText(viewModel1.getHours()?.get(27))
        binding.hours29.setText(viewModel1.getHours()?.get(28))
        binding.hours30.setText(viewModel1.getHours()?.get(29))

        // Recalculating sumHours after any change in partnerHours
        calculateSumHours()
        binding.hours1.doAfterTextChanged { calculateSumHours() }
        binding.hours2.doAfterTextChanged { calculateSumHours() }
        binding.hours3.doAfterTextChanged { calculateSumHours() }
        binding.hours4.doAfterTextChanged { calculateSumHours() }
        binding.hours5.doAfterTextChanged { calculateSumHours() }
        binding.hours6.doAfterTextChanged { calculateSumHours() }
        binding.hours7.doAfterTextChanged { calculateSumHours() }
        binding.hours8.doAfterTextChanged { calculateSumHours() }
        binding.hours9.doAfterTextChanged { calculateSumHours() }
        binding.hours10.doAfterTextChanged { calculateSumHours() }
        binding.hours11.doAfterTextChanged { calculateSumHours() }
        binding.hours12.doAfterTextChanged { calculateSumHours() }
        binding.hours13.doAfterTextChanged { calculateSumHours() }
        binding.hours14.doAfterTextChanged { calculateSumHours() }
        binding.hours15.doAfterTextChanged { calculateSumHours() }
        binding.hours16.doAfterTextChanged { calculateSumHours() }
        binding.hours17.doAfterTextChanged { calculateSumHours() }
        binding.hours18.doAfterTextChanged { calculateSumHours() }
        binding.hours19.doAfterTextChanged { calculateSumHours() }
        binding.hours20.doAfterTextChanged { calculateSumHours() }
        binding.hours21.doAfterTextChanged { calculateSumHours() }
        binding.hours22.doAfterTextChanged { calculateSumHours() }
        binding.hours23.doAfterTextChanged { calculateSumHours() }
        binding.hours24.doAfterTextChanged { calculateSumHours() }
        binding.hours25.doAfterTextChanged { calculateSumHours() }
        binding.hours26.doAfterTextChanged { calculateSumHours() }
        binding.hours27.doAfterTextChanged { calculateSumHours() }
        binding.hours28.doAfterTextChanged { calculateSumHours() }
        binding.hours29.doAfterTextChanged { calculateSumHours() }
        binding.hours30.doAfterTextChanged { calculateSumHours() }

    }

    override fun onDestroyView() {
        super.onDestroyView()

        // Transferring partnerNames & partnerHours to SharedViewMode
        val currentListOfNames = mutableListOf(
            binding.partner1.text.toString(), binding.partner2.text.toString(), binding.partner3.text.toString(), binding.partner4.text.toString(), binding.partner5.text.toString(),
            binding.partner6.text.toString(), binding.partner7.text.toString(), binding.partner8.text.toString(), binding.partner9.text.toString(), binding.partner10.text.toString(),
            binding.partner11.text.toString(), binding.partner12.text.toString(), binding.partner13.text.toString(), binding.partner14.text.toString(), binding.partner15.text.toString(),
            binding.partner16.text.toString(), binding.partner17.text.toString(), binding.partner18.text.toString(), binding.partner19.text.toString(), binding.partner20.text.toString(),
            binding.partner21.text.toString(), binding.partner22.text.toString(), binding.partner23.text.toString(), binding.partner24.text.toString(), binding.partner25.text.toString(),
            binding.partner26.text.toString(), binding.partner27.text.toString(), binding.partner28.text.toString(), binding.partner29.text.toString(), binding.partner30.text.toString()
        )
        val currentListOfHours = mutableListOf(
            binding.hours1.text.toString(), binding.hours2.text.toString(), binding.hours3.text.toString(), binding.hours4.text.toString(), binding.hours5.text.toString(),
            binding.hours6.text.toString(), binding.hours7.text.toString(), binding.hours8.text.toString(), binding.hours9.text.toString(), binding.hours10.text.toString(),
            binding.hours11.text.toString(), binding.hours12.text.toString(), binding.hours13.text.toString(), binding.hours14.text.toString(), binding.hours15.text.toString(),
            binding.hours16.text.toString(), binding.hours17.text.toString(), binding.hours18.text.toString(), binding.hours19.text.toString(), binding.hours20.text.toString(),
            binding.hours21.text.toString(), binding.hours22.text.toString(), binding.hours23.text.toString(), binding.hours24.text.toString(), binding.hours25.text.toString(),
            binding.hours26.text.toString(), binding.hours27.text.toString(), binding.hours28.text.toString(), binding.hours29.text.toString(), binding.hours30.text.toString()
        )

        viewModel1.setNames(currentListOfNames)
        viewModel1.setHours(currentListOfHours)
        viewModel1.setTotalHours(binding.outputTotalHours.text.toString())
    }

    override fun onDestroy() {
        super.onDestroy()
        binding1 = null

    }
}


