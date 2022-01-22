package com.example.gottips_2022

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.activityViewModels
import com.example.gottips_2022.databinding.FragmentInputBillsBinding
import com.example.gottips_2022.model.SharedViewModel
import java.math.BigDecimal
import java.math.RoundingMode

class InputBills : Fragment() {

    private val viewModel2: SharedViewModel by activityViewModels()
    private var binding2: FragmentInputBillsBinding? = null
    private val binding get() = binding2!!

    private fun calculateTotalBills() {

        var currentTotalBills = 0.00
        if (binding.inputOnes.text.isNotEmpty()) { currentTotalBills += binding.inputOnes.text.toString().toDouble() }
        if (binding.inputTwos.text.isNotEmpty()) { currentTotalBills += binding.inputTwos.text.toString().toDouble() }
        if (binding.inputFives.text.isNotEmpty()) { currentTotalBills += binding.inputFives.text.toString().toDouble() }
        if (binding.inputTens.text.isNotEmpty()) { currentTotalBills += binding.inputTens.text.toString().toDouble() }
        if (binding.inputTwenties.text.isNotEmpty()) { currentTotalBills += binding.inputTwenties.text.toString().toDouble() }

        val roundedTotalBills = BigDecimal(currentTotalBills).setScale(2, RoundingMode.HALF_EVEN).toString()
        binding.outputTotalTips.text = roundedTotalBills
        viewModel2.setTotalBills(currentTotalBills.toString())

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding2 = FragmentInputBillsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initializing EditText & TotalTips values
        binding.inputOnes.setText(viewModel2.getBills()?.get(0))
        binding.inputTwos.setText(viewModel2.getBills()?.get(1))
        binding.inputFives.setText(viewModel2.getBills()?.get(2))
        binding.inputTens.setText(viewModel2.getBills()?.get(3))
        binding.inputTwenties.setText(viewModel2.getBills()?.get(4))

        //Text Changed Listeners
        calculateTotalBills()
        binding.inputOnes.doAfterTextChanged { calculateTotalBills() }
        binding.inputTwos.doAfterTextChanged { calculateTotalBills() }
        binding.inputFives.doAfterTextChanged { calculateTotalBills() }
        binding.inputTens.doAfterTextChanged { calculateTotalBills() }
        binding.inputTwenties.doAfterTextChanged { calculateTotalBills() }

    }

    override fun onDestroyView() {
        super.onDestroyView()

        val currentListOfBills = mutableListOf(binding.inputOnes.text.toString(), binding.inputTwos.text.toString(), binding.inputFives.text.toString(), binding.inputTens.text.toString(), binding.inputTwenties.text.toString())

        viewModel2.setBills(currentListOfBills)

}

    override fun onDestroy() {
        super.onDestroy()
        binding2 = null
    }

}