package com.example.gottips_2022.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

<<<<<<< Updated upstream
    //Variables & Functions for partnerNames
    private val listOfPartnerNames: MutableLiveData<ArrayList<String>> by lazy { MutableLiveData<ArrayList<String>>() }

    fun getPartnerName(partnerNumber: Int): String {

       return listOfPartnerNames.value!![partnerNumber]

    }
    fun setPartnerNames(newListOfNames: ArrayList<String>) {
        listOfPartnerNames.value = newListOfNames
=======
    //partnerNames

    private val listOfNames: MutableLiveData<MutableList<String>> by lazy { MutableLiveData<MutableList<String>>() }
    fun setNames(newListOfNames: MutableList<String>) {
        listOfNames.value = newListOfNames
    }
    fun getName(): MutableList<String>? {
        return listOfNames.value
>>>>>>> Stashed changes
    }



<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
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
    private val listOfTips: MutableLiveData<ArrayList<Double>> by lazy { MutableLiveData<ArrayList<Double>>() }

    private val tips1Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips2Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips3Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips4Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips5Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips6Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips7Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips8Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips9Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips10Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips11Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips12Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips13Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips14Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips15Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips16Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips17Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips18Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips19Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips20Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips21Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips22Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips23Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips24Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips25Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips26Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips27Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips28Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips29Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val tips30Rounded: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }
    private val listOfRoundedTips: MutableLiveData<ArrayList<Int>> by lazy { MutableLiveData<ArrayList<Int>>() }

<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
    private fun getTipRate(): Double {

        var currentTipRate = 0.00
        currentTipRate = totalTips.value.toString().toDouble() / totalHours.value.toString().toDouble()

        return if (currentTipRate.isNaN()) {
            tipRate.value = "0.00"
            0.00
        } else {
            tipRate.value = currentTipRate.toString()
            tipRate.value.toString().toDouble()
        }

    }
    fun getTipsInitial(partnerNumber: Int): String {

        when (partnerNumber) {
            1 -> {
                return if (hours1.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips1.value = (hours1.value.toString().toDouble() * getTipRate()).toString()
                    tips1.value.toString()
                }
            }
            2 -> {
                return if (hours2.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips2.value = (hours2.value.toString().toDouble() * getTipRate()).toString()
                    tips2.value.toString()
                }
            }
            3 -> {
                return if (hours3.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips3.value = (hours3.value.toString().toDouble() * getTipRate()).toString()
                    tips3.value.toString()
                }
            }
            4 -> {
                return if (hours4.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips4.value = (hours4.value.toString().toDouble() * getTipRate()).toString()
                    tips4.value.toString()
                }
            }
            5 -> {
                return if (hours5.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips5.value = (hours5.value.toString().toDouble() * getTipRate()).toString()
                    tips5.value.toString()
                }
            }
            6 -> {
                return if (hours6.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips6.value = (hours6.value.toString().toDouble() * getTipRate()).toString()
                    tips6.value.toString()
                }
            }
            7 -> {
                return if (hours7.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips7.value = (hours7.value.toString().toDouble() * getTipRate()).toString()
                    tips7.value.toString()
                }
            }
            8 -> {
                return if (hours8.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips8.value = (hours8.value.toString().toDouble() * getTipRate()).toString()
                    tips8.value.toString()
                }
            }
            9 -> {
                return if (hours9.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips9.value = (hours9.value.toString().toDouble() * getTipRate()).toString()
                    tips9.value.toString()
                }
            }
            10 -> {
                return if (hours10.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips10.value = (hours10.value.toString().toDouble() * getTipRate()).toString()
                    tips10.value.toString()
                }
            }
            11 -> {
                return if (hours11.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips11.value = (hours11.value.toString().toDouble() * getTipRate()).toString()
                    tips11.value.toString()
                }
            }
            12 -> {
                return if (hours12.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips12.value = (hours12.value.toString().toDouble() * getTipRate()).toString()
                    tips12.value.toString()
                }
            }
            13 -> {
                return if (hours13.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips13.value = (hours13.value.toString().toDouble() * getTipRate()).toString()
                    tips13.value.toString()
                }
            }
            14 -> {
                return if (hours14.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips14.value = (hours14.value.toString().toDouble() * getTipRate()).toString()
                    tips14.value.toString()
                }
            }
            15 -> {
                return if (hours15.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips15.value = (hours15.value.toString().toDouble() * getTipRate()).toString()
                    tips15.value.toString()
                }
            }
            16 -> {
                return if (hours16.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips16.value = (hours16.value.toString().toDouble() * getTipRate()).toString()
                    tips16.value.toString()
                }
            }
            17 -> {
                return if (hours17.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips17.value = (hours17.value.toString().toDouble() * getTipRate()).toString()
                    tips17.value.toString()
                }
            }
            18 -> {
                return if (hours18.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips18.value = (hours18.value.toString().toDouble() * getTipRate()).toString()
                    tips18.value.toString()
                }
            }
            19 -> {
                return if (hours19.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips19.value = (hours19.value.toString().toDouble() * getTipRate()).toString()
                    tips19.value.toString()
                }
            }
            20 -> {
                return if (hours20.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips20.value = (hours20.value.toString().toDouble() * getTipRate()).toString()
                    tips20.value.toString()
                }
            }
            21 -> {
                return if (hours21.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips21.value = (hours21.value.toString().toDouble() * getTipRate()).toString()
                    tips21.value.toString()
                }
            }
            22 -> {
                return if (hours22.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips22.value = (hours22.value.toString().toDouble() * getTipRate()).toString()
                    tips22.value.toString()
                }
            }
            23 -> {
                return if (hours23.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips23.value = (hours23.value.toString().toDouble() * getTipRate()).toString()
                    tips23.value.toString()
                }
            }
            24 -> {
                return if (hours24.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips24.value = (hours24.value.toString().toDouble() * getTipRate()).toString()
                    tips24.value.toString()
                }
            }
            25 -> {
                return if (hours25.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips25.value = (hours25.value.toString().toDouble() * getTipRate()).toString()
                    tips25.value.toString()
                }
            }
            26 -> {
                return if (hours26.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips26.value = (hours26.value.toString().toDouble() * getTipRate()).toString()
                    tips26.value.toString()
                }
            }
            27 -> {
                return if (hours27.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips27.value = (hours27.value.toString().toDouble() * getTipRate()).toString()
                    tips27.value.toString()
                }
            }
            28 -> {
                return if (hours28.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips28.value = (hours28.value.toString().toDouble() * getTipRate()).toString()
                    tips28.value.toString()
                }
            }
            29 -> {
                return if (hours29.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips29.value = (hours29.value.toString().toDouble() * getTipRate()).toString()
                    tips29.value.toString()
                }
            }
            30 -> {
                return if (hours30.value.isNullOrEmpty()) {
                    "0.00"
                } else {
                    tips30.value = (hours30.value.toString().toDouble() * getTipRate()).toString()
                    tips30.value.toString()
                }
            }
            else -> { return "Error" }
        }

    }

}