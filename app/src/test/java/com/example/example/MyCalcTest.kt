package com.example.example

import com.google.common.truth.Truth
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class MyCalcTest {
    private lateinit var myCalc: MyCalc

    @Before
    fun setUp() {
        myCalc = MyCalc()
    }

    @Test
    fun calculateCircumference_radiusGiven_returnsCorrectResult() {
        val result = myCalc.calculateCircumference(2.1)
        Truth.assertThat(result).isEqualTo(2*2.1*Math.PI)
    }

    @Test
    fun calculateCircumference_zeroRadius_returnsCorrectResult() {
        val result = myCalc.calculateCircumference(0.0)
        Truth.assertThat(result).isEqualTo(0.0)
    }

    @Test
    fun calculate_radius_Given_returnsCorrectResult() {
        val result = myCalc.calculateArea(2.1)
        Truth.assertThat(result).isEqualTo(2.1*2.1*Math.PI)
    }

    @Test
    fun calculate_zeroRadius_returnsCorrectResult() {
        val result = myCalc.calculateCircumference(0.0)
        Truth.assertThat(result).isEqualTo(0.0)
    }

    @Test
    fun calculate_radius_Given_returnFailResult() {
        val result = myCalc.calculateArea(2.1)
        Truth.assertThat(result).isEqualTo(2.1*2.2222*Math.PI)
    }
}