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

class InputBills : Fragment() {

    private val viewModel2: SharedViewModel by activityViewModels()
    private var binding2: FragmentInputBillsBinding? = null
    private val binding get() = binding2!!
    private var currentTotalTips = 0.00

    private fun calculateTotalTips() {

        currentTotalTips = 0.00
        if (binding.inputOnes.text.isNotEmpty()) { currentTotalTips += binding.inputOnes.text.toString().toDouble() }
        if (binding.inputTwos.text.isNotEmpty()) { currentTotalTips += binding.inputTwos.text.toString().toDouble() }
        if (binding.inputFives.text.isNotEmpty()) { currentTotalTips += binding.inputFives.text.toString().toDouble() }
        if (binding.inputTens.text.isNotEmpty()) { currentTotalTips += binding.inputTens.text.toString().toDouble() }
        if (binding.inputTwenties.text.isNotEmpty()) { currentTotalTips += binding.inputTwenties.text.toString().toDouble() }

        binding.outputTotalTips.text = currentTotalTips.toString()
        viewModel2.setTotalTips(currentTotalTips.toString())
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding2 = FragmentInputBillsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initializing EditText & TotalTips values
        binding.inputOnes.setText(viewModel2.getBills(1))
        binding.inputTwos.setText(viewModel2.getBills(2))
        binding.inputFives.setText(viewModel2.getBills(5))
        binding.inputTens.setText(viewModel2.getBills(10))
        binding.inputTwenties.setText(viewModel2.getBills(20))
        binding.outputTotalTips.text = viewModel2.getBills(0)

        //If any views display the string "null", their text content is set to null.
        if (binding.inputOnes.text.contains("null")) { binding.inputOnes.text = null }
        if (binding.inputTwos.text.contains("null")) { binding.inputTwos.text = null }
        if (binding.inputFives.text.contains("null")) { binding.inputFives.text = null }
        if (binding.inputTens.text.contains("null")) { binding.inputTens.text = null }
        if (binding.inputTwenties.text.contains("null")) { binding.inputTwenties.text = null }
        if (binding.outputTotalTips.text.contains("null")) { binding.outputTotalTips.setText(R.string.zero_dot_zero_zero) }

        //Text Changed Listeners
        calculateTotalTips()
        binding.inputOnes.doAfterTextChanged { calculateTotalTips() }
        binding.inputTwos.doAfterTextChanged { calculateTotalTips() }
        binding.inputFives.doAfterTextChanged { calculateTotalTips() }
        binding.inputTens.doAfterTextChanged { calculateTotalTips() }
        binding.inputTwenties.doAfterTextChanged { calculateTotalTips() }

    }

    override fun onDestroyView() {
        super.onDestroyView()

        var ones = "0.00"
        var twos = "0.00"
        var fives = "0.00"
        var tens = "0.00"
        var twenties = "0.00"

        if (binding.inputOnes.text.isNotEmpty()) { ones = binding.inputOnes.text.toString() }
        if (binding.inputTwos.text.isNotEmpty()) { twos = binding.inputTwos.text.toString() }
        if (binding.inputFives.text.isNotEmpty()) { fives = binding.inputFives.text.toString()  }
        if (binding.inputTens.text.isNotEmpty()) { tens = binding.inputTens.text.toString()  }
        if (binding.inputTwenties.text.isNotEmpty()) { twenties = binding.inputTwenties.text.toString() }

        viewModel2.setBills(ones, twos, fives, tens, twenties)

}

    override fun onDestroy() {
        super.onDestroy()
        binding2 = null
    }

}