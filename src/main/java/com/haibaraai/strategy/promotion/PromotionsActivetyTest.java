package com.haibaraai.strategy.promotion;

public class PromotionsActivetyTest {

    public static void main(String[] args) {
        PromotionsStrategy conpon = PromotionStrategyFactory.getPromotionsStrategy("CashBack");

        PromotionsActivety promotionsActivety = new PromotionsActivety(conpon);
        promotionsActivety.execute();


    }
}
