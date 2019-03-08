package com.zzh.design.abstractfacotry;

import com.zzh.design.simplefactory.IMilk;
import com.zzh.design.simplefactory.MNMilk;

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
