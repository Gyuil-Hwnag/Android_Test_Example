package com.example.example

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.lang.Exception

class CalcViewModel(
    private val calculations: Calculations
) : ViewModel() {

    private val TAG = "CalcViewModel"

    var radius = MutableLiveData<String>()

    var area = MutableLiveData<String>()
    val areaValue: LiveData<String> = area

    var circumference = MutableLiveData<String>()
    val circumferenceValue: LiveData<String> = circumference

    fun calculate() {
        try {
            val radiusDoubleValue = radius.value?.toDouble()
            if(radiusDoubleValue != null) {
                calculateArea(radiusDoubleValue)
                calculateCircumference(radiusDoubleValue)
            } else {
                area.value = null
                circumference.value = null
            }
        } catch (e: Exception) {
            Log.i(TAG, e.message.toString())
            area.value = null
            circumference.value = null
        }
    }

    fun calculateArea(radius: Double) {
        val calculatedArea = calculations.calculateArea(radius)
        area.value = calculatedArea.toString()
    }

    fun calculateCircumference(radius: Double) {
        val calculatedCircumference = calculations.calculateCircumference(radius)
        circumference.value = calculatedCircumference.toString()
    }
}