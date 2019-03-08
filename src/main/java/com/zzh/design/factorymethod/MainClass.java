package com.zzh.design.factorymethod;

public class MainClass {
    public static void main(String[] args) {
        /**
         * 把简单工厂里面的判断逻辑推迟到客户端，即把加载具体类的初始化推迟到使用阶段
         */
        System.out.println("####客户要蒙牛牛奶######");
        IMilkFactory mnFactory = new MNFactory();
        mnFactory.getMilk().createMilk();

        System.out.println("#######客户要特仑苏牛奶#####");
        IMilkFactory tlsFactory = new TLSFactory();
        tlsFactory.getMilk().createMilk();
    }
}
