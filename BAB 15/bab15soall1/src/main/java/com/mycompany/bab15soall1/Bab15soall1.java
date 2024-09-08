package com.mycompany.calculatorapp;

import kalkulatorpack.Calculator;

/**
 * Main class to test the Calculator operations.
 */
public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int additionResult = calculator.add(10, 5);
        System.out.println("Hasil Pertambahan: " + additionResult);

        int subtractionResult = calculator.subtract(10, 5);
        System.out.println("Hasil Pengurangan: " + subtractionResult);

        float multiplicationResult = calculator.multiply(10, 5);
        System.out.println("Hasil Perkalian: " + multiplicationResult);

        float divisionResult = calculator.divide(10, 5);
        System.out.println("Hasil Pembagian: " + divisionResult);
    }
}
