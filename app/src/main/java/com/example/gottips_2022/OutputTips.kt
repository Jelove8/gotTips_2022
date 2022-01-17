package com.example.gottips_2022

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.gottips_2022.databinding.FragmentOutputTipsBinding
import com.example.gottips_2022.model.SharedViewModel

class OutputTips : Fragment() {

    private val viewModel3: SharedViewModel by activityViewModels()
    private var binding3: FragmentOutputTipsBinding? = null
    private val binding get() = binding3!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        binding3 = FragmentOutputTipsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Populating partnerNames from SharedViewModel
        binding.partner1.setText(viewModel3.getName(1))
        binding.partner2.setText(viewModel3.getName(2))
        binding.partner3.setText(viewModel3.getName(3))
        binding.partner4.setText(viewModel3.getName(4))
        binding.partner5.setText(viewModel3.getName(5))
        binding.partner6.setText(viewModel3.getName(6))
        binding.partner7.setText(viewModel3.getName(7))
        binding.partner8.setText(viewModel3.getName(8))
        binding.partner9.setText(viewModel3.getName(9))
        binding.partner10.setText(viewModel3.getName(10))
        binding.partner11.setText(viewModel3.getName(11))
        binding.partner12.setText(viewModel3.getName(12))
        binding.partner13.setText(viewModel3.getName(13))
        binding.partner14.setText(viewModel3.getName(14))
        binding.partner15.setText(viewModel3.getName(15))
        binding.partner16.setText(viewModel3.getName(16))
        binding.partner17.setText(viewModel3.getName(17))
        binding.partner18.setText(viewModel3.getName(18))
        binding.partner19.setText(viewModel3.getName(19))
        binding.partner20.setText(viewModel3.getName(20))
        binding.partner21.setText(viewModel3.getName(21))
        binding.partner22.setText(viewModel3.getName(22))
        binding.partner23.setText(viewModel3.getName(23))
        binding.partner24.setText(viewModel3.getName(24))
        binding.partner25.setText(viewModel3.getName(25))
        binding.partner26.setText(viewModel3.getName(26))
        binding.partner27.setText(viewModel3.getName(27))
        binding.partner28.setText(viewModel3.getName(28))
        binding.partner29.setText(viewModel3.getName(29))
        binding.partner30.setText(viewModel3.getName(30))


        // Calculating partnerTips
        binding.tips1.setText(viewModel3.getTips(1))
        binding.tips2.setText(viewModel3.getTips(2))
        binding.tips3.setText(viewModel3.getTips(3))
        binding.tips4.setText(viewModel3.getTips(4))
        binding.tips5.setText(viewModel3.getTips(5))
        binding.tips6.setText(viewModel3.getTips(6))
        binding.tips7.setText(viewModel3.getTips(7))
        binding.tips8.setText(viewModel3.getTips(8))
        binding.tips9.setText(viewModel3.getTips(9))
        binding.tips10.setText(viewModel3.getTips(10))
        binding.tips11.setText(viewModel3.getTips(11))
        binding.tips12.setText(viewModel3.getTips(12))
        binding.tips13.setText(viewModel3.getTips(13))
        binding.tips14.setText(viewModel3.getTips(14))
        binding.tips15.setText(viewModel3.getTips(15))
        binding.tips16.setText(viewModel3.getTips(16))
        binding.tips17.setText(viewModel3.getTips(17))
        binding.tips18.setText(viewModel3.getTips(18))
        binding.tips19.setText(viewModel3.getTips(19))
        binding.tips20.setText(viewModel3.getTips(20))
        binding.tips21.setText(viewModel3.getTips(21))
        binding.tips22.setText(viewModel3.getTips(22))
        binding.tips23.setText(viewModel3.getTips(23))
        binding.tips24.setText(viewModel3.getTips(24))
        binding.tips25.setText(viewModel3.getTips(25))
        binding.tips26.setText(viewModel3.getTips(26))
        binding.tips27.setText(viewModel3.getTips(27))
        binding.tips28.setText(viewModel3.getTips(28))
        binding.tips29.setText(viewModel3.getTips(29))
        binding.tips30.setText(viewModel3.getTips(30))

        //Views that display partnerTips && corresponding partnerName is blank will have their content set to null.
        if (binding.partner1.text.isNullOrEmpty()) { binding.tips1.setText(R.string.empty)}
        if (binding.partner2.text.isNullOrEmpty()) { binding.tips2.setText(R.string.empty)}
        if (binding.partner3.text.isNullOrEmpty()) { binding.tips3.setText(R.string.empty)}
        if (binding.partner4.text.isNullOrEmpty()) { binding.tips4.setText(R.string.empty)}
        if (binding.partner5.text.isNullOrEmpty()) { binding.tips5.setText(R.string.empty)}
        if (binding.partner6.text.isNullOrEmpty()) { binding.tips6.setText(R.string.empty)}
        if (binding.partner7.text.isNullOrEmpty()) { binding.tips7.setText(R.string.empty)}
        if (binding.partner8.text.isNullOrEmpty()) { binding.tips8.setText(R.string.empty)}
        if (binding.partner9.text.isNullOrEmpty()) { binding.tips9.setText(R.string.empty)}
        if (binding.partner10.text.isNullOrEmpty()) { binding.tips10.setText(R.string.empty)}
        if (binding.partner11.text.isNullOrEmpty()) { binding.tips11.setText(R.string.empty)}
        if (binding.partner12.text.isNullOrEmpty()) { binding.tips12.setText(R.string.empty)}
        if (binding.partner13.text.isNullOrEmpty()) { binding.tips13.setText(R.string.empty)}
        if (binding.partner14.text.isNullOrEmpty()) { binding.tips14.setText(R.string.empty)}
        if (binding.partner15.text.isNullOrEmpty()) { binding.tips15.setText(R.string.empty)}
        if (binding.partner16.text.isNullOrEmpty()) { binding.tips16.setText(R.string.empty)}
        if (binding.partner17.text.isNullOrEmpty()) { binding.tips17.setText(R.string.empty)}
        if (binding.partner18.text.isNullOrEmpty()) { binding.tips18.setText(R.string.empty)}
        if (binding.partner19.text.isNullOrEmpty()) { binding.tips19.setText(R.string.empty)}
        if (binding.partner20.text.isNullOrEmpty()) { binding.tips20.setText(R.string.empty)}
        if (binding.partner21.text.isNullOrEmpty()) { binding.tips21.setText(R.string.empty)}
        if (binding.partner22.text.isNullOrEmpty()) { binding.tips22.setText(R.string.empty)}
        if (binding.partner23.text.isNullOrEmpty()) { binding.tips23.setText(R.string.empty)}
        if (binding.partner24.text.isNullOrEmpty()) { binding.tips24.setText(R.string.empty)}
        if (binding.partner25.text.isNullOrEmpty()) { binding.tips25.setText(R.string.empty)}
        if (binding.partner26.text.isNullOrEmpty()) { binding.tips26.setText(R.string.empty)}
        if (binding.partner27.text.isNullOrEmpty()) { binding.tips27.setText(R.string.empty)}
        if (binding.partner28.text.isNullOrEmpty()) { binding.tips28.setText(R.string.empty)}
        if (binding.partner29.text.isNullOrEmpty()) { binding.tips29.setText(R.string.empty)}
        if (binding.partner30.text.isNullOrEmpty()) { binding.tips30.setText(R.string.empty)}



    }

    override fun onDestroy() {
        super.onDestroy()
        binding3 = null
    }
}