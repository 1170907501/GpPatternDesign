package com.zzh.design.singleton.hungrysingleton;

public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungryStaticSingleton;

    static{
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){}

    public static HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }
}