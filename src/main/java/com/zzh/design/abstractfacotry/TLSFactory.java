package com.zzh.design.abstractfacotry;

import com.zzh.design.simplefactory.IMilk;
import com.zzh.design.simplefactory.TLSMilk;

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
