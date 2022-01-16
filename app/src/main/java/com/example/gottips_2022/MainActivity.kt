package com.example.gottips_2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.gottips_2022.databinding.ActivityMainBinding
import com.example.gottips_2022.model.SharedViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel1: SharedViewModel

    private fun displayFragment(x: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction
            .replace(R.id.fragmentContainerView, x)
            .addToBackStack(null)
            .commit()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel1 = ViewModelProvider(this)[SharedViewModel::class.java]

        var displayCheck = 0
        fun changeHeaderAndFooter(x: Int) {
            when (x) {
                0 -> {
                    binding.header.text = getString(R.string.header0)
                    binding.footer.text = getString(R.string.footer0)
                }
                1 -> {
                    binding.header.text = getString(R.string.header1)
                    binding.footer.text = getString(R.string.footer1)
                }

                2 -> {
                    binding.header.text = getString(R.string.header2)
                    binding.footer.text = getString(R.string.footer2)
                    binding.footer.visibility = View.VISIBLE
                    binding.textView1.visibility = View.INVISIBLE
                    binding.textView2.visibility = View.INVISIBLE
                    binding.textView3.visibility = View.INVISIBLE
                    binding.outputTotalTips.visibility = View.INVISIBLE
                    binding.outputTotalHours.visibility = View.INVISIBLE
                    binding.outputTipRate.visibility = View.INVISIBLE
                }

                3 -> {
                    binding.header.text = getString(R.string.header3)
                    binding.textView1.visibility = View.VISIBLE
                    binding.textView2.visibility = View.VISIBLE
                    binding.textView3.visibility = View.VISIBLE
                    binding.outputTotalTips.visibility = View.VISIBLE
                    binding.outputTotalHours.visibility = View.VISIBLE
                    binding.outputTipRate.visibility = View.VISIBLE
                    binding.footer.visibility = View.INVISIBLE
                }
            }
        }

        binding.continueButton.setOnClickListener {

            when (displayCheck) {
                0 -> {
                    binding.fragmentContainerView.visibility = View.VISIBLE
                    displayFragment(InputPartners())
                    changeHeaderAndFooter(1)
                }

                1 -> {
                    displayFragment(InputBills())
                    changeHeaderAndFooter(2)
                }

                2 -> {
                    displayFragment(OutputTips())
                    changeHeaderAndFooter(3)
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
                    changeHeaderAndFooter(0)
                }

                2 -> {
                    displayFragment(InputPartners())
                    changeHeaderAndFooter(1)
                }

                3 -> {
                    displayFragment(InputBills())
                    changeHeaderAndFooter(2)
                }
            }

            if (displayCheck != 0) {
                displayCheck--
            }
        }

    }
}
