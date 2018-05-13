package com.tg.design.action.strategy.calculate.v1;

/**
 * Created by eds on 2018/5/13.
 */
public class Context {
    private Calculator calculator;

    public Context(Calculator calculator) {
        this.calculator = calculator;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public int execute(int a, int b) {
        return calculator.execute(a, b);
    }
}
