package com.haibaraai.strategy.pay;

public class Order {

    private String orderId;

    private String uId;

    private double amount;


    public Order(String orderId, String uId, double amount) {
        this.orderId = orderId;
        this.uId = uId;
        this.amount = amount;
    }
}
