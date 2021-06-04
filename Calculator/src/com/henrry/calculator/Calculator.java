package com.henrry.calculator;

public class Calculator {
    private double operandOne;
    private String operation;
    private double operandTwo;
    private double result;

    public Calculator() {
    }

    public Calculator(double operandOne, String operation, double operandTwo) {
        this.operandOne = operandOne;
        this.operation = operation;
        this.operandTwo = operandTwo;
    }

    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public double getResult() {
        return performOperation();
    }

    public double performOperation() {
        if(operation.equalsIgnoreCase("+")) {
            result = operandOne + operandTwo;
        }
        return result;
    }

}
