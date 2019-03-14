package com.zzh.design.strategy.promotion;

import com.zzh.design.proxy.IPerson;

public class EmptyPromotion implements IPromotion{
    @Override
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
