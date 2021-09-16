package com.haibaraai.strategy.promotion;

public class CashBackStrategy implements PromotionsStrategy {
    @Override
    public void doPromotions() {
        System.out.println("返现活动");
    }
}
