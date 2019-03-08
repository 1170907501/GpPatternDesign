package com.zzh.design.factorymethod;

import com.zzh.design.simplefactory.IMilk;
import com.zzh.design.simplefactory.MNMilk;

public class MNFactory implements IMilkFactory{
    @Override
    public IMilk getMilk() {
        return new MNMilk();
    }
}
