package com.tg.design.action.strategy.calculate.v2;

/**
 * 策略枚举 是一个比较有意思的结构
 */
public enum Calculator {

    ADD("+") {
        @Override
        public int execute(int a, int b) {
            return a + b;
        }
    },
    SUB("-") {
        @Override
        public int execute(int a, int b) {
            return a - b;
        }
    };

    public abstract int execute(int a, int b);

    String value = "";

    public String getValue() {
        return this.value;
    }

    private Calculator(String value) {
        this.value = value;
    }
}
