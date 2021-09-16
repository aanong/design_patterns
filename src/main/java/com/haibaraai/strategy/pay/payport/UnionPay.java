package com.haibaraai.strategy.pay.payport;

public class UnionPay extends Payment {

    @Override
    public String getName() {
        return "UnionPay";
    }

    @Override
    protected double queryBalance(String uid) {
        return 1000;
    }
}
