package com.haibaraai.strategy.pay.payport;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 支付策略
 */
public class PayStrategy {

    private PayStrategy(){}

    private static Map<String,Payment> paymentMap = new ConcurrentHashMap<>();

    static {
        paymentMap.put(PayKey.ALIPAY,new AliPay());
        paymentMap.put(PayKey.JDPAY,new JDPay());
        paymentMap.put(PayKey.UNIONPAY,new UnionPay());
        paymentMap.put(PayKey.WechatPay,new WechatPay());
    }

    public static Payment getPayMent(String payMentKey){
        Payment payment = paymentMap.get(payMentKey);
        if(payment==null){
            return new AliPay();
        }

        return paymentMap.get(payMentKey);
    }


    interface PayKey{
        String ALIPAY = "AliPay";

        String JDPAY = "JDPay";

        String UNIONPAY = "UnionPay";

        String WechatPay = "WechatPay";

    }
}
