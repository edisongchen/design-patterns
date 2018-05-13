package com.tg.design.action.strategy;

/**
 * Created by eds on 2018/5/13.
 */
public class ConcreteStrategy2 implements Strategy {

    public void doSomething() {
        System.out.println(getClass().getSimpleName() + " doSomething");
    }
}
