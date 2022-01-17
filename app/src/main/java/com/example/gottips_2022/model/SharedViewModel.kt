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
            0 -> {totalHours.value = newHours}
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



    //Variables & Functions for amountBills
    private val amountOnes: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val amountTwos: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val amountFives: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val amountTens: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val amountTwenties: MutableLiveData<String> by lazy { MutableLiveData<String>() }
    private val totalTips: MutableLiveData<String> by lazy { MutableLiveData<String>() }

    fun setBills(ones: String, twos: String, fives: String, tens: String, twenties: String) {
        amountOnes.value = ones
        amountTwos.value = twos
        amountFives.value = fives
        amountTens.value = tens
        amountTwenties.value = twenties
    }
    fun setTotalTips(currentTotalTips: String) { totalTips.value = currentTotalTips }
    fun getBills(billType: Int): String {
        return when (billType) {
            0 -> { totalTips.value.toString() }
            1 -> { amountOnes.value.toString() }
            2 -> { amountTwos.value.toString() }
            5 -> { amountFives.value.toString() }
            10 -> { amountTens.value.toString() }
            20 -> { amountTwenties.value.toString() }
            else -> {  "Error" }
        }
    }


    //Variables & Functions to populate OutputTips_Fragment
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

    fun getTipRate(): Double {

        var currentTipRate = 0.00
        currentTipRate = totalTips.value.toString().toDouble() / totalHours.value.toString().toDouble()

        return if (currentTipRate.isNaN()) { 0.00 }
        else { currentTipRate }

    }

    fun getTips(partnerNumber: Int): String {

        return when (partnerNumber) {
            1 -> {
                if (hours1.value.isNullOrEmpty()) { "0.00" }
                else { (hours1.value.toString().toDouble() * getTipRate()).toString() }
            }
            2 -> {
                if (hours2.value.isNullOrEmpty()) { "0.00" }
                else { (hours2.value.toString().toDouble() * getTipRate()).toString() }
            }
            3 -> {
                if (hours3.value.isNullOrEmpty()) { "0.00" }
                else { (hours3.value.toString().toDouble() * getTipRate()).toString() }
            }
            4 -> {
                if (hours4.value.isNullOrEmpty()) { "0.00" }
                else { (hours4.value.toString().toDouble() * getTipRate()).toString() }
            }
            5 -> {
                if (hours5.value.isNullOrEmpty()) { "0.00" }
                else { (hours5.value.toString().toDouble() * getTipRate()).toString() }
            }
            6 -> {
                if (hours6.value.isNullOrEmpty()) { "0.00" }
                else { (hours6.value.toString().toDouble() * getTipRate()).toString() }
            }
            7 -> {
                if (hours7.value.isNullOrEmpty()) { "0.00" }
                else { (hours7.value.toString().toDouble() * getTipRate()).toString() }
            }
            8 -> {
                if (hours8.value.isNullOrEmpty()) { "0.00" }
                else { (hours8.value.toString().toDouble() * getTipRate()).toString() }
            }
            9 -> {
                if (hours9.value.isNullOrEmpty()) { "0.00" }
                else { (hours9.value.toString().toDouble() * getTipRate()).toString() }
            }
            10 -> {
                if (hours10.value.isNullOrEmpty()) { "0.00" }
                else { (hours10.value.toString().toDouble() * getTipRate()).toString() }
            }
            11 -> {
                if (hours11.value.isNullOrEmpty()) { "0.00" }
                else { (hours11.value.toString().toDouble() * getTipRate()).toString() }
            }
            12 -> {
                if (hours12.value.isNullOrEmpty()) { "0.00" }
                else { (hours12.value.toString().toDouble() * getTipRate()).toString() }
            }
            13 -> {
                if (hours13.value.isNullOrEmpty()) { "0.00" }
                else { (hours13.value.toString().toDouble() * getTipRate()).toString() }
            }
            14 -> {
                if (hours14.value.isNullOrEmpty()) { "0.00" }
                else { (hours14.value.toString().toDouble() * getTipRate()).toString() }
            }
            15 -> {
                if (hours15.value.isNullOrEmpty()) { "0.00" }
                else { (hours15.value.toString().toDouble() * getTipRate()).toString() }
            }
            16 -> {
                if (hours16.value.isNullOrEmpty()) { "0.00" }
                else { (hours16.value.toString().toDouble() * getTipRate()).toString() }
            }
            17 -> {
                if (hours17.value.isNullOrEmpty()) { "0.00" }
                else { (hours17.value.toString().toDouble() * getTipRate()).toString() }
            }
            18 -> {
                if (hours18.value.isNullOrEmpty()) { "0.00" }
                else { (hours18.value.toString().toDouble() * getTipRate()).toString() }
            }
            19 -> {
                if (hours19.value.isNullOrEmpty()) { "0.00" }
                else { (hours19.value.toString().toDouble() * getTipRate()).toString() }
            }
            20 -> {
                if (hours20.value.isNullOrEmpty()) { "0.00" }
                else { (hours20.value.toString().toDouble() * getTipRate()).toString() }
            }
            21 -> {
                if (hours21.value.isNullOrEmpty()) { "0.00" }
                else { (hours21.value.toString().toDouble() * getTipRate()).toString() }
            }
            22 -> {
                if (hours22.value.isNullOrEmpty()) { "0.00" }
                else { (hours22.value.toString().toDouble() * getTipRate()).toString() }
            }
            23 -> {
                if (hours23.value.isNullOrEmpty()) { "0.00" }
                else { (hours23.value.toString().toDouble() * getTipRate()).toString() }
            }
            24 -> {
                if (hours24.value.isNullOrEmpty()) { "0.00" }
                else { (hours24.value.toString().toDouble() * getTipRate()).toString() }
            }
            25 -> {
                if (hours25.value.isNullOrEmpty()) { "0.00" }
                else { (hours25.value.toString().toDouble() * getTipRate()).toString() }
            }
            26 -> {
                if (hours26.value.isNullOrEmpty()) { "0.00" }
                else { (hours26.value.toString().toDouble() * getTipRate()).toString() }
            }
            27 -> {
                if (hours27.value.isNullOrEmpty()) { "0.00" }
                else { (hours27.value.toString().toDouble() * getTipRate()).toString() }
            }
            28 -> {
                if (hours28.value.isNullOrEmpty()) { "0.00" }
                else { (hours28.value.toString().toDouble() * getTipRate()).toString() }
            }
            29 -> {
                if (hours29.value.isNullOrEmpty()) { "0.00" }
                else { (hours29.value.toString().toDouble() * getTipRate()).toString() }
            }
            30 -> {
                if (hours30.value.isNullOrEmpty()) { "0.00" }
                else { (hours30.value.toString().toDouble() * getTipRate()).toString() }
            }
            else -> { "Error" }
        }

    }



}