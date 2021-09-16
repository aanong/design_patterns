package com.haibaraai.strategy.promotion;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PromotionStrategyFactory  {

    private static Map<String,PromotionsStrategy> promotionsMap = new ConcurrentHashMap<>();

    private PromotionStrategyFactory() {}

    static {
        promotionsMap.put(PromotionKey.COUPON,new CouponStrategy());

        promotionsMap.put(PromotionKey.CASHBACK,new CashBackStrategy());

        promotionsMap.put(PromotionKey.GROUPBUY,new GroupBuyStragety());

    }

    //
    public static PromotionsStrategy getPromotionsStrategy(String strategyKey){

        PromotionsStrategy promotionsStrategy = promotionsMap.get(strategyKey);
        if(promotionsStrategy==null){return new EmptyStrategy();}
        return promotionsStrategy;
    }

    private interface PromotionKey{
        String COUPON = "Coupon";

        String GROUPBUY = "GroupBuy";

        String CASHBACK = "CashBack";

    }



}
