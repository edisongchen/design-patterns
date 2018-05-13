package com.tg.design.action.strategy.calculate.v1;

import java.util.Optional;

/**
 * Created by eds on 2018/5/13.
 */
public class CalculateTest {

    public static void main(String args[]) {
        test1();


    }

    private static void test1(){
        int a = 1;
        int b = 111;
        Context context = null;
        String symbol = "+";
        if ("+".equals(symbol)) {
            context = new Context(new Add());
        } else if ("-".equals(symbol)) {
            context = new Context(new Sub());
        }
        if (context != null) {
            System.out.println(context.execute(a, b));
        }
    }
}
