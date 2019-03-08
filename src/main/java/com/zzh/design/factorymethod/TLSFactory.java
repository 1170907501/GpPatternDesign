package com.zzh.design.factorymethod;

import com.zzh.design.simplefactory.IMilk;
import com.zzh.design.simplefactory.TLSMilk;

public class TLSFactory implements IMilkFactory{
    @Override
    public IMilk getMilk() {
        return new TLSMilk();
    }
}
