package com.haibaraai.strategy.promotion;

public class CouponStrategy implements PromotionsStrategy {

    @Override
    public void doPromotions() {
        System.out.println("优惠卷");
    }
}
