package com.zzh.design.factory.factorymethod;

import com.zzh.design.factory.simplefactory.IMilk;
import com.zzh.design.factory.simplefactory.TLSMilk;

public class TLSFactory implements IMilkFactory{
    @Override
    public IMilk getMilk() {
        return new TLSMilk();
    }
}
