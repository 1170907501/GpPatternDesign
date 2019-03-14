package com.zzh.design.factory.abstractfacotry;

import com.zzh.design.factory.simplefactory.IMilk;
import com.zzh.design.factory.simplefactory.MNMilk;

public class MNFactory implements IMilkFactory{
    @Override
    public IYogurtMilk getYogurtMilk() {
        return new MNYogurtMilk();
    }

    @Override
    public IMilk getMilk() {
        return new MNMilk();
    }
}
