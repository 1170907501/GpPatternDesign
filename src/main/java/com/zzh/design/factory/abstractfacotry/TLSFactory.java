package com.zzh.design.factory.abstractfacotry;

import com.zzh.design.factory.simplefactory.IMilk;
import com.zzh.design.factory.simplefactory.TLSMilk;

public class TLSFactory implements IMilkFactory {
    @Override
    public IYogurtMilk getYogurtMilk() {
        return new TLSYogurtMilk();
    }

    @Override
    public IMilk getMilk() {
        return new TLSMilk();
    }
}
