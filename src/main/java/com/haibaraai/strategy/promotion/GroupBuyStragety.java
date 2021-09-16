package com.haibaraai.strategy.promotion;

public class GroupBuyStragety implements PromotionsStrategy {

    @Override
    public void doPromotions() {
        System.out.println("组团购买");
    }
}
