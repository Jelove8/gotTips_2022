package com.example.gottips_2022

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.gottips_2022.databinding.FragmentInputPartnersBinding
import com.example.gottips_2022.model.SharedViewModel

class InputPartners : Fragment() {

    private val viewModel: SharedViewModel by activityViewModels()
    private var binding1: FragmentInputPartnersBinding? = null
    private val binding get() = binding1!!


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding1 = FragmentInputPartnersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Getting partnerNames from ShareViewModel.
        binding.partner1.setText(viewModel.getName(1))
        binding.partner2.setText(viewModel.getName(2))
        binding.partner3.setText(viewModel.getName(3))
        binding.partner4.setText(viewModel.getName(4))
        binding.partner5.setText(viewModel.getName(5))
        binding.partner6.setText(viewModel.getName(6))
        binding.partner7.setText(viewModel.getName(7))
        binding.partner8.setText(viewModel.getName(8))
        binding.partner9.setText(viewModel.getName(9))
        binding.partner10.setText(viewModel.getName(10))
        binding.partner11.setText(viewModel.getName(11))
        binding.partner12.setText(viewModel.getName(12))
        binding.partner13.setText(viewModel.getName(13))
        binding.partner14.setText(viewModel.getName(14))
        binding.partner15.setText(viewModel.getName(15))
        binding.partner16.setText(viewModel.getName(16))
        binding.partner17.setText(viewModel.getName(17))
        binding.partner18.setText(viewModel.getName(18))
        binding.partner19.setText(viewModel.getName(19))
        binding.partner20.setText(viewModel.getName(20))
        binding.partner21.setText(viewModel.getName(21))
        binding.partner22.setText(viewModel.getName(22))
        binding.partner23.setText(viewModel.getName(23))
        binding.partner24.setText(viewModel.getName(24))
        binding.partner25.setText(viewModel.getName(25))
        binding.partner26.setText(viewModel.getName(26))
        binding.partner27.setText(viewModel.getName(27))
        binding.partner28.setText(viewModel.getName(28))
        binding.partner29.setText(viewModel.getName(29))
        binding.partner30.setText(viewModel.getName(30))

        // Getting partnerHours from ShareViewModel.
        binding.hours1.setText(viewModel.getHours(1))
        binding.hours2.setText(viewModel.getHours(2))
        binding.hours3.setText(viewModel.getHours(3))
        binding.hours4.setText(viewModel.getHours(4))
        binding.hours5.setText(viewModel.getHours(5))
        binding.hours6.setText(viewModel.getHours(6))
        binding.hours7.setText(viewModel.getHours(7))
        binding.hours8.setText(viewModel.getHours(8))
        binding.hours9.setText(viewModel.getHours(9))
        binding.hours10.setText(viewModel.getHours(10))
        binding.hours11.setText(viewModel.getHours(11))
        binding.hours12.setText(viewModel.getHours(12))
        binding.hours13.setText(viewModel.getHours(13))
        binding.hours14.setText(viewModel.getHours(14))
        binding.hours15.setText(viewModel.getHours(15))
        binding.hours16.setText(viewModel.getHours(16))
        binding.hours17.setText(viewModel.getHours(17))
        binding.hours18.setText(viewModel.getHours(18))
        binding.hours19.setText(viewModel.getHours(19))
        binding.hours20.setText(viewModel.getHours(20))
        binding.hours21.setText(viewModel.getHours(21))
        binding.hours22.setText(viewModel.getHours(22))
        binding.hours23.setText(viewModel.getHours(23))
        binding.hours24.setText(viewModel.getHours(24))
        binding.hours25.setText(viewModel.getHours(25))
        binding.hours26.setText(viewModel.getHours(26))
        binding.hours27.setText(viewModel.getHours(27))
        binding.hours28.setText(viewModel.getHours(28))
        binding.hours29.setText(viewModel.getHours(29))
        binding.hours30.setText(viewModel.getHours(30))

