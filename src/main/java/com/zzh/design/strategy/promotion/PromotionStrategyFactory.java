package com.zzh.design.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {

    //工厂模式
    //把if...else...逻辑提取出来

    private static Map<String,PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<String, PromotionStrategy>();
    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.COUPON,new PromotionStrategy(new CouponPromotion()));
        PROMOTION_STRATEGY_MAP.put(PromotionKey.CASHBACK,new PromotionStrategy(new CashBackPromotion()));
    }

    private static final PromotionStrategy NON_PROMOTION = new PromotionStrategy(new EmptyPromotion());

    private PromotionStrategyFactory(){}

    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
    }

    private interface PromotionKey{
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
    }

}
