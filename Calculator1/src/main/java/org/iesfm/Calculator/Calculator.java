package org.iesfm.Calculator;

import org.iesfm.Calculator.Exceptions.CalculatorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 */

public class Calculator implements ICalculator {
    private static Logger log = LoggerFactory.getLogger(Calculator.class);

    /**
     * It sums parameter a and b
     *
     * @param a El primer sumando
     * @param b El segundo sumando
     * @return Devuelve la suma
     */
    @Override
    public double sum(double a, double b) {
        log.info("se ha calculado la suma de " + a + " y " + b);
        return a + b;
    }

    @Override
    public double substract(double a, double b) {
        return a - b;
    }

    @Override
    public double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("CAN,T DIVIDE BY ZERO");
        }else {
            return a / b;
        }
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
