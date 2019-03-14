package com.zzh.design.factory.simplefactory;

public class MainClass {
    public static void main(String[] args) {
        IMilk milk;
        MilkFactory factory = new MilkFactory();
        milk = factory.getMilk("MNMilk");
        milk.createMilk();
    }
}
