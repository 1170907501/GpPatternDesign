package com.zzh.design.abstractfacotry;

public class TLSYogurtMilk implements IYogurtMilk{
    @Override
    public void creatYogurtMilk() {
        System.out.println("生产特仑苏酸奶");
    }
}
