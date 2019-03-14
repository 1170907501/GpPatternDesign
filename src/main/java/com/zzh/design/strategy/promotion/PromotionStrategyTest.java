package com.zzh.design.strategy.promotion;

import com.sun.deploy.util.StringUtils;

public class PromotionStrategyTest {


    public static void main(String[] args) {
       /* PromotionStrategy strategyA = new PromotionStrategy(new CashBackPromotion());
        strategyA.execute();*/

        String date = "2019-12-11";
        IPromotion promotion = null;
        if("2019-06-18".equals(date)){
            promotion = new CashBackPromotion();
        }else if("2019-11-11".equals(date)){
            promotion = new CouponPromotion();
        }else{
            promotion = new EmptyPromotion();
        }
        PromotionStrategy promotionStrategy = new PromotionStrategy(promotion);
        promotionStrategy.execute();


        //工厂模式 + 单例模式 + 策略模式
        PromotionStrategy promotionStrategy1 = PromotionStrategyFactory.getPromotionStrategy("CASHBACK");
        promotionStrategy1.execute();

    }

}
