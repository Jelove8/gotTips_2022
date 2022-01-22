package com.example.gottips_2022

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.gottips_2022.databinding.ActivityMainBinding
import com.example.gottips_2022.model.SharedViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: SharedViewModel

    private fun displayFragment(x: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction
            .replace(R.id.fragmentContainerView, x)
            .addToBackStack(null)
            .commit()

    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[SharedViewModel::class.java]

        var displayCheck = 0
        fun changeHeader(x: Int) {
            when (x) {
                0 -> {
                    binding.header.text = getString(R.string.header0)
                    binding.confirmButton.text = getString(R.string.y_e_s)
                    binding.backButton.visibility = View.INVISIBLE
                    binding.imgBackButton.visibility = View.INVISIBLE
                    binding.TitleConstraint.visibility = View.VISIBLE
                }
                1 -> {
                    binding.header.text = getString(R.string.header1)
                    binding.confirmButton.text = getString(R.string.confirm1)
                    binding.backButton.visibility = View.VISIBLE
                    binding.imgBackButton.visibility = View.VISIBLE
                    binding.TitleConstraint.visibility = View.INVISIBLE
                }

                2 -> {
                    binding.header.text = getString(R.string.header2)
                }

                3 -> {
                    binding.header.text = getString(R.string.header3)

                }
            }
        }

        binding.confirmButton.setOnClickListener {

            when (displayCheck) {
                0 -> {
                    binding.fragmentContainerView.visibility = View.VISIBLE
                    displayFragment(InputPartners())
                    changeHeader(1)
                }

                1 -> {
                    displayFragment(InputBills())
                    changeHeader(2)
                }

                2 -> {
                    displayFragment(OutputTips())
                    changeHeader(3)

                }

            }

            if (displayCheck != 3) {
                displayCheck++
            }

        }

        binding.backButton.setOnClickListener {
            when (displayCheck) {
                1 -> {
                    binding.fragmentContainerView.visibility = View.INVISIBLE
                    changeHeader(0)
                }

                2 -> {
                    displayFragment(InputPartners())
                    changeHeader(1)
                }

                3 -> {
                    displayFragment(InputBills())
                    changeHeader(2)

                }

            }

            if (displayCheck != 0) {
                displayCheck--
            }
        }

    }
}
