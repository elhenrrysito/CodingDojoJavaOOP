package com.henrry.calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10.5, "+", 5.2);
        double resutlado = calculator.getResult();
        System.out.println(resutlado);
    }
}
