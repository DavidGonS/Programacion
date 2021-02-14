package org.iesfm.Calculator;

import org.iesfm.Calculator.Exceptions.CalculatorException;

public class Calculator implements ICalculator {
    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    @Override
    public double substract(double a, double b) {
        return a - b;
    }

    @Override
    public double div(double a, double b) {
        return a / b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double neg(double a) {
        return -a;
    }

    @Override
    public int factorial(int a) throws CalculatorException {
        if (a <= 0) {
            throw new CalculatorException();
        } else {
            int result = 1;
            for (int i = 1; i <= a; i++) {
                result = result * i;
            }
            return result;
        }
    }
}
