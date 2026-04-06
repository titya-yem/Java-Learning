package com.titya;

public class TaxReport {
    private TaxCalculator calculator;

//    public TaxReport (TaxCalculator calculator) {
//        this.calculator = calculator; // constructor injection
//    }
//
//    public void setCalculator(TaxCalculator calculator) {
//        this.calculator = calculator; // setter injection
//    }

    public void show (TaxCalculator calculator) {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
