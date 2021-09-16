package com.haibaraai.strategy.promotion;

public class EmptyStrategy implements PromotionsStrategy {

    @Override
    public void doPromotions() {
        System.out.println("没有优惠");
    }
}
