package com.zzh.design.factory.simplefactory;

/**
 * 蒙牛牛奶
 */
public class MNMilk implements IMilk{

    @Override
    public void createMilk() {
        System.out.println("生产蒙牛牛奶");
    }
}
