package com.zzh.design.simplefactory;

/**
 * 蒙牛牛奶
 */
public class MNMilk implements IMilk{

    @Override
    public void createMilk() {
        System.out.println("生产蒙牛牛奶");
    }
}
