package com.haibaraai.strategy.pay;

import com.haibaraai.strategy.pay.payport.PayStrategy;
import com.haibaraai.strategy.pay.payport.Payment;

public class PayStrategyTest {
    public static void main(String[] args) {
        Payment wechatPay = PayStrategy.getPayMent("AliPay");

        MsgResult pay = wechatPay.pay("", 120);
        System.out.println(pay.toString());
    }
}
