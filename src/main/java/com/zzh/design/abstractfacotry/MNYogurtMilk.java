package com.zzh.design.abstractfacotry;

public class MNYogurtMilk implements IYogurtMilk{
    @Override
    public void creatYogurtMilk() {
        System.out.println("生产蒙牛酸奶");
    }
}
