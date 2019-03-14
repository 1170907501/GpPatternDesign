package com.zzh.design.factory.factorymethod;

import com.zzh.design.factory.simplefactory.IMilk;
import com.zzh.design.factory.simplefactory.MNMilk;

public class MNFactory implements IMilkFactory{
    @Override
    public IMilk getMilk() {
        return new MNMilk();
    }
}
