package com.zzh.design.factory.abstractfacotry;

public class MainClass {

    public static void main(String[] args) {
        IMilkFactory mnFactory = new MNFactory();

        mnFactory.getMilk().createMilk();
        mnFactory.getYogurtMilk().creatYogurtMilk();

        IMilkFactory tlsFactory = new TLSFactory();

        tlsFactory.getMilk().createMilk();
        tlsFactory.getYogurtMilk().creatYogurtMilk();
    }
}
