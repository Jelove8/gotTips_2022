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