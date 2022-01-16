package com.example.gottips_2022.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    //Variables & Functions for partnerNames
    private val name1: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name2: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name3: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name4: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name5: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name6: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name7: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name8: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name9: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name10: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name11: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name12: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name13: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name14: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name15: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name16: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name17: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name18: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name19: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name20: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name21: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name22: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name23: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name24: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name25: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name26: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name27: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name28: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name29: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val name30: MutableLiveData<String> by lazy { MutableLiveData<String>() }

    //Hello
    
    fun setName(nameNumber: Int, newName: String) {
        when (nameNumber) {
            1 -> {name1.value = newName}
            2 -> {name2.value = newName}
            3 -> {name3.value = newName}
            4 -> {name4.value = newName}
            5 -> {name5.value = newName}
            6 -> {name6.value = newName}
            7 -> {name7.value = newName}
            8 -> {name8.value = newName}
            9 -> {name9.value = newName}
            10 -> {name10.value = newName}
            11 -> {name11.value = newName}
            12 -> {name12.value = newName}
            13 -> {name13.value = newName}
            14 -> {name14.value = newName}
            15 -> {name15.value = newName}
            16 -> {name16.value = newName}
            17 -> {name17.value = newName}
            18 -> {name18.value = newName}
            19 -> {name19.value = newName}
            20 -> {name20.value = newName}
            21 -> {name21.value = newName}
            22 -> {name22.value = newName}
            23 -> {name23.value = newName}
            24 -> {name24.value = newName}
            25 -> {name25.value = newName}
            26 -> {name26.value = newName}
            27 -> {name27.value = newName}
            28 -> {name28.value = newName}
            29 -> {name29.value = newName}
            30 -> {name30.value = newName}
        }
    }

    fun getName(nameNumber: Int): String {

        return when (nameNumber) {
            1 -> {name1.value.toString()}
            2 -> {name2.value.toString()}
            3 -> {name3.value.toString()}
            4 -> {name4.value.toString()}
            5 -> {name5.value.toString()}
            6 -> {name6.value.toString()}
            7 -> {name7.value.toString()}
            8 -> {name8.value.toString()}
            9 -> {name9.value.toString()}
            10 -> {name10.value.toString()}
            11 -> {name11.value.toString()}
            12 -> {name12.value.toString()}
            13 -> {name13.value.toString()}
            14 -> {name14.value.toString()}
            15 -> {name15.value.toString()}
            16 -> {name16.value.toString()}
            17 -> {name17.value.toString()}
            18 -> {name18.value.toString()}
            19 -> {name19.value.toString()}
            20 -> {name20.value.toString()}
            21 -> {name21.value.toString()}
            22 -> {name22.value.toString()}
            23 -> {name23.value.toString()}
            24 -> {name24.value.toString()}
            25 -> {name25.value.toString()}
            26 -> {name26.value.toString()}
            27 -> {name27.value.toString()}
            28 -> {name28.value.toString()}
            29 -> {name29.value.toString()}
            30 -> {name30.value.toString()}
            else -> {"Error"}
        }
    }


    //Variables & Functions for partnerHours
    private val hours1: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours2: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours3: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours4: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours5: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours6: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours7: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours8: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours9: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours10: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours11: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours12: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours13: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours14: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours15: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours16: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours17: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours18: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours19: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours20: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours21: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours22: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours23: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours24: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours25: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours26: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours27: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours28: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours29: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val hours30: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val totalHours: MutableLiveData<String> by lazy { MutableLiveData<String>() }

    fun setHours (nameNumber: Int, newHours: String) {
        when (nameNumber) {
            1 -> {hours1.value = newHours}
            2 -> {hours2.value = newHours}
            3 -> {hours3.value = newHours}
            4 -> {hours4.value = newHours}
            5 -> {hours5.value = newHours}
            6 -> {hours6.value = newHours}
            7 -> {hours7.value = newHours}
            8 -> {hours8.value = newHours}
            9 -> {hours9.value = newHours}
            10 -> {hours10.value = newHours}
            11 -> {hours11.value = newHours}
            12 -> {hours12.value = newHours}
            13 -> {hours13.value = newHours}
            14 -> {hours14.value = newHours}
            15 -> {hours15.value = newHours}
            16 -> {hours16.value = newHours}
            17 -> {hours17.value = newHours}
            18 -> {hours18.value = newHours}
            19 -> {hours19.value = newHours}
            20 -> {hours20.value = newHours}
            21 -> {hours21.value = newHours}
            22 -> {hours22.value = newHours}
            23 -> {hours23.value = newHours}
            24 -> {hours24.value = newHours}
            25 -> {hours25.value = newHours}
            26 -> {hours26.value = newHours}
            27 -> {hours27.value = newHours}
            28 -> {hours28.value = newHours}
            29 -> {hours29.value = newHours}
            30 -> {hours30.value = newHours}
        }
    }

    fun getHours (nameNumber: Int): String {
        return when (nameNumber) {
            1 -> {hours1.value.toString()}
            2 -> {hours2.value.toString()}
            3 -> {hours3.value.toString()}
            4 -> {hours4.value.toString()}
            5 -> {hours5.value.toString()}
            6 -> {hours6.value.toString()}
            7 -> {hours7.value.toString()}
            8 -> {hours8.value.toString()}
            9 -> {hours9.value.toString()}
            10 -> {hours10.value.toString()}
            11 -> {hours11.value.toString()}
            12 -> {hours12.value.toString()}
            13 -> {hours13.value.toString()}
            14 -> {hours14.value.toString()}
            15 -> {hours15.value.toString()}
            16 -> {hours16.value.toString()}
            17 -> {hours17.value.toString()}
            18 -> {hours18.value.toString()}
            19 -> {hours19.value.toString()}
            20 -> {hours20.value.toString()}
            21 -> {hours21.value.toString()}
            22 -> {hours22.value.toString()}
            23 -> {hours23.value.toString()}
            24 -> {hours24.value.toString()}
            25 -> {hours25.value.toString()}
            26 -> {hours26.value.toString()}
            27 -> {hours27.value.toString()}
            28 -> {hours28.value.toString()}
            29 -> {hours29.value.toString()}
            30 -> {hours30.value.toString()}
            else -> {"Error"}
        }
    }

    fun setTotalHours() {
        totalHours.value = (hours1.value.toString().toDouble() + hours2.value.toString().toDouble() + hours3.value.toString().toDouble() + hours4.value.toString().toDouble() + hours5.value.toString().toDouble() +
                hours6.value.toString().toDouble() + hours7.value.toString().toDouble() + hours8.toString().toDouble() + hours9.toString().toDouble() + hours10.value.toString().toDouble() +
                hours11.value.toString().toDouble() + hours12.value.toString().toDouble() + hours13.value.toString().toDouble() + hours14.value.toString().toDouble() + hours15.value.toString().toDouble() +
                hours16.value.toString().toDouble() + hours17.value.toString().toDouble() + hours18.value.toString().toDouble() + hours19.value.toString().toDouble() + hours20.value.toString().toDouble() +
                hours21.value.toString().toDouble() + hours22.value.toString().toDouble() + hours23.value.toString().toDouble() + hours24.value.toString().toDouble() + hours25.value.toString().toDouble() +
                hours26.value.toString().toDouble() + hours27.value.toString().toDouble() + hours28.value.toString().toDouble() + hours29.value.toString().toDouble() + hours30.value.toString().toDouble()).toString()

        if (totalHours.value == null) {
            totalHours.value = "null"
        }
    }


    //Variables & Functions for amountBills
    private val amountOnes: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val amountTwos: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val amountFives: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val amountTens: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val amountTwenties: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val totalTips: MutableLiveData<Double> by lazy { MutableLiveData<Double>() }

    fun setBills(ones: Double, twos: Double, fives: Double, tens: Double, twenties: Double) {
        amountOnes.value = ones.toInt()
        amountTwos.value = twos.toInt() / 2
        amountFives.value = fives.toInt() / 5
        amountTens.value = tens.toInt() / 10
        amountTwenties.value = twenties.toInt() / 20

        totalTips.value = ones + twos + fives + tens + twenties
    }

    fun getBills(billType: Int): String {
        return when (billType) {
            1 -> { amountOnes.toString() }
            2 -> { amountTwos.toString() }
            5 -> { amountFives.toString() }
            10 -> { amountTens.toString() }
            20 -> { amountTwenties.toString() }
            else -> { "Error"}
        }
    }



    //Variables & Functions involving TipRate and partnerTips.
    private val tips1: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips2: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips3: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips4: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips5: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips6: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips7: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips8: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips9: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips10: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips11: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips12: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips13: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips14: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips15: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips16: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips17: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips18: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips19: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips20: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips21: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips22: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips23: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips24: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips25: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips26: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips27: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips28: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips29: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tips30: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val tipRate: MutableLiveData<String> by lazy { MutableLiveData<String>() }

    fun calculateTips() {
        tipRate.value = (totalTips.value.toString().toDouble() / totalHours.toString().toDouble()).toString()

        tips1.value = (tipRate.value.toString().toDouble() * hours1.value.toString().toDouble()).toString()
        tips2.value = (tipRate.value.toString().toDouble() * hours2.value.toString().toDouble()).toString()
        tips3.value = (tipRate.value.toString().toDouble() * hours3.value.toString().toDouble()).toString()
        tips4.value = (tipRate.value.toString().toDouble() * hours4.value.toString().toDouble()).toString()
        tips5.value = (tipRate.value.toString().toDouble() * hours5.value.toString().toDouble()).toString()
        tips6.value = (tipRate.value.toString().toDouble() * hours6.value.toString().toDouble()).toString()
        tips7.value = (tipRate.value.toString().toDouble() * hours7.value.toString().toDouble()).toString()
        tips8.value = (tipRate.value.toString().toDouble() * hours8.value.toString().toDouble()).toString()
        tips9.value = (tipRate.value.toString().toDouble() * hours9.value.toString().toDouble()).toString()
        tips10.value = (tipRate.value.toString().toDouble() * hours10.value.toString().toDouble()).toString()
        tips11.value = (tipRate.value.toString().toDouble() * hours11.value.toString().toDouble()).toString()
        tips12.value = (tipRate.value.toString().toDouble() * hours12.value.toString().toDouble()).toString()
        tips13.value = (tipRate.value.toString().toDouble() * hours13.value.toString().toDouble()).toString()
        tips14.value = (tipRate.value.toString().toDouble() * hours14.value.toString().toDouble()).toString()
        tips15.value = (tipRate.value.toString().toDouble() * hours15.value.toString().toDouble()).toString()
        tips16.value = (tipRate.value.toString().toDouble() * hours16.value.toString().toDouble()).toString()
        tips17.value = (tipRate.value.toString().toDouble() * hours17.value.toString().toDouble()).toString()
        tips18.value = (tipRate.value.toString().toDouble() * hours18.value.toString().toDouble()).toString()
        tips19.value = (tipRate.value.toString().toDouble() * hours19.value.toString().toDouble()).toString()
        tips20.value = (tipRate.value.toString().toDouble() * hours20.value.toString().toDouble()).toString()
        tips21.value = (tipRate.value.toString().toDouble() * hours21.value.toString().toDouble()).toString()
        tips22.value = (tipRate.value.toString().toDouble() * hours22.value.toString().toDouble()).toString()
        tips23.value = (tipRate.value.toString().toDouble() * hours23.value.toString().toDouble()).toString()
        tips24.value = (tipRate.value.toString().toDouble() * hours24.value.toString().toDouble()).toString()
        tips25.value = (tipRate.value.toString().toDouble() * hours25.value.toString().toDouble()).toString()
        tips26.value = (tipRate.value.toString().toDouble() * hours26.value.toString().toDouble()).toString()
        tips27.value = (tipRate.value.toString().toDouble() * hours27.value.toString().toDouble()).toString()
        tips28.value = (tipRate.value.toString().toDouble() * hours28.value.toString().toDouble()).toString()
        tips29.value = (tipRate.value.toString().toDouble() * hours29.value.toString().toDouble()).toString()
        tips30.value = (tipRate.value.toString().toDouble() * hours30.value.toString().toDouble()).toString()
    }
}