        //If any partnerName &| partnerHour contains the string "null", the EditText.text is set to null (as in "empty", not as a string).
        //This is so that the android:Hint is can be displayed.
        if (binding.partner1.text.toString().contentEquals("null")) { binding.partner1.text = null }
        if (binding.partner2.text.toString().contentEquals("null")) { binding.partner2.text = null }
        if (binding.partner3.text.toString().contentEquals("null")) { binding.partner3.text = null }
        if (binding.partner4.text.toString().contentEquals("null")) { binding.partner4.text = null }
        if (binding.partner5.text.toString().contentEquals("null")) { binding.partner5.text = null }
        if (binding.partner6.text.toString().contentEquals("null")) { binding.partner6.text = null }
        if (binding.partner7.text.toString().contentEquals("null")) { binding.partner7.text = null }
        if (binding.partner8.text.toString().contentEquals("null")) { binding.partner8.text = null }
        if (binding.partner9.text.toString().contentEquals("null")) { binding.partner9.text = null }
        if (binding.partner10.text.toString().contentEquals("null")) { binding.partner10.text = null }
        if (binding.partner11.text.toString().contentEquals("null")) { binding.partner11.text = null }
        if (binding.partner12.text.toString().contentEquals("null")) { binding.partner12.text = null }
        if (binding.partner13.text.toString().contentEquals("null")) { binding.partner13.text = null }
        if (binding.partner14.text.toString().contentEquals("null")) { binding.partner14.text = null }
        if (binding.partner15.text.toString().contentEquals("null")) { binding.partner15.text = null }
        if (binding.partner16.text.toString().contentEquals("null")) { binding.partner16.text = null }
        if (binding.partner17.text.toString().contentEquals("null")) { binding.partner17.text = null }
        if (binding.partner18.text.toString().contentEquals("null")) { binding.partner18.text = null }
        if (binding.partner19.text.toString().contentEquals("null")) { binding.partner19.text = null }
        if (binding.partner20.text.toString().contentEquals("null")) { binding.partner20.text = null }
        if (binding.partner21.text.toString().contentEquals("null")) { binding.partner21.text = null }
        if (binding.partner22.text.toString().contentEquals("null")) { binding.partner22.text = null }
        if (binding.partner23.text.toString().contentEquals("null")) { binding.partner23.text = null }
        if (binding.partner24.text.toString().contentEquals("null")) { binding.partner24.text = null }
        if (binding.partner25.text.toString().contentEquals("null")) { binding.partner25.text = null }
        if (binding.partner26.text.toString().contentEquals("null")) { binding.partner26.text = null }
        if (binding.partner27.text.toString().contentEquals("null")) { binding.partner27.text = null }
        if (binding.partner28.text.toString().contentEquals("null")) { binding.partner28.text = null }
        if (binding.partner29.text.toString().contentEquals("null")) { binding.partner29.text = null }
        if (binding.partner30.text.toString().contentEquals("null")) { binding.partner30.text = null }

