package com.haibaraai.strategy.pay.payport;

import com.haibaraai.strategy.pay.MsgResult;

public class AliPay extends Payment {

    @Override
    public String getName() {
        return "AliPay";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
    
}
