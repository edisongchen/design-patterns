package com.tg.design.action.strategy.calculate.v2;

/**
 * Created by eds on 2018/5/13.
 */
public class CalculatorTest {
    public static void main(String args[]) {
        int a = 1;
        int b = 111;
        String symbol = "+";
        if ("+".equals(symbol)) {
            System.out.println(Calculator.ADD.execute(a, b));
        } else if ("-".equals(symbol)) {
            System.out.println(Calculator.SUB.execute(a, b));
        }
    }
}
