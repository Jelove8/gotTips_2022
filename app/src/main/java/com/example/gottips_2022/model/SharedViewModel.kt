package com.example.gottips_2022.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {


    // partnerNames

    private val listOfNames: MutableLiveData<MutableList<String>> by lazy { MutableLiveData<MutableList<String>>() }
    private val listOfHours: MutableLiveData<MutableList<String>> by lazy { MutableLiveData<MutableList<String>>() }
    private val listOfBills: MutableLiveData<MutableList<String>> by lazy { MutableLiveData<MutableList<String>>() }

    private val totalHours: MutableLiveData<Double> by lazy { MutableLiveData<Double>() }
    private val totalBills: MutableLiveData<Double> by lazy { MutableLiveData<Double>() }

    private val listOfTips: MutableLiveData<MutableList<Double>> by lazy { MutableLiveData<MutableList<Double>>() }
    private val tipRate: MutableLiveData<String> by lazy { MutableLiveData<String>() }

    fun setNames(newListOfNames: MutableList<String>) {
        listOfNames.value = newListOfNames
    }
    fun getNames(): MutableList<String>? {
        return listOfNames.value
    }

    fun setHours(newListOfHours: MutableList<String>) {
        listOfHours.value = newListOfHours

    }
    fun setTotalHours(newTotalHours: String) {
        if (newTotalHours.isEmpty()) { totalHours.value = 0.00 }
        else { totalHours.value = newTotalHours.toDouble() }
    }
    fun getHours(): MutableList<String>? {
        return listOfHours.value
    }

    fun setBills(newListOfBills: MutableList<String>) {
        listOfBills.value = newListOfBills
    }
    fun setTotalBills(newTotalBills: String) {
        if (newTotalBills.isEmpty()) { totalBills.value = 0.00 }
        else { totalBills.value = newTotalBills.toDouble() }
    }
    fun getBills(): MutableList<String>? {
        return listOfBills.value
        }



    fun calculateTips() {

        //Calculating tipRate
        var newTipRate = 0.00
        if (totalHours.value != 0.00) { newTipRate = totalBills.value!! / totalHours.value!! }
        tipRate.value = newTipRate.toString()

        //Calculating partnerTips
        val newListOfTips = mutableListOf<Double>()

        for (i in 0..29) {

            if (listOfHours.value?.get(i).isNullOrEmpty()) { newListOfTips.add(i, 0.00) }
            else { newListOfTips.add(i, newTipRate * listOfHours.value!![i].toDouble()) }

        }

        listOfTips.value = newListOfTips
    }

    fun getTips(): MutableList<Double>? {
        return listOfTips.value
    }


}