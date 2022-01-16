package com.example.gottips_2022

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.lang.reflect.Array
import java.util.jar.Attributes

class TestViewModel : ViewModel() {
   private val name1: MutableLiveData<String> by lazy {
       MutableLiveData<String>().also {

       }
   }

    fun getName(): LiveData<String> {
        return name1
    }
}