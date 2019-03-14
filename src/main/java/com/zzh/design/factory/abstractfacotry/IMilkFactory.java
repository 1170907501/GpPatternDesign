package com.zzh.design.factory.abstractfacotry;

import com.zzh.design.factory.simplefactory.IMilk;

public interface IMilkFactory {
    /**
     *  大厂标准，定义了一系列产品族
     */
    //生产酸奶产品
    public IYogurtMilk getYogurtMilk();
    //生产牛奶
    public IMilk getMilk();
}
