package com.titya;

public class TaxReport {
    private TaxCalculator calculator;

    public TaxReport (TaxCalculator calculator) {
        this.calculator = calculator; // constructor injection
    }

    public void show () {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
