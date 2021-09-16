package com.haibaraai.strategy.promotion;

public class PromotionsActivety {

    private PromotionsStrategy promotionsStrategy;

    public PromotionsActivety(PromotionsStrategy promotionsStrategy){
        this.promotionsStrategy = promotionsStrategy;
    }

    public void execute(){
        promotionsStrategy.doPromotions();
    }
}
