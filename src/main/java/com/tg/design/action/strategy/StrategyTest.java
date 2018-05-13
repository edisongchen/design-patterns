package com.tg.design.action.strategy;

/**
 * Created by eds on 2018/5/13.
 */
public class StrategyTest {

    public static void main(String args[]) {
        Strategy strategy = new ConcreteStrategy1();
        Context context = new Context(strategy);
        context.doAnyThing();
    }
}
