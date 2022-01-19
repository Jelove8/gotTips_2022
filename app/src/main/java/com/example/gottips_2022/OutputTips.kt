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

        // Getting and displaying partnerNames from ShareViewModel.
        binding.partner1.setText(viewModel3.getNames()?.get(0))
        binding.partner2.setText(viewModel3.getNames()?.get(1))
        binding.partner3.setText(viewModel3.getNames()?.get(2))
        binding.partner4.setText(viewModel3.getNames()?.get(3))
        binding.partner5.setText(viewModel3.getNames()?.get(4))
        binding.partner6.setText(viewModel3.getNames()?.get(5))
        binding.partner7.setText(viewModel3.getNames()?.get(6))
        binding.partner8.setText(viewModel3.getNames()?.get(7))
        binding.partner9.setText(viewModel3.getNames()?.get(8))
        binding.partner10.setText(viewModel3.getNames()?.get(9))
        binding.partner11.setText(viewModel3.getNames()?.get(10))
        binding.partner12.setText(viewModel3.getNames()?.get(11))
        binding.partner13.setText(viewModel3.getNames()?.get(12))
        binding.partner14.setText(viewModel3.getNames()?.get(13))
        binding.partner15.setText(viewModel3.getNames()?.get(14))
        binding.partner16.setText(viewModel3.getNames()?.get(15))
        binding.partner17.setText(viewModel3.getNames()?.get(16))
        binding.partner18.setText(viewModel3.getNames()?.get(17))
        binding.partner19.setText(viewModel3.getNames()?.get(18))
        binding.partner20.setText(viewModel3.getNames()?.get(19))
        binding.partner21.setText(viewModel3.getNames()?.get(20))
        binding.partner22.setText(viewModel3.getNames()?.get(21))
        binding.partner23.setText(viewModel3.getNames()?.get(22))
        binding.partner24.setText(viewModel3.getNames()?.get(23))
        binding.partner25.setText(viewModel3.getNames()?.get(24))
        binding.partner26.setText(viewModel3.getNames()?.get(25))
        binding.partner27.setText(viewModel3.getNames()?.get(26))
        binding.partner28.setText(viewModel3.getNames()?.get(27))
        binding.partner29.setText(viewModel3.getNames()?.get(28))
        binding.partner30.setText(viewModel3.getNames()?.get(29))


        // Calculating partnerTips
        viewModel3.calculateTips()
        binding.tips1.setText(viewModel3.getTips()!![0].toString())
        binding.tips2.setText(viewModel3.getTips()!![1].toString())
        binding.tips3.setText(viewModel3.getTips()!![2].toString())
        binding.tips4.setText(viewModel3.getTips()!![3].toString())
        binding.tips5.setText(viewModel3.getTips()!![4].toString())
        binding.tips6.setText(viewModel3.getTips()!![5].toString())
        binding.tips7.setText(viewModel3.getTips()!![6].toString())
        binding.tips8.setText(viewModel3.getTips()!![7].toString())
        binding.tips9.setText(viewModel3.getTips()!![8].toString())
        binding.tips10.setText(viewModel3.getTips()!![9].toString())
        binding.tips11.setText(viewModel3.getTips()!![10].toString())
        binding.tips12.setText(viewModel3.getTips()!![11].toString())
        binding.tips13.setText(viewModel3.getTips()!![12].toString())
        binding.tips14.setText(viewModel3.getTips()!![13].toString())
        binding.tips15.setText(viewModel3.getTips()!![14].toString())
        binding.tips16.setText(viewModel3.getTips()!![15].toString())
        binding.tips17.setText(viewModel3.getTips()!![16].toString())
        binding.tips18.setText(viewModel3.getTips()!![17].toString())
        binding.tips19.setText(viewModel3.getTips()!![18].toString())
        binding.tips20.setText(viewModel3.getTips()!![19].toString())
        binding.tips21.setText(viewModel3.getTips()!![20].toString())
        binding.tips22.setText(viewModel3.getTips()!![21].toString())
        binding.tips23.setText(viewModel3.getTips()!![22].toString())
        binding.tips24.setText(viewModel3.getTips()!![23].toString())
        binding.tips25.setText(viewModel3.getTips()!![24].toString())
        binding.tips26.setText(viewModel3.getTips()!![25].toString())
        binding.tips27.setText(viewModel3.getTips()!![26].toString())
        binding.tips28.setText(viewModel3.getTips()!![27].toString())
        binding.tips29.setText(viewModel3.getTips()!![28].toString())
        binding.tips30.setText(viewModel3.getTips()!![29].toString())

    }

    override fun onDestroy() {
        super.onDestroy()
        binding3 = null
    }
}