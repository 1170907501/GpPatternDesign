package com.zzh.design.factory.simplefactory;

/**
 * 特仑苏牛奶
 */
public class TLSMilk implements IMilk{
    @Override
    public void createMilk() {
        System.out.println("生产特仑苏牛奶");
    }
}
