package com.example.gottips_2022

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.gottips_2022.databinding.FragmentInputBillsBinding
import com.example.gottips_2022.model.SharedViewModel

class InputBills : Fragment() {

    private val viewModel2: SharedViewModel by activityViewModels()
    private var binding2: FragmentInputBillsBinding? = null
    private val binding get() = binding2!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding2 = FragmentInputBillsBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Getting amountBills from SharedViewModel
        binding.inputOnes.setText(viewModel2.getBills(1))
        binding.inputTwos.setText(viewModel2.getBills(2))
        binding.inputFives.setText(viewModel2.getBills(5))
        binding.inputTens.setText(viewModel2.getBills(10))
        binding.inputTwenties.setText(viewModel2.getBills(20))

        //If any amountBill contains the string "null", the EditText.text is set to null (as in "empty", not as a string).
        //This is so that the android:Hint is can be displayed.
        if (binding.inputOnes.text.toString().contentEquals("null")) { binding.inputOnes.text = null }
        if (binding.inputTwos.text.toString().contentEquals("null")) { binding.inputTwos.text = null }
        if (binding.inputFives.text.toString().contentEquals("null")) { binding.inputFives.text = null }
        if (binding.inputTens.text.toString().contentEquals("null")) { binding.inputTens.text = null }
        if (binding.inputTwenties.text.toString().contentEquals("null")) { binding.inputTwenties.text = null }
    }

    override fun onDestroyView() {
        super.onDestroyView()

    // Transferring amountBills & totalTips to SharedViewModel


}

    override fun onDestroy() {
        super.onDestroy()
        binding2 = null
    }

}