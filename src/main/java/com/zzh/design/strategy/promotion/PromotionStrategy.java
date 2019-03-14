package com.zzh.design.strategy.promotion;

public class PromotionStrategy {
    private IPromotion promotion;

    public PromotionStrategy(IPromotion promotion){
        this.promotion = promotion;
    }
    public void execute(){
        promotion.doPromotion();
    }
}
