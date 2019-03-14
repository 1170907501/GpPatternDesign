package com.zzh.design.factory.abstractfacotry;

public class MNYogurtMilk implements IYogurtMilk{
    @Override
    public void creatYogurtMilk() {
        System.out.println("生产蒙牛酸奶");
    }
}
