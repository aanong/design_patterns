package com.haibaraai.strategy.pay.payport;

public class WechatPay extends Payment {

    @Override
    public String getName() {
        return "WechatPay";
    }

    @Override
    protected double queryBalance(String uid) {
        return 20;
    }
}