        if (binding.hours1.text.toString().contentEquals("null")) { binding.hours1.text = null }
        if (binding.hours2.text.toString().contentEquals("null")) { binding.hours2.text = null }
        if (binding.hours3.text.toString().contentEquals("null")) { binding.hours3.text = null }
        if (binding.hours4.text.toString().contentEquals("null")) { binding.hours4.text = null }
        if (binding.hours5.text.toString().contentEquals("null")) { binding.hours5.text = null }
        if (binding.hours6.text.toString().contentEquals("null")) { binding.hours6.text = null }
        if (binding.hours7.text.toString().contentEquals("null")) { binding.hours7.text = null }
        if (binding.hours8.text.toString().contentEquals("null")) { binding.hours8.text = null }
        if (binding.hours9.text.toString().contentEquals("null")) { binding.hours9.text = null }
        if (binding.hours10.text.toString().contentEquals("null")) { binding.hours10.text = null }
        if (binding.hours11.text.toString().contentEquals("null")) { binding.hours11.text = null }
        if (binding.hours12.text.toString().contentEquals("null")) { binding.hours12.text = null }
        if (binding.hours13.text.toString().contentEquals("null")) { binding.hours13.text = null }
        if (binding.hours14.text.toString().contentEquals("null")) { binding.hours14.text = null }
        if (binding.hours15.text.toString().contentEquals("null")) { binding.hours15.text = null }
        if (binding.hours16.text.toString().contentEquals("null")) { binding.hours16.text = null }
        if (binding.hours17.text.toString().contentEquals("null")) { binding.hours17.text = null }
        if (binding.hours18.text.toString().contentEquals("null")) { binding.hours18.text = null }
        if (binding.hours19.text.toString().contentEquals("null")) { binding.hours19.text = null }
        if (binding.hours20.text.toString().contentEquals("null")) { binding.hours20.text = null }
        if (binding.hours21.text.toString().contentEquals("null")) { binding.hours21.text = null }
        if (binding.hours22.text.toString().contentEquals("null")) { binding.hours22.text = null }
        if (binding.hours23.text.toString().contentEquals("null")) { binding.hours23.text = null }
        if (binding.hours24.text.toString().contentEquals("null")) { binding.hours24.text = null }
        if (binding.hours25.text.toString().contentEquals("null")) { binding.hours25.text = null }
        if (binding.hours26.text.toString().contentEquals("null")) { binding.hours26.text = null }
        if (binding.hours27.text.toString().contentEquals("null")) { binding.hours27.text = null }
        if (binding.hours28.text.toString().contentEquals("null")) { binding.hours28.text = null }
        if (binding.hours29.text.toString().contentEquals("null")) { binding.hours29.text = null }
        if (binding.hours30.text.toString().contentEquals("null")) { binding.hours30.text = null }
    }

    override fun onDestroyView() {
        super.onDestroyView()

        // Transferring partnerNames to SharedViewModel


        // Transferring partnerHours to SharedViewModel
        viewModel.setHours(1, binding.hours1.text.toString())
        viewModel.setHours(2, binding.hours2.text.toString())
        viewModel.setHours(3, binding.hours3.text.toString())
        viewModel.setHours(4, binding.hours4.text.toString())
        viewModel.setHours(5, binding.hours5.text.toString())
        viewModel.setHours(6, binding.hours6.text.toString())
        viewModel.setHours(7, binding.hours7.text.toString())
        viewModel.setHours(8, binding.hours8.text.toString())
        viewModel.setHours(9, binding.hours9.text.toString())
        viewModel.setHours(10, binding.hours10.text.toString())
        viewModel.setHours(11, binding.hours11.text.toString())
        viewModel.setHours(12, binding.hours12.text.toString())
        viewModel.setHours(13, binding.hours13.text.toString())
        viewModel.setHours(14, binding.hours14.text.toString())
        viewModel.setHours(15, binding.hours15.text.toString())
        viewModel.setHours(16, binding.hours16.text.toString())
        viewModel.setHours(17, binding.hours17.text.toString())
        viewModel.setHours(18, binding.hours18.text.toString())
        viewModel.setHours(19, binding.hours19.text.toString())
        viewModel.setHours(20, binding.hours20.text.toString())
        viewModel.setHours(21, binding.hours21.text.toString())
        viewModel.setHours(22, binding.hours22.text.toString())
        viewModel.setHours(23, binding.hours23.text.toString())
        viewModel.setHours(24, binding.hours24.text.toString())
        viewModel.setHours(25, binding.hours25.text.toString())
        viewModel.setHours(26, binding.hours26.text.toString())
        viewModel.setHours(27, binding.hours27.text.toString())
        viewModel.setHours(28, binding.hours28.text.toString())
        viewModel.setHours(29, binding.hours29.text.toString())
        viewModel.setHours(30, binding.hours30.text.toString())
        viewModel.setTotalHours()
    }


    override fun onDestroy() {
        super.onDestroy()
        binding1 = null

    }
}


