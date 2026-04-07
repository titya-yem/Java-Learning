package com.titya;

public interface TaxCalculator { // interface
    // interface is declared method only not logic code.
    // it is like hpp (c++ header), it holds only method declaration

//    float minimunTax = 100; // if declared field, it cannot be changed
    double calculateTax(); // only method

//    static double getTaxableIncome (double income, double expenses) {
//        return income - expenses;
//    } should not be like this
}
