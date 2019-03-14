package com.zzh.design.strategy.promotion;

public class CashBackPromotion implements IPromotion{
    @Override
    public void doPromotion() {
        System.out.println("返现200元");
    }
}
