package com.zzh.design.strategy.promotion;

public class CouponPromotion implements IPromotion{
    @Override
    public void doPromotion() {
        System.out.println("团购优惠9折");
    }
}
