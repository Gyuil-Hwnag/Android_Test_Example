package com.example.example

class MyCalc : Calculations {
    private val pi = Math.PI

    override fun calculateCircumference(radius: Double): Double {
        return 2*pi*radius
    }

    override fun calculateArea(radius: Double): Double {
        return pi*radius*radius
    }
}