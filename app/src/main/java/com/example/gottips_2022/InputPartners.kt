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

    private val viewModel: SharedViewModel by activityViewModels()
    private var binding1: FragmentInputPartnersBinding? = null
    private val binding get() = binding1!!
    private var currentListOfNames = arrayListOf("Initialize partners here...",viewModel.getPartnerName(1), "null", "null", "null", "null", "null", "null", "null", "null", "null",
        "null", "null", "null", "null", "null", "null", "null", "null", "null", "null",
        "null", "null", "null", "null", "null", "null", "null", "null", "null", "null", )
    private var currentSumHours = 0.00

    private fun calculateSumHours() {
        currentSumHours = 0.00

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
        viewModel.setHours(0, currentSumHours.toString())

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding1 = FragmentInputPartnersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Getting partnerNames from ShareViewModel.
<<<<<<< Updated upstream
        viewModel.setPartnerNames(currentListOfNames)
        binding.partner1.setText(viewModel.getPartnerName(1))

=======
        binding.partner1.setText(viewModel.getName()?.get(1))
        binding.partner2.setText(viewModel.getName()?.get(2))
        binding.partner3.setText(viewModel.getName()?.get(3))
        binding.partner4.setText(viewModel.getName()?.get(4))
        binding.partner5.setText(viewModel.getName()?.get(5))
        binding.partner6.setText(viewModel.getName()?.get(6))
        binding.partner7.setText(viewModel.getName()?.get(7))
        binding.partner8.setText(viewModel.getName()?.get(8))
        binding.partner9.setText(viewModel.getName()?.get(9))
        binding.partner10.setText(viewModel.getName()?.get(10))
        binding.partner11.setText(viewModel.getName()?.get(11))
        binding.partner12.setText(viewModel.getName()?.get(12))
        binding.partner13.setText(viewModel.getName()?.get(13))
        binding.partner14.setText(viewModel.getName()?.get(14))
        binding.partner15.setText(viewModel.getName()?.get(15))
        binding.partner16.setText(viewModel.getName()?.get(16))
        binding.partner17.setText(viewModel.getName()?.get(17))
        binding.partner18.setText(viewModel.getName()?.get(18))
        binding.partner19.setText(viewModel.getName()?.get(19))
        binding.partner20.setText(viewModel.getName()?.get(20))
        binding.partner21.setText(viewModel.getName()?.get(21))
        binding.partner22.setText(viewModel.getName()?.get(22))
        binding.partner23.setText(viewModel.getName()?.get(23))
        binding.partner24.setText(viewModel.getName()?.get(24))
        binding.partner25.setText(viewModel.getName()?.get(25))
        binding.partner26.setText(viewModel.getName()?.get(26))
        binding.partner27.setText(viewModel.getName()?.get(27))
        binding.partner28.setText(viewModel.getName()?.get(28))
        binding.partner29.setText(viewModel.getName()?.get(29))
        binding.partner30.setText(viewModel.getName()?.get(30))
>>>>>>> Stashed changes


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

        // Recalculating sumHours after every change in hours_EditTexts.
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

<<<<<<< Updated upstream
        // Transferring partnerNames to SharedViewModel.
        currentListOfNames[1] = binding.partner1.text.toString()



        viewModel.setPartnerNames(currentListOfNames)
=======
        // Transferring partnerNames to SharedViewModel
        val currentListOfNames = mutableListOf("newListOfNames...", binding.partner1.text.toString(), binding.partner1.text.toString(), binding.partner2.text.toString(), binding.partner3.text.toString(), binding.partner4.text.toString(), binding.partner5.text.toString(),
            binding.partner6.text.toString(), binding.partner7.text.toString(), binding.partner8.text.toString(), binding.partner9.text.toString(), binding.partner10.text.toString(),
            binding.partner11.text.toString(), binding.partner12.text.toString(), binding.partner13.text.toString(), binding.partner14.text.toString(), binding.partner15.text.toString(),
            binding.partner16.text.toString(), binding.partner17.text.toString(), binding.partner18.text.toString(), binding.partner19.text.toString(), binding.partner20.text.toString(),
            binding.partner21.text.toString(), binding.partner22.text.toString(), binding.partner23.text.toString(), binding.partner24.text.toString(), binding.partner25.text.toString(),
            binding.partner26.text.toString(), binding.partner27.text.toString(), binding.partner28.text.toString(), binding.partner29.text.toString(), binding.partner30.text.toString() )

        viewModel.setNames(currentListOfNames)
>>>>>>> Stashed changes


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
    }

    override fun onDestroy() {
        super.onDestroy()
        binding1 = null

    }
}


