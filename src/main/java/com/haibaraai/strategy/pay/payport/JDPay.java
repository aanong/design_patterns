package com.haibaraai.strategy.pay.payport;

public class JDPay extends Payment {

    @Override
    public String getName() {
        return "JDpay";
    }

    @Override
    protected double queryBalance(String uid) {
        return 900;
    }
}
