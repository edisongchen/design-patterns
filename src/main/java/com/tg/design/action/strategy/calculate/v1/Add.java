package com.tg.design.action.strategy.calculate.v1;

/**
 * Created by eds on 2018/5/13.
 */
public class Add implements Calculator {
    public int execute(int a, int b) {
        return a+b;
    }
}
