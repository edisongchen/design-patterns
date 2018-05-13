package com.tg.design.action.strategy;

/**
 * Created by eds on 2018/5/13.
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //设置当前策略
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    //封装后的策略方法
    public void doAnyThing() {
        strategy.doSomething();
    }
}